package com.hepsiburada.cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hepsiburada.ResponseBody;


public class SepeteEkle extends Degiskenler {
	
	
	
	public ResponseBody sepeteEkle(WebDriver driver,String urunAdi) throws Exception{
		
		
		
		driver.findElement(By.id(getSepeteEkleID())).click();
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(getDigerSaticilarXpath())).click();
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath(getDigerSepetUrunuXpath())).click();
		
		
		
		return new ResponseBody(true, urunAdi);
		
	}

}
