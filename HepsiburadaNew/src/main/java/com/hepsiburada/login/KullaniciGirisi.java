package com.hepsiburada.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.hepsiburada.readData.KullaniciUrunBilgileriOkuma;

public class KullaniciGirisi extends Degiskenler {

	    public void kullaniciGirisi(WebDriver driver) throws Exception {
		
		driver.findElement(By.xpath(getGirisButonuXpath())).click();
		Thread.sleep(2000);
		driver.findElement(By.id(getGirisYapButonuID())).click();
		Thread.sleep(2000);
		
		KullaniciUrunBilgileriOkuma bilgileriOku=new KullaniciUrunBilgileriOkuma();
		driver.findElement(By.id(getKullaniciAdiID())).sendKeys(bilgileriOku.kullaniciAdi());
		Thread.sleep(2000);
		driver.findElement(By.id(getsifreID())).sendKeys(bilgileriOku.sifreOku());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(getKullGirisiYapXpath())).click();
	}
	
}
