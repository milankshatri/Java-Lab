import java.io.*;  
public class BufferedReaderDemo{  
    public static void main(String args[])throws Exception{    
          FileReader a=new FileReader("Buffer.txt");    
          BufferedReader br=new BufferedReader(a);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
}   
