package com.fyakut.Kalitim3;

import com.fyakut.Personel;

public class Ogernci3 extends Personel{
    private int ogrenciNo;

    public Ogernci3(String isim, String soyad, int yas, int ogrenciNo) {
        super(isim, soyad, yas);//üst sınıftan alınan değişkenleri alır
        this.ogrenciNo = ogrenciNo;//alt sınıftan alır.
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        if(ogrenciNo<0)
            this.ogrenciNo=0;
        else
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri()+"ogrenciNo:"+ogrenciNo;
    }

    @Override
    public String toString() {
        return "Ogernci3{" +
                "isim='" + getIsim()+ '\'' +
                ", soyad='" +getSoyad() + '\'' +
                ", yas=" + getYas() +"ogrenciNo=" + ogrenciNo +
                '}'+
                '}';
    }
}
