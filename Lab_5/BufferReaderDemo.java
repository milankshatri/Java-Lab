import java.io.*;
class BufferReaderDemo{  
    public static void main(String args[])throws Exception{    
          FileReader fwd=new FileReader("Buffer.txt");    
          BufferedReader br=new BufferedReader(fwd);    
  
          int a;    
          while((a=br.read())!=-1){  
          System.out.print((char)a);  
          }  
          br.close();    
          fwd.close();    
    }    
}   
