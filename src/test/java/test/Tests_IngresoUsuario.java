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

import common.LeerExcel;
import evidence.CrearLogyDocumento;
import pages.PageLogin;

public class Tests_IngresoUsuario {
	private WebDriver driver;
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
	public void Script_0026() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0026
		String cp = "DEC_0026";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.LoginCorrecto(cp, "236578967", "passIncorrecta");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0027() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0027
		String cp = "DEC_0027";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.LoginRutIncorrecto(cp, "19", "passCorrecta");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0028() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0028
		String cp = "DEC_0028";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.LoginRutIncorrecto(cp, "19", "passIncorrecta");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0032() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0032
		String cp = "DEC_0032";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		
		LeerExcel leerExcel = new LeerExcel();
		String[] credenciales = leerExcel.LeerArchivoExcel();
		
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.LoginCorrecto(cp, credenciales[0], credenciales[1]);
		
		System.out.println("FLUJO OK");
	}
	
	@AfterMethod
	public void FinEjecucion() {
		driver.close();
	}
}
