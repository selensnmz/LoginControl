package com.hepsiburada.searchProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.hepsiburada.ResponseBody;
import com.hepsiburada.readData.KullaniciUrunBilgileriOkuma;


public class AranacakUrun extends Degiskenler {
	
	public ResponseBody aranacakUrun(WebDriver driver) throws Exception{
		
	   KullaniciUrunBilgileriOkuma urunAdiOku=new KullaniciUrunBilgileriOkuma();
		
	   driver.findElement(By.id(getÜrünAraID())).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id(getÜrünAraID())).sendKeys(urunAdiOku.arananUrunBilgisiOku());
	   Thread.sleep(2000);
	   driver.findElement(By.id(getAramaButonuID())).click();
	   Thread.sleep(2000);

	   
	   String urunLinki=driver.findElement(By.xpath(getTiklananUrunLinki())).getAttribute("href");
	   
	   String[] urunLinkKontrolü=urunLinki.split(".com");
	   String kullanilacakUrunLinki=urunLinkKontrolü[1];
	
	   
	   String urunAdi=driver.findElement(By.xpath(getTiklananUrunAdi())).getAttribute("title");
	   System.out.println(urunAdi);
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(getSecilenUrunXpath())).click();
	   
	   
	   String sayfaLinki=driver.getCurrentUrl();
	   String[] linkKontrolü=sayfaLinki.split(".com");
	   String kullanilacakSayfaLinki=linkKontrolü[1];

	   
	  
	   
        //Sepet için seçilen ürünün sayfasına gidilip gidilmediğinin kontrolü.Buradan true dönmesi durumunda sepeteEkleme işlemlerine geçilecek
	   if(kullanilacakSayfaLinki.equals(kullanilacakUrunLinki)) {
		   return new ResponseBody(true, urunAdi);
		   }
	return new ResponseBody(false, "");
	   
	}
	
         
}
