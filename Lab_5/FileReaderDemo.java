import java.io.FileReader;
class FileReaderDemo{
	public static void main(String[] args) throws Exception{
		FileReader obj=new FileReader("Hello.txt");
		int a;
		while((a=obj.read())!=-1){
			System.out.print((char)a);
		}
	}
}
