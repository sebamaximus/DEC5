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

import evidence.CrearLogyDocumento;
import pages.PageIngresoDatosPersonales;
import pages.PageRegistrarme;


public class Tests_RegistroUsuario_DatosPersonales {
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
	public void Script_0004() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0004
		String cp = "DEC_0004";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"#$%%$12323","Gonzalez","CL","18092588-0","34534534");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0005() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0005
		String cp = "DEC_0005";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"Claudio","#$%%$12323","CL","18092588-0","34534534");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0006() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0006
		String cp = "DEC_0006";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"Claudio","Bravo","CL","18092588","34534534");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0007() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0007
		String cp = "DEC_0007";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"Claudio","Bravo","CL","18092588-0","12");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0008() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0008
		String cp = "DEC_0008";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"Claudio","Bravo","CL","18092588-0","123.123.123");
		
		System.out.println("FLUJO OK");
	}
	
	@Test
	public void Script_0009() throws InterruptedException, IOException, InvalidFormatException {
//		DEC_0009
		String cp = "DEC_0009";
		System.out.println(cp);
		
		CrearLogyDocumento crearLogyDocumento = new CrearLogyDocumento(driver);
		crearLogyDocumento.CrearEvidencias(cp);
		PageRegistrarme pageRegistrarme = new PageRegistrarme(driver);
		pageRegistrarme.Registrarme(cp);
		
		PageIngresoDatosPersonales pageIngresoDatosPersonales = new PageIngresoDatosPersonales(driver);
		pageIngresoDatosPersonales.IngresoDatosPersonales(cp,"","","","","");
		
		System.out.println("FLUJO OK");
	}
	
	@AfterMethod
	public void FinEjecucion() {
		driver.close();
	}
}
