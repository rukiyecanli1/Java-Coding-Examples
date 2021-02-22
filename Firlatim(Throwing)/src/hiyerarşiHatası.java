
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hiyerarşiHatası {
    
    byte x;
    String fileName="dasdas";
    FileInputStream file;
    
    try{
    file=new FileInputStream(fileName);
    x=(byte)file.read();
    }
    catch(IOException i){
    i.printStackTtace();
}
    catch(FileNotFoundException f){
    f.printStackTrace();
   
}    
    
}
