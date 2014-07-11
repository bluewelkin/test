import javax.swing.JOptionPane;
public class _01_1 {
public static void main( String args[] ) {
int x, y, result;
String xVal, yVal;
xVal = JOptionPane.showInputDialog( "输入第1个整数:" );
yVal = JOptionPane.showInputDialog( "输入第2个整数:" );
//*********Found********
x = Integer.parseInt(xVal);
y = Integer.parseInt( yVal );
result = x * y;
//*********Found********
JOptionPane.showMessageDialog( null, "两个数的积: " + result );
System.exit( 0 );
}
}
