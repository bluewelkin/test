import java.io.*;
//д���ĵ���Ȼ��������ʾ����ʾ������
public class fileinputstream{
public static void main(String[] args) throws IOException {
DataOutputStream out = new DataOutputStream(new FileOutputStream("dest.txt"));
//����Ҫ������������顣
double[] prices = { 19.99, 9.99, 15.99 };
//��prices�е�������Tab��Ϊ�ָ���������ļ��С�
for (int i = 0; i < prices.length; i ++) {
out.writeDouble(prices[i]);
out.writeChar('\t');
}
//*********Found********
out.close();
// ���������������������汣����ļ��ٴδ򿪲���ȡ��
DataInputStream in = new DataInputStream(new FileInputStream("dest.txt"));
double price;
double total = 0.0;
for (int i = 0; i < prices.length; i ++) {
//*********Found********
price = in.readDouble();
in.readChar(); // �ӵ�tab��
total = total + price;
}
System.out.println("For a TOTAL of: $" + total);
in.close();
}
}

