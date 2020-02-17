import java.io.*;
class BufferWriterDemo{
	public static void main(String[] args) {
		try{
			FileWriter fwd=new FileWriter("Buffer.txt");
			BufferedWriter bfr=new BufferedWriter(fwd);
			bfr.write("Hello There");
			bfr.newLine();
			bfr.write("General");
			bfr.flush();
			bfr.close();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Completed");
	}
}
