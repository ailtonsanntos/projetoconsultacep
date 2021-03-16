package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConsultaCepTest {

	@Test
	public void testConsultarCep() {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\WebDriver\\Chrome\\89\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php?t");
		
		driver.findElement(By.xpath("//*[@id=\"endereco\"]")).sendKeys("26215-050");
		
		driver.findElement(By.xpath("//*[@id=\"formulario\"]/div[2]/div/div[2]/select/option[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"btn_pesquisar\"]")).click();
		
		String mensagem = driver.findElement(By.cssSelector("#resultado-DNEC > tbody > tr > td:nth-child(1)")).getText();
		
		assertEquals(mensagem, "Rua Cinco de Outubro"); 
		
		driver.close();
		
	}}
