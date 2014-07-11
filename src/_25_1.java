import javax.swing.JOptionPane;
public class _25_1{
public static void main( String args[] ){
String s1, s2, s3, s4, output;
s1 = new String( "您好!" );
s2 = new String( "再见!" );
//*********Found********
s3 = new String( "生日快乐" );
s4 = new String( "祝您长寿!" );
output = "s1 = " + s1 + "\ns2 = " + s2 +
"\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
//用equals()方法比较两个对象内容是否相同
if ( s1.equals( "您好!" ) )
output += "s1的内容是 \"您好!\"\n";
else
output += "s1 不是 \"您好!\"\n";
//用==运算符比较字符串引用指向内存地址相同否
if ( s1 == "您好!" )
output += "s1 引用地址同于 \"您好!\"\n";
else
output += "s1 引用地址不同于 \"您好!\"\n";
//用equalsIgnorecase()方法比较字符串排序
if ( s3.equalsIgnoreCase( s4 ) )
output += "s3 排序同于 s4\n";
else
output += "s3 排序不同于 s4\n";
//用compareTo()方法比较字符串值的大小
output +=
"\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) +
"\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
"\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
"\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
"\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) +
"\n\n";
//用regionMatches (case sensitive)方法比较对象部分内容
if ( s3.regionMatches( 0, s4, 0, 5 ) )
output += "s3 与 s4 前5个字符匹配\n";
else
output +=
"s3 与 s4 前5个字符不匹配\n";
//用regionMatches (ignore case)方法比较对象部分内容(不区分字母大小写)
if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
output += "s3 与 s4 前5个字符匹配";
else
output += "s3 与 s4 前5个字符不匹配";
JOptionPane.showMessageDialog( null, output,
"显示字符串类的构造方法",
//*********Found********
JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
}
}
