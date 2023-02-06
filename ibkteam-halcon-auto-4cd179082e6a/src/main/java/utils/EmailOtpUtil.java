package utils.exceptions;

import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.io.*;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class EmailOtpUtil {

    //metodo para obtener otp con el api de google
    public static String getCodigoEmail() throws FileNotFoundException, IOException, GeneralSecurityException {

        String APPLICATION_NAME = "halcon_gmail";
        JsonFactory JSON_FACTORY = GsonFactory.getDefaultInstance();
        String USER_ID = "me";
        String codigo = null;

        List<String> SCOPES = Collections.singletonList(GmailScopes.MAIL_GOOGLE_COM);

        String CREDENTIALS_FILE_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" +
                File.separator + "resources" + File.separator + "credentials" + File.separator + "acceso.json";

        String TOKENS_DIRECTORY_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "credentials";

        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(new FileInputStream(new File(CREDENTIALS_FILE_PATH))));

        NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new File(TOKENS_DIRECTORY_PATH))).setAccessType("offline").build();

        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(9999).build();

        try {

            Gmail service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, new AuthorizationCodeInstalledApp(flow, receiver).authorize("user")).setApplicationName(APPLICATION_NAME).build();

            //ListMessagesResponse response = service.users().messages().list(USER_ID).setQ("From:Demo Sandbox Interbank <test-sandbox@demo-interbank.com>").execute();
            ListMessagesResponse response = service.users().messages().list(USER_ID).setQ("From:Raúl Huamán <autojulioraul@gmail.com>").execute();

            List<Message> messages = new ArrayList<Message>();

            while (response.getMessages() != null) {

                messages.addAll(response.getMessages());

                if (response.getNextPageToken() != null) {
                    String pageToken = response.getNextPageToken();
                    response = service.users().messages().list(USER_ID).setQ("From:Demo Sandbox Interbank <test-sandbox@demo-interbank.com>").setPageToken(pageToken).execute();
                } else {
                    break;
                }

            }

            Message message = service.users().messages().get(USER_ID, messages.get(0).getId()).execute();
            JsonPath jp = new JsonPath(message.toString());
            String cadena = jp.getString("snippet").substring(jp.getString("snippet").indexOf("Tu código de verificación es"), jp.getString("snippet").indexOf("Tu código de verificación es") + 37);
            codigo = cadena.substring(29, 37);

        } catch (Exception e) {
            System.out.println("no se encontro el email de código de verificación");
            throw new RuntimeException(e);
        }

        return codigo;

    }

    public static void main(String[] args) throws IOException, GeneralSecurityException {
        ;
        System.out.println("otp = " +getCodigoEmail());
    }

}
