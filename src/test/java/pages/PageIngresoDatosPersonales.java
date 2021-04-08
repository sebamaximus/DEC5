package pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import common.CapturaPantalla;
import common.CrearDocEvidencia;
import common.Log;

public class PageIngresoDatosPersonales {
	private WebDriver driver;
	Log log = new Log();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	public PageIngresoDatosPersonales(WebDriver driver) {
		this.driver=driver;
	}
	
	public void IngresoDatosPersonales(String cp, String nombre, String apellido, String nacionalidad, String rut, String nroDocumento)
			throws IOException, InvalidFormatException, InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys(nombre);
		driver.findElement(By.id("last_name")).sendKeys(apellido);
		Select listaNacionalidad = new Select (driver.findElement(By.id("nationality")));
		listaNacionalidad.selectByValue("US");
		driver.findElement(By.id("taxpayer_id")).sendKeys(rut);
		driver.findElement(By.id("nro_documento")).sendKeys(nroDocumento);	
		log.modificarArchivoLog(cp, "Ingreso Datos Personales");
		crearDocEvidencia.modificarArchivoEvidencia(cp, "Ingreso Datos Personales");
		capturaPantalla.takeScreenShotTest(driver, "Ingreso_Datos_Personales", cp);
		driver.findElement(By.id("submit")).click();
		
	}
}
