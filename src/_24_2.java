import java.io.*;
public class _24_2{
public static void main(String[] args) {
//*********Found********
int[] anArray = new int[10]; // 声明并创建包含10个元素的整型数组。
int i = 0;
int total=0;
try{
// 从data.dat中读出10个整数，放在整型数组中。
DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\data.txt"));
while(in.available() != 0){
//*********Found********
anArray[i++] = in.readInt();
}
in.close();
//将整型数组中的10个整数相加，并将这些数及其和显示输出。
System.out.print("Numbers: ");
for( i = 0; i < anArray.length; i++){
total = total+anArray[i];
if( i<anArray.length - 1 ){
System.out.print(anArray[i]);
System.out.print(',');
}
else{
System.out.println(anArray[i]);
}
}
System.out.println("Total: "+total);
}catch(IOException e1){}
}
}
