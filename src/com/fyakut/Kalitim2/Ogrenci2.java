package com.fyakut.Kalitim2;

import com.fyakut.Personel;

public class Ogrenci2 extends Personel{
    private int no;

    public Ogrenci2() {//parametresiz oğrenci nesnesi oluşturulduğunda bu atamaları yapsın
     setIsim("isim girilmedi");
     setSoyad("soyad girilmedi");
     setYas(0);
     no=0;
    }

    public Ogrenci2(String isim, String soyad, int yas, int no) {

      super(isim, soyad, yas);
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }


    public String getKimlikBilgileri(){
        return "kimlik bilgileri"+"isim:"+getIsim()+"soyad:"+getSoyad()+"yas:"+getYas()+"ögrencino:"+no;}
   /** @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri();
    }
   */
}
