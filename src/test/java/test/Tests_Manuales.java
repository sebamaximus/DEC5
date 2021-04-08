package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.CambiarFocoPestana;
import common.Configuration;
import common.LeerExcel;
import evidence.CrearLogyDocumento;
import pages.PageDec5;
import pages.PageLoginAdm;
import pages.PageManuales;

public class Tests_Manuales {
	private WebDriver driver;
	String datapool = Configuration.ROOT_DIR+"DataPool.xlsx";
	LeerExcel leerExcel = new LeerExcel(); 
	@BeforeMethod
	public void setUp() throws FileNotFoundException, IOException {
//		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://5cap.dec.cl/portal");// Aquí se ingresa la URL para hacer las pruebas.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void Script_0060() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0060";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.BienvenidoDecyRegistrodeUsuarios(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Bienvenidos")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0061() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0061";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.ConceptosBasicosyAdministracion(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Conceptos")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0062() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0062";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.NavegarDec(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Navegar")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0063() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0063";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.CrearDocumentos(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Crear")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0064() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0064";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.OrganizarDocumentos(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Organizar")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0065() throws InterruptedException, IOException, InvalidFormatException {
		String cp = "DEC_0065";
		System.out.println(cp);
		
		PageDec5 pageDec5 = new PageDec5(driver);
		PageLoginAdm pageLoginAdm = new PageLoginAdm(driver);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		String[] datos = leerExcel.ObtenerDatosCP(datapool,cp);
		
		pageDec5.ClickIngresarLogin(cp);
		pageLoginAdm.LoginIdentidadDigital(cp, datos[1], datos[2]);
		
		pageDec5.ClickRuedaConfiguracion(cp);
		
		PageManuales pageManuales = new PageManuales(driver);
		pageManuales.ProcesaryFirmar(cp);
		
		CambiarFocoPestana cambiarFocoPestana = new CambiarFocoPestana(driver);
		String url = cambiarFocoPestana.CambiarFocoManual(cp);
		System.out.println(url);
		
		if(url.contains("Firmar")) {
			crearLogyDocumento.CasoOk(cp);
		}
		else {
			crearLogyDocumento.CasoNok(cp);
		}
		
		System.out.println("FLUJO OK");
	}
	
	@AfterMethod
	public void FinEjecucion() {
		driver.close();
	}
}
