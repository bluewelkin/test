import java.io.*;
public class _24_2{
public static void main(String[] args) {
//*********Found********
int[] anArray = new int[10]; // ��������������10��Ԫ�ص��������顣
int i = 0;
int total=0;
try{
// ��data.dat�ж���10���������������������С�
DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\USER\\Desktop\\data.txt"));
while(in.available() != 0){
//*********Found********
anArray[i++] = in.readInt();
}
in.close();
//�����������е�10��������ӣ�������Щ���������ʾ�����
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
