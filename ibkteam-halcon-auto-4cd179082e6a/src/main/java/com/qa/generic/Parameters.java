package com.qa.generic;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;

public class Parameters{


	// -------------------- TIEMPOS DE ESPERA -------------------------
	public static final long timeExplicitWait=10000;
	public static final long sTimeStep = 7000;
	public static final long sTimeAccion = 3000;
	public static final long sTimePreLoad = 3000;
	public static final long sTimeLoadInicio = 3000;
	public static final long sTimeLoadFinal = 7000;

	
	// ------------------- RUTAS --------------------------------------
	public static final String RutaEvidencia = "/evidencias/";
	public static String RutaEvidenciaActual = "";


	// --------------------AMBIENTES DE PRUEBA-------------------------------
	//el ambiente se obtiene en tiempo de ejecución del src/test/resources/serenity.conf
	//usando el método getEnviroment() de base BasePage

	// -------------------- URL DE PRODUCTOS BAJO PRUEBA--------------------------------

	public static final String CuentaSimple = "/solicitar/cuenta/simple/inicio";
	public static final String CuentaMillonariaPremio = "/solicitar/cuenta/millonaria-premio/inicio";
	public static final String CuentaMillonariaTasa = "/solicitar/cuenta/millonaria-tasa/inicio";
	public static final String CuentaSueldo= "/solicitar/cuenta/sueldo-dependiente/inicio";
	public static final String prestamoPersonal= "/solicitar/prestamov2/efectivo/inicio";
	public static final String tarjetaCredito= "/solicitar/tarjeta/credito/inicio";
	public static final String convenios= "/solicitar/prestamo/convenio/inicio";
	public static final String activacionTc="/solicitar/tarjeta/activacion-tc/inicio";
	public static final String cajaSorpresa="/caja-de-sorpresas/inicio";
	public static final String extraCash="/solicitar/tarjeta/extracash/inicio";
	public static final String abonoCTS= "/solicitar/abono/cts/inicio";
	public static final String ILinea= "/solicitar/tarjeta/incremento-de-linea/inicio";
	public static final String ActivacionCtaSueldoCts= "/solicitar/activar/cuenta-sueldo/inicio";
	public static final String AdicionalesTC= "/solicitar/tarjeta/adicional/inicio";

	public static final String ReproEmpresas= "/solicitar/reprogramacion/mype/inicio";

	//-------------------- MENSAJES DE ERROR -----------------------------

	//-------------------- MENSAJES DE DERIVACION -----------------------------

	public static final String sUrl_CUENTA_PRODUCTO_TC = "/cuenta-producto-tc";
	public static final String sUrl_SOLO_BPI = "/solo-bpi";

	//-----------------EQUIFAX QUESTIONS------------------------------
	public static final String QUESTION_ONE="¿Tiene ruc?";//¿Tiene ruc?
	public static final String QUESTION_TWO="¿Tiene o ha tenido un crédito para micro o pequeña empresa (entre octubre-2021 y diciembre-2021)?";//
	public static final String QUESTION_THREE="¿Su ruc está activo?";//
	public static final String QUESTION_FOUR="¿Tiene alguna deuda con la sunat?";


}
