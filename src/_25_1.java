import javax.swing.JOptionPane;
public class _25_1{
public static void main( String args[] ){
String s1, s2, s3, s4, output;
s1 = new String( "����!" );
s2 = new String( "�ټ�!" );
//*********Found********
s3 = new String( "���տ���" );
s4 = new String( "ף������!" );
output = "s1 = " + s1 + "\ns2 = " + s2 +
"\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
//��equals()�����Ƚ��������������Ƿ���ͬ
if ( s1.equals( "����!" ) )
output += "s1�������� \"����!\"\n";
else
output += "s1 ���� \"����!\"\n";
//��==������Ƚ��ַ�������ָ���ڴ��ַ��ͬ��
if ( s1 == "����!" )
output += "s1 ���õ�ַͬ�� \"����!\"\n";
else
output += "s1 ���õ�ַ��ͬ�� \"����!\"\n";
//��equalsIgnorecase()�����Ƚ��ַ�������
if ( s3.equalsIgnoreCase( s4 ) )
output += "s3 ����ͬ�� s4\n";
else
output += "s3 ����ͬ�� s4\n";
//��compareTo()�����Ƚ��ַ���ֵ�Ĵ�С
output +=
"\ns1.compareTo( s2 ) is " + s1.compareTo( s2 ) +
"\ns2.compareTo( s1 ) is " + s2.compareTo( s1 ) +
"\ns1.compareTo( s1 ) is " + s1.compareTo( s1 ) +
"\ns3.compareTo( s4 ) is " + s3.compareTo( s4 ) +
"\ns4.compareTo( s3 ) is " + s4.compareTo( s3 ) +
"\n\n";
//��regionMatches (case sensitive)�����Ƚ϶��󲿷�����
if ( s3.regionMatches( 0, s4, 0, 5 ) )
output += "s3 �� s4 ǰ5���ַ�ƥ��\n";
else
output +=
"s3 �� s4 ǰ5���ַ���ƥ��\n";
//��regionMatches (ignore case)�����Ƚ϶��󲿷�����(��������ĸ��Сд)
if ( s3.regionMatches( true, 0, s4, 0, 5 ) )
output += "s3 �� s4 ǰ5���ַ�ƥ��";
else
output += "s3 �� s4 ǰ5���ַ���ƥ��";
JOptionPane.showMessageDialog( null, output,
"��ʾ�ַ�����Ĺ��췽��",
//*********Found********
JOptionPane.INFORMATION_MESSAGE);
System.exit( 0 );
}
}
