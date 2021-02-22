
package lab10uygulamasorusu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ders {
    private String ad;
    private String donem;
    private int not;
    
    public Ders(String ad,String donem,int not){
       this.ad=ad;
       this.donem=donem;
       this.not=not;
    }

    public String getAd(){
    return ad;
    }
    
    public void setAd(String ad){
        this.ad=ad;
    }
    
    public String getDonem(){
    return donem;
    }
    
    public void setDonem(String donem){
        this.donem=donem;
    }
    
    public int getNot(){
    return not;
    }
    
    public void setNot(String ad){
        this.not=not;
    }
    
    
    
 
    
     void dosyadanNoOku() throws FileNotFoundException,IOException{
     String str;
     BufferedReader Reader =new BufferedReader(new FileReader("ögr.txt"));   
     while((str=Reader.readLine())!=null){
         System.out.println(str);
     }
     Reader.close();
     }
    
     
        
        
        
        
    }
       
      
      
    
    


