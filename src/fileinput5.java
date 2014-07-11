import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class fileinput5 {

	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		int j;
		try{
			FileOutputStream	c=new FileOutputStream("datadgx.dat");
			DataOutputStream    out=new DataOutputStream(c);
			for(j =0; j<intArray.length; j++){
				//*********Found********
				out.writeInt(intArray[j]);
				}
			out.close();
	
			DataInputStream in=new DataInputStream(
				new FileInputStream("datadgx.dat"));
			while(in.available()!=-1)
			{
				j=in.readInt();
				System.out.println(j);
			}
			in.close();
			
			
		}
		catch(IOException e){}

	}

}
