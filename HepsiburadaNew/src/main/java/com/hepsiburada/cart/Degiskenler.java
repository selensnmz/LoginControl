package com.hepsiburada.cart;

public class Degiskenler {
	
	public static String sepeteEkleID="addToCart";

	public static String getSepeteEkleID() {
		return sepeteEkleID;
	}
	

	public static String digerSaticilarXpath="//*[@id=\"merchantTabTrigger\"]/a";

	public static String getDigerSaticilarXpath() {
		return digerSaticilarXpath;
	}
	
//	public static String fiyatSiralaXpath="//*[starts-with(@data-bind,'click: sortMerchantsByPrice}')]";
//
//	public static String getFiyatSiralaXpath() {
//		return fiyatSiralaXpath;
//	}

    public static String digerSepetUrunuXpath="//*[@id=\"merchant-list\"]/tbody/tr[4]/td[4]/form/button";

	public static String getDigerSepetUrunuXpath() {
		return digerSepetUrunuXpath;
	}
	
	
	public static String sepetimID="shoppingCart";

	public static String getSepetim() {
		return sepetimID;
	}
	
//	public static String sepetListesiXpath="//*[@id=\"form-item-list\"]/ul/li";
//
//	public static String getSepetListesiID() {
//		return sepetListesiXpath;
//	}
	
	public static String ilkUrunXpath="//*[@id=\"form-item-list\"]/ul/li[1]/div/div[1]/h4/a";

	public static String getIlkUrunXpath() {
		return ilkUrunXpath;
	}
	
	public static String ilkUrunSaticisiXpath="//*[@id=\"form-item-list\"]/ul/li[1]/div/div[1]/div[1]/a";

	public static String getIlkUrunSaticisiXpath() {
		return ilkUrunSaticisiXpath;
	}
	
	
	public static String ikinciUrunXpath="//*[@id=\"form-item-list\"]/ul/li[2]/div/div[1]/h4/a";

	public static String getIkinciUrunXpath() {
		return ikinciUrunXpath;
	}
	
	public static String ikinciUrunSaticisiXpath="//*[@id=\"form-item-list\"]/ul/li[2]/div/div[1]/div[1]/a";

	public static String getIkinciUrunSaticisiXpath() {
		return ikinciUrunSaticisiXpath;
	}
	
}
