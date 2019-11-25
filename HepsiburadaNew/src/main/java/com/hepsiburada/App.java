package com.hepsiburada;

import com.hepsiburada.home.AnasayfaGiris;
import com.hepsiburada.home.AnasayfaKullaniciGiris;



public class App {
    public static void main( String[] args ) throws Exception
    {
  
    try {
    	AnasayfaGiris anasayfaGiris=new AnasayfaGiris();
    	anasayfaGiris.anasayfaGiris();
    
    	
     	AnasayfaKullaniciGiris anasayfaKullaniciGirisi=new AnasayfaKullaniciGiris();
     	anasayfaKullaniciGirisi.anasayfaKullaniciGiris();
		
	} catch (Exception e) {
	
		e.printStackTrace();
	}
       
    	
    }
}
