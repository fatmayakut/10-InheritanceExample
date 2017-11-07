package com.fyakut;

public class Personel extends  Object{//aslında bütün sınıflar Object sınıfın alt sınıfıdır ve metotlarını miras alır.
    private String isim;
    private  String soyad;
    private  int yas;

    public Personel() {
        //personele yeni bir uye geldiğinde burda çalışır
    }

    public Personel(String isim, String soyad, int yas) {
        this.isim = isim;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0)
            this.yas=0;
        else
        this.yas = yas;
    }
public String getKimlikBilgileri(){
        return "kimlik bilgileri:"+"isim:"+isim+"soyad:"+soyad+"yas:"+yas;
}
    @Override
    public String toString() {
        return "Personel{" +
                "isim='" + isim + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
