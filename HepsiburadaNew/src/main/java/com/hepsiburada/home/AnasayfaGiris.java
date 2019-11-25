package com.hepsiburada.home;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hepsiburada.ResponseBody;
import com.hepsiburada.cart.SepetKontrol;
import com.hepsiburada.cart.SepeteEkle;
import com.hepsiburada.searchProduct.AranacakUrun;



public class AnasayfaGiris extends Degiskenler {
	
	Boolean ürünKontrol=false;
	Boolean sepetKontrolü=false;
	
	@Test
	public void anasayfaGiris () throws Exception {
	
		
	System.setProperty(Degiskenler.getWebdriver(), Degiskenler.getDriverexe());
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hepsiburada.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//    KullaniciGirisi kullaniciGirisi=new KullaniciGirisi();
//    kullaniciGirisi.kullaniciGirisi(driver);
//    Thread.sleep(2000);
	
	
	AranacakUrun aranacakUrun=new AranacakUrun();

	
	//aranacakUrun lerden dönen değer sepete ekleme işlemine geçip geçmeyeceğime karar veriyor. True dönmesi durumunda sepete ekleme işlemi başlayacak.
	ResponseBody ürünKontrol =aranacakUrun.aranacakUrun(driver);
	
	
	
	if(ürünKontrol.isControl()==true) {
		
		SepeteEkle sepeteEkle=new SepeteEkle();
		Thread.sleep(2000);
		
		//Buradan dönen değer iki ürününde sepete eklenmesi işlemlerinin bittiğini gösteriyor. True dönerse 'Sepetim' e gidip sepet kontrol işlemine geçeceğiz.
		 ResponseBody sepetKontrolü=sepeteEkle.sepeteEkle(driver , ürünKontrol.getSearchName());
		
		if(sepetKontrolü.isControl()==true) {
			
			SepetKontrol sepetKontrol = new SepetKontrol();
			Thread.sleep(2000);
			sepetKontrol.sepetKontrol(driver,sepetKontrolü.getSearchName());
			
		}

		else {
			
			System.out.println("Ürünlerin sepete eklenmesi sırasında problem meydana geldi.");
		}
		
		
		
	}else {
		System.out.println("Açılan sayfadaki ürün ile seçilen ürün eşleşmiyor.");
	
	}

    
	
	}
}
