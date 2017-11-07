package com.fyakut;

public class Main {

    public static void main(String[] args) {
	Personel p1=new Personel("fatma","yakut",26);
        System.out.println(p1.getKimlikBilgileri());
        System.out.println(p1.toString());


        Ogrenci o1=new Ogrenci();
        System.out.println(o1.getKimlikBilgileri());//parametresiz const calısır

        Ogrenci o2=new Ogrenci("saniye","yakut",15,23);
        System.out.println(o2.getKimlikBilgileri());
        System.out.println(o2.toString());

    }
}
