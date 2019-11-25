package com.hepsiburada.readData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class KullaniciUrunBilgileriOkuma {

	public static String kullaniciAdi() throws IOException{

        File file = new File("C:\\Users\\Asus\\Desktop\\HepsiBurada\\HepsiburadaNew\\GirisBilgileri.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i=0;
        String mail = null;
        String satir = reader.readLine();
       
        while (satir!=null) {
            i++;

            if(i==1) {


                mail=satir;


            }


            satir = reader.readLine();
        }
        return mail;

    }


    public static String sifreOku() throws IOException{

        File file =new File("C:\\Users\\Asus\\Desktop\\HepsiBurada\\HepsiburadaNew\\GirisBilgileri.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i=0;
        String sifre = null;
        String satir = reader.readLine();

        while (satir!=null) {
            i++;

            if(i==2)
            {
                //  pass=reader.readLine();
                //System.out.println(pass);
                sifre=satir;
            }
            satir = reader.readLine();
        }

        return sifre;

	
}
    public static String arananUrunBilgisiOku() throws IOException{

        File file =new File("C:\\Users\\Asus\\Desktop\\HepsiBurada\\HepsiburadaNew\\GirisBilgileri.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i=0;
        String urun = null;
        String satir = reader.readLine();

        while (satir!=null) {
            i++;

            if(i==3)
            {
                //  pass=reader.readLine();
                //System.out.println(pass);
                urun=satir;
            }
            satir = reader.readLine();
        }

        return urun;

	
}
    
}