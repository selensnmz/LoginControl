package com.hepsiburada.cart;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SepetKontrol extends Degiskenler {
	
	String ilkUrunAdi;
	String ilkUrunSaticisi;
	String ikinciUrunAdi;
	String ikinciUrunSaticisi;
	
	public void sepetKontrol(WebDriver driver,String urunAdi) throws Exception{
		
		Thread.sleep(2000);
		driver.findElement(By.id(getSepetim())).click();
		
		
		Thread.sleep(2000);
		ilkUrunAdi=driver.findElement(By.xpath(getIlkUrunXpath())).getText();
		System.out.println(ilkUrunAdi);

		
       
     
		Thread.sleep(2000);
		
		 
		 boolean urunAdiKarsilastir=ilkUrunAdi.contains(urunAdi);
		
		if (urunAdiKarsilastir==true) {
			System.out.println("Eklenen ürün ile sepetteki ürün aynı");

		}
		else {
			System.out.println("Ürünlerin sepete eklenmesi sırasında hata oluştu.");
		}
		driver.close();
	}


}
