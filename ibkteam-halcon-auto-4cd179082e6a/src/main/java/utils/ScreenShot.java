package utils.exceptions;

import com.qa.generic.BasePage;
import com.qa.generic.Parameters;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot extends BasePage {

    public static String captureScreenshot(WebDriver driver,String folder) {
        //System.currentTimeMillis()
        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenShotPath=System.getProperty("user.dir")+folder+"/"+"evidencia_"+getCurrentDateTime()+".png";
        System.out.println(screenShotPath);
        try {
            FileHandler.copy(src, new File(screenShotPath));
        } catch (IOException e) {
            System.out.println("unable to capture screenshot"+e.getMessage());
        }
        return screenShotPath;
    }

    public static String captureScreenshot(WebDriver driver,String folder,String screenName) {
        File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenShotPath=System.getProperty("user.dir")+folder+"/"+screenName+".png";

        try {
            FileHandler.copy(src, new File(screenShotPath));
        } catch (IOException e) {
            System.out.println("unable to capture screenshot"+e.getMessage());
        }
        return screenShotPath;
    }

    public static void captureScreenshotFull(WebDriver driver,String folder) {
        //System.currentTimeMillis()
        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            String screenShotPath=System.getProperty("user.dir")+folder+"/"+"evidencia_"+getCurrentDateTime()+".png";
            ImageIO.write(screenshot.getImage(),"PNG",new File(screenShotPath));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void captureScreenshotFull(WebDriver driver,String folder,String imageName) {

        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            String screenShotPath=System.getProperty("user.dir")+folder+"/"+imageName+".png";
            ImageIO.write(screenshot.getImage(),"PNG",new File(screenShotPath));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getCurrentDateTime() {
        DateFormat customFormat=new SimpleDateFormat("HH-mm-ss_dd-MM-yyyy ");
        Date currenDate = new Date();
        return customFormat.format(currenDate);


    }

    public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath + "/" + path);
        return basePath + "/" + path;
    }

    public static void createFolder(String FolderName){
       String newFolderName=getResourcePath(FolderName);
        File f1 = new File(newFolderName);

        if (!f1.exists()){
            f1.mkdirs();
        }
        else{
            newFolderName=getResourcePath(FolderName);
            f1.mkdirs();
        }
    }

    //métodos existentes
    public void capturePantalla(String carpeta){

        File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat objSDF = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss.SSS");
        String nombreArchivo = objSDF.format(new Date());

        try {
            FileUtils.copyFile(scrFile, new File(Parameters.RutaEvidencia + carpeta.substring(0, 10) +"\\"+nombreArchivo.toString()+".png"));
        } catch (IOException e) {e.printStackTrace();
        }

    }
/*
    public void capturePantallaCompleta(String carpeta){

        double tamaño = Integer.parseInt(js.executeScript("return document.body.scrollHeight").toString());
        double tamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize().height - 190;

        int i;
        js.executeScript("window.scrollTo(0, 0);");

        for(i=0; i<(Math.ceil((tamaño/tamañoPantalla))); i++){

            if(i!=0) js.executeScript("window.scrollBy(0,"+tamañoPantalla+");");

            File scrFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            SimpleDateFormat objSDF = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss.SSS");
            String nombreArchivo = objSDF.format(new Date());

            try {
                FileUtils.copyFile(scrFile, new File(Parameters.RutaEvidencia + carpeta.substring(0, 10) +"\\"+nombreArchivo.toString()+".png"));
            } catch (IOException e) {e.printStackTrace();}
        }

//		js.executeScript("window.scrollBy(0,-"+(tamañoPantalla)+");");

    }

 */
}
