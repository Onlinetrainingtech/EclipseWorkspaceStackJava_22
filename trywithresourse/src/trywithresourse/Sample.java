package trywithresourse;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample 
{
    void writeData() throws IOException
    {
    	try(FileOutputStream fos=new FileOutputStream("D:\\abc1.txt"))
		{
			
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			System.out.println("Please check the location..");
		}
    }
	public static void main(String[] args) throws IOException {
		
		
		Sample s1=new Sample();
		s1.writeData();

	}

}
