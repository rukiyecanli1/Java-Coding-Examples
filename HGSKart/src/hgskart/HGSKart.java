package hgskart;
public class HGSKart {
    
    static int kartSayisi = 1;
    final int kartNumarasi;

    private String plaka;
    private int tip;
    private int bakiye;
    private int toplamOdenenPara;

    public HGSKart(String plaka, int tip) {
        kartNumarasi = kartSayisi;
        kartSayisi++;
        this.plaka = plaka;
        this.tip = tip;
        this.bakiye = 150;
        this.toplamOdenenPara = 0;
        
        }
    // araç tiplerinden alınacak ücretler
    static int tipUcreti[] = {2,4,7};

    public void bakiyeYukle(int yuklenecekMiktar)
    {
        this.bakiye += yuklenecekMiktar;
    }

    public void paraTahsil(int katEdilenKilometre)
    {
        int odenecekPara = katEdilenKilometre * tipUcreti[this.tip-1];
        this.bakiye -= odenecekPara; // tip i array indisine çevirmek için -1
        this.toplamOdenenPara += odenecekPara;
    }

    public void bilgi()
    {
        System.out.println("Plaka: "+this.plaka);
        System.out.println("Bakiye: "+this.bakiye);
    }

    static void ucretGuncelle(int aracSinifi, int ucret)
    {
        tipUcreti[aracSinifi-1] = ucret; // tip i array indisine çevirmek için -1
    }
}

  

        
        
        
        
        
       

