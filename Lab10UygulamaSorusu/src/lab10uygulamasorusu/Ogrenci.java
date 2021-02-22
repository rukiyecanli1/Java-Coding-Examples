/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10uygulamasorusu;

/**
 *
 * @author User
 */
   public class Ogrenci{
    private String ad;
    private String soyAd;
    private String ogrenciNo;
    Ders dizi[]=new Ders[6];
    String dizii[]=new String [8];
 
      
    
    public Ogrenci(String ad,String soyAd,String ogrenciNo){
       this.ad=ad;
       this.soyAd=soyAd;
       this.ogrenciNo=ogrenciNo;
    }

   
    
    public String getAd(){
    return ad;
    }
    
    public void setAd(String ad){
        this.ad=ad;
    }
        
    public String getSoyAd(){
    return soyAd;
    }
    
    public void setSoyAd(String soyAd){
        this.soyAd=soyAd;
    }
    
    public String getOgrenciNo(){
    return ogrenciNo;
    }
    
    public void setOgrenciNo(String ogrenciNo){
        this.ogrenciNo=ogrenciNo;
    }
   }