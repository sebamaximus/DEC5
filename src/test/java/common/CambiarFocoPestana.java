package common;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

public class CambiarFocoPestana {
	private WebDriver driver;
	public CambiarFocoPestana(WebDriver driver) {
		this.driver=driver;
	}
	Log log = new Log();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	
	public String CambiarFocoManual(String caso) throws InterruptedException, IOException, InvalidFormatException {
		// Almacena el ID de la ventana original
		String originalWindow = driver.getWindowHandle();
		// Espera a la nueva ventana o pestaña
		Thread.sleep(3000);
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		String url = driver.getCurrentUrl();
		String texto = "Manual abierto en navegador";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver, texto, caso);
		driver.close();
		driver.switchTo().window(originalWindow);
		return(url);
	}
}
