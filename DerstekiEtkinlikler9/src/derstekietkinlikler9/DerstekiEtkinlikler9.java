
//konsolda java  programı çalıştırma- lab11 ön çalışma
package derstekietkinlikler9;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.IO;
import java.io.*;

public class DerstekiEtkinlikler9 {
    
    
    public static void main(String[] args) throws IOException {
         String satir;
        
         BufferedReader br=null;
         BufferedWriter bw=null;
         
     //  int a;
        try{
            br=new BufferedReader(new FileReader("C:\\Users\\Desktop\\Furkan\\javauygulama\\isimler.txt"));
           // a=Integer.parseInt(args[0]);
           // System.out.println(args[0]);
            while((satir=br.readLine())!=null){
                System.out.println(satir);
            }
        }
        catch(IOException e){
           e.printStackTrace();
             
        }
        finally{
            try{
                if(br!=null)
                    br.close();
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        
        try{
         bw=new BufferedWriter(new FileWriter("C:\\Users\\Axcly\\Desktop\\javauygulama\\sonuc.txt"));
         for(int i=0;i<args.length;i++){
         System.out.println(args[i]);
         bw.write(args[i]);  //konsola girdiğimiz argumanları dosyaya yazdırır
         bw.write("\n");
         }
        }
         catch(IOException e){
                 e.printStackTrace();
                 }

bw.close();
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
    
    
}
    }