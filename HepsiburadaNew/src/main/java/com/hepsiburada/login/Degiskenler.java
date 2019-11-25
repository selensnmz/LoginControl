package com.hepsiburada.login;

public class Degiskenler {
	
	public static String girisButonuXpath="//*[@id=\"myAccount\"]";

	public static String getGirisButonuXpath() {
		return girisButonuXpath;
	}
	
    public static String girisYapButonuID="login";

	public static String getGirisYapButonuID() {
		return girisYapButonuID;
	}
    
	public static String kullaniciAdiID="email";

	public static String getKullaniciAdiID() {
		return kullaniciAdiID;
	}
	
	public static String sifreID="password";

	public static String getsifreID() {
		return sifreID;
	}
	
	public static String kullGirisiYapXpath="//*[@id=\"form-login\"]/div[4]/button";

	public static String getKullGirisiYapXpath() {
		return kullGirisiYapXpath;
	}
	
	
}    
