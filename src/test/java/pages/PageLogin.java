package pages;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CapturaPantalla;
import common.CrearDocEvidencia;
import common.Log;

public class PageLogin {
	private WebDriver driver;
	Log log = new Log();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	public PageLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	public void LoginCorrecto(String caso, String rut, String pass) throws InterruptedException, IOException, InvalidFormatException {
		int i=0;
		do {
			try {
				driver.findElement(By.id("id-login")).click();
				
				driver.findElement(By.id("rut")).sendKeys(rut);
				driver.findElement(By.id("password")).sendKeys(pass);
				driver.findElement(By.id("log-button")).click();
				//Corregir la toma del mensaje de advertencia
				String mensaje = driver.findElement(By.id("log-msg_error")).getText();
				if(mensaje.contains("inválido")) {
					log.modificarArchivoLog(caso, "Ingreso Datos Personales Incorrectos");
					crearDocEvidencia.modificarArchivoEvidencia(caso, "Ingreso Datos Personales Incorrectos");
					capturaPantalla.takeScreenShotTest(driver, "Ingreso_Datos_Personales_Incorrectos", caso);
				}
				else {
					log.modificarArchivoLog(caso, "Login OK");
					crearDocEvidencia.modificarArchivoEvidencia(caso, "Login OK");
					capturaPantalla.takeScreenShotTest(driver, "Login_Ok", caso);
				}
				
				i=1;
			}catch (Exception e) {
				System.out.println("No aparece alerta");
				log.modificarArchivoLog(caso, "No aparece alerta");
				crearDocEvidencia.modificarArchivoEvidencia(caso, "No aparece alerta");
				capturaPantalla.takeScreenShotTest(driver, "Login_Ok", caso);
				i=1;
			}
		}while(i==0);		
	}
	
	public void LoginRutIncorrecto(String caso, String rut, String pass) throws InterruptedException, IOException {
		int i=0;
		do {
			try {
				driver.findElement(By.id("rut")).sendKeys(rut);
				driver.findElement(By.id("password")).sendKeys(pass);
				String texto = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/section/section[2]/div[1]/div")).getText();
				if(texto.contains("inválido"))
				{
					log.modificarArchivoLog(caso, "Ingreso Rut Incorrecto");
					crearDocEvidencia.modificarArchivoEvidencia(caso, "Ingreso Rut Incorrecto");
					capturaPantalla.takeScreenShotTest(driver, "Ingreso_Rut_Incorrecto", caso);
				}
				else
				{
					log.modificarArchivoLog(caso, "Ingreso Rut Correcto");
					crearDocEvidencia.modificarArchivoEvidencia(caso, "Ingreso Rut Correcto");
					capturaPantalla.takeScreenShotTest(driver, "Ingreso_Rut_Correcto", caso);
				}
				i=1;
			}catch (Exception e) {
				System.out.println("No aparece alerta");
				log.modificarArchivoLog(caso, "No aparece alerta");
				crearDocEvidencia.modificarArchivoEvidencia(caso, "No aparece alerta");
				i=1;
			}
		}while(i==0);		
	}
}
