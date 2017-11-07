package com.fyakut.Kalitim2;

public class Main {
    public static void main(String... args){
        Ogrenci2 o=new Ogrenci2();
        o.setYas(5);
        o.setSoyad("yakut");
        o.setIsim("fatma");
        o.setNo(32);
        System.out.println("ooo"+o.getKimlikBilgileri());
        System.out.println(o.toString());//personeldeki toString çalışır ve öğrenci numarası gelmez
        //eklemesi için öğrenci2 clasında toString ovirred edilmeli
    }
}
