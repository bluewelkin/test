import java.awt.*;
import java.applet.*;
//*********Found********
public class _25_2 extends Applet{
TextArea outputArea;
public void init()
{
setLayout(new BorderLayout());
outputArea = new TextArea();
//*********Found********
add( outputArea );
// ����0��10�Ľ׳�
for ( long i = 0; i <= 10; i++ )
outputArea.append(i + "! = " + factorial( i ) + "\n" );
}
// �õݹ鶨��׳˷���
public long factorial( long number )
{
if ( number <= 1 ) // �������
return 1;
else
return number * factorial( number - 1);
}
}
