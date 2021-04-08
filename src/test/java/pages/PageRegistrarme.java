package pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CapturaPantalla;
import common.CrearDocEvidencia;
import common.Log;

public class PageRegistrarme {
	private WebDriver driver;
	Log log = new Log();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	public PageRegistrarme(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Registrarme(String cp) throws InterruptedException, IOException, InvalidFormatException
	{
		log.modificarArchivoLog(cp, "Clic a botón Registrame");
		crearDocEvidencia.modificarArchivoEvidencia(cp, "Clic a botón Registrame 1");
		capturaPantalla.takeScreenShotTest(driver, "Boton_Registrame1", cp);
		driver.findElement(By.xpath("//*[@id=\"root-content\"]/div/div/div[1]/button")).click();
		
		log.modificarArchivoLog(cp, "Clic a botón Registrame");
		crearDocEvidencia.modificarArchivoEvidencia(cp, "Clic a botón Registrame 2");
		capturaPantalla.takeScreenShotTest(driver, "Boton_Registrame2", cp);
		driver.findElement(By.xpath("//*[@id=\"root-content\"]/div/section[2]/form/section/button/div")).click();
	}
}
