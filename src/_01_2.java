//随机存取文件
import java.io.*;
public class _01_2{
//*********Found********
public static void main(String args[]) throws Exception{
long filePoint = 0 ;
String s;
RandomAccessFile file = new RandomAccessFile("D:\\javaceshu\\readandprint.java","r");
long fileLength = file.length();
while (filePoint<fileLength){
//*********Found********
s = file.readLine();
System.out.println(s);	
filePoint = file.getFilePointer();
                            }
file.close();
    } 
}
