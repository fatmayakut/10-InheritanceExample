package com.fyakut;

public class Ogrenci  {
    private String isim;
    private  String soyad;
    private  int yas;
    private  int numaraa;

    public Ogrenci() {
        isim="henuz girilmedi";
        soyad="henuz girilmedi";
        yas=0;
        numaraa=0;
    }

    public Ogrenci(String isim, String soyad, int yas, int numaraa) {
        this.isim = isim;
        this.soyad = soyad;
        this.yas = yas;
        this.numaraa = numaraa;
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

    public int getNumaraa() {
        return numaraa;
    }

    public void setNumaraa(int numaraa) {
        if (numaraa<0)
            this.numaraa=0;
        else
            this.numaraa = numaraa;
    }
    public String getKimlikBilgileri(){
        return "kimlik bilgileri"+"isim:"+isim+"soyad:"+soyad+"yas:"+yas+"ögrencino:"+numaraa;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", numaraa=" + numaraa +
                '}';
    }
}
