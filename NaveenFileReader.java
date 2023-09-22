import java.io.FileReader;  
public class NaveenFileReader {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:/java/sample/perfiosrepo/Spring_config-Spring_context.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}   