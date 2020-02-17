import java.io.FileWriter;
class FileWriterDemo
{
	public static void main(String[] args) {
		try
		{
			FileWriter f=new FileWriter("Hello.txt");
			f.write("Hello There");
			f.flush();
			f.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Task Completed");
	}
}
