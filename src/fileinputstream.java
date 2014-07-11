import java.io.*;
//写进文档，然后又在显示器显示出来。
public class fileinputstream{
public static void main(String[] args) throws IOException {
DataOutputStream out = new DataOutputStream(new FileOutputStream("dest.txt"));
//定义要保存的数据数组。
double[] prices = { 19.99, 9.99, 15.99 };
//将prices中的数据以Tab键为分割符保存在文件中。
for (int i = 0; i < prices.length; i ++) {
out.writeDouble(prices[i]);
out.writeChar('\t');
}
//*********Found********
out.close();
// 创建数据输入流，将上面保存的文件再次打开并读取。
DataInputStream in = new DataInputStream(new FileInputStream("dest.txt"));
double price;
double total = 0.0;
for (int i = 0; i < prices.length; i ++) {
//*********Found********
price = in.readDouble();
in.readChar(); // 扔掉tab键
total = total + price;
}
System.out.println("For a TOTAL of: $" + total);
in.close();
}
}

