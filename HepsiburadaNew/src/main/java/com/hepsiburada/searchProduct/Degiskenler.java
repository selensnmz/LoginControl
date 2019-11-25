package com.hepsiburada.searchProduct;

public class Degiskenler {
	
	
	static String ürünAraID="productSearch";

	public static String getÜrünAraID() {
		return ürünAraID;
	}
	
	
	static String aramaButonuID="buttonProductSearch";

	public static String getAramaButonuID() {
		return aramaButonuID;
	}
	
	
	static String secilenUrunXpath="//*[@class='contain-lg-3 contain-md-3 contain-sm-3 fluid with-bottom-border']/ul/li[1]";

	public static String getSecilenUrunXpath() {
		return secilenUrunXpath;
	}

   static String tiklananUrunLinki="//*[@class='contain-lg-3 contain-md-3 contain-sm-3 fluid with-bottom-border']/ul/li[1]/div/a";

   public static String getTiklananUrunLinki() {
	return tiklananUrunLinki;
    }
	
   static String tiklananUrunAdi="//*[@class='contain-lg-3 contain-md-3 contain-sm-3 fluid with-bottom-border']/ul/li[1]/div/a/div/h3";

public static String getTiklananUrunAdi() {
	return tiklananUrunAdi;
}

}
