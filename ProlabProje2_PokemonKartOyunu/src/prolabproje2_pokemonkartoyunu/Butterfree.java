package prolabproje2_pokemonkartoyunu;
public class Butterfree extends PokemonSınıfı{
    private int hasarPuanı=10;
  //parametresiz constructor
    public Butterfree(){
    }   
   //parametreli constuctor
   //üst sınıftan değişken alma
    public Butterfree(String pokemonID,String pokemonAdi,String pokemonTip){
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
    

