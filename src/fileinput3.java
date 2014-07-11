import java.io.*;
public class fileinput3 {
public static void main(String[] args) {
char[] charArray = {'a','b','c','d','e','f','g','h','i'};
char c ;
try{
//*********Found********** 文件流和数据输出流有什么区别
DataOutputStream out = new DataOutputStream(
new FileOutputStream("test.dat"));
for(int i =0; i<charArray.length; i++){
out.writeChar(charArray[i]);
}
//写进了文件，又读出来。
out.close();
DataInputStream in = new DataInputStream(
//*********Found**********
new FileInputStream("test.dat"));
while(in.available() != 0){
c=in.readChar();
System.out.print(c+" ");
}
System.out.println();
//*********Found**********
in.close();
}catch(IOException e){}
}
}
