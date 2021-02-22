package prolabproje2_pokemonkartoyunu;
import javax.swing.ImageIcon;
public class Jigglypuff extends PokemonSınıfı{
    private int hasarPuanı=70;
    ImageIcon tut=new ImageIcon();
  //parametresiz constructor
    public Jigglypuff(){
    }   
   //parametreli constuctor
   //üst sınıftan değişken alma
    public Jigglypuff(String pokemonID,String pokemonAdi,String pokemonTip){
         super(pokemonID,pokemonAdi,pokemonTip);
    }
 
    public String getDosya(String dosya){
    return dosya; 
    }
    
    @Override
    public void hasarPuaniGöster(){
        System.out.println(this.hasarPuanı);
  } 

  //Boolean veri tipinde kartKullanildiMi bilgisi tutulmalıdır
  boolean kartKullanildiMi(){
  return true; }
  
    
}
    

