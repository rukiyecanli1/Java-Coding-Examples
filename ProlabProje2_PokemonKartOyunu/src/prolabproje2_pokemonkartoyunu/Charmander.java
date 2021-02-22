package prolabproje2_pokemonkartoyunu;
public class Charmander extends PokemonSınıfı{
    private int hasarPuanı=60;
  //parametresiz constructor
    public Charmander(){
    }   
   //parametreli constuctor
   //üst sınıftan değişken alma
    public Charmander(String pokemonID,String pokemonAdi,String pokemonTip){
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
