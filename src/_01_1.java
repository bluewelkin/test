import javax.swing.JOptionPane;
public class _01_1 {
public static void main( String args[] ) {
int x, y, result;
String xVal, yVal;
xVal = JOptionPane.showInputDialog( "�����1������:" );
yVal = JOptionPane.showInputDialog( "�����2������:" );
//*********Found********
x = Integer.parseInt(xVal);
y = Integer.parseInt( yVal );
result = x * y;
//*********Found********
JOptionPane.showMessageDialog( null, "�������Ļ�: " + result );
System.exit( 0 );
}
}
