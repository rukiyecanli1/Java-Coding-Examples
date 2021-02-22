package prolabproje2_pokemonkartoyunu;
public class Bulbasaur extends PokemonSınıfı{
    private int hasarPuanı=50;
  //parametresiz constructor
    public Bulbasaur(){
    }   
   //parametreli constuctor
   //üst sınıftan değişken alma
    public Bulbasaur(String pokemonID,String pokemonAdi,String pokemonTip){
          //üst sınıftan constructor çağırma ve değişken atama
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
