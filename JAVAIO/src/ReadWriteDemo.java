import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub/
		FileInputStream fis=new FileInputStream("D://Rohit/Core_Java/img.jpg");
		FileOutputStream fos=new FileOutputStream("D://Rohit/Core_Java/newimg.jpg");
		
		int i;
		while((i=fis.read())!= -1){
			fos.write(i);
			
		}
		
		System.out.println("completed");

	}

}
