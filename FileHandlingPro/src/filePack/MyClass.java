package filePack;
import java.io.*;

public class MyClass {

	public static void main(String[] args) throws Exception 
	{
		//writing data
		File f=new File("demo.txt");
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Data Content");
		
		
		//reading data
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		String data=dis.readUTF();
		System.out.println(data);
	}

}
