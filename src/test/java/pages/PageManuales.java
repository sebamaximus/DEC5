package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.CapturaPantalla;
import common.CrearDocEvidencia;
import common.Log;

public class PageManuales {
	private WebDriver driver;
	Log log = new Log();
	CrearDocEvidencia crearDocEvidencia = new CrearDocEvidencia();
	CapturaPantalla capturaPantalla = new CapturaPantalla();
	public PageManuales(WebDriver driver) {
		this.driver=driver;
	}
	
	public void BienvenidoDecyRegistrodeUsuarios(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[3]/a")).click();
		String texto="Click Manual Bienvenido a DEC y Registro de Usuarios";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
	
	public void ConceptosBasicosyAdministracion(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[4]/a")).click();
		String texto="Click Manual Conceptos Basicos y Administracion";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
	
	public void NavegarDec(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[5]/a")).click();
		String texto="Click Manual Navegar en DEC";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
	
	public void CrearDocumentos(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[6]/a")).click();
		String texto="Click Manual Crear Documentos";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
	
	public void OrganizarDocumentos(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[7]/a")).click();
		String texto="Click Manual Organizar Documentos";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
	
	public void ProcesaryFirmar(String caso) throws IOException, InvalidFormatException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/nav/div/ul/li[2]/div/ul/li[8]/a")).click();
		String texto="Click Manual Procesar y Firmar";
		log.modificarArchivoLog(caso,texto);
		crearDocEvidencia.modificarArchivoEvidencia(caso,texto);
		texto=texto.replace(" ","_");
		capturaPantalla.takeScreenShotTest(driver,texto, caso);
		Thread.sleep(2000);
	}
}
