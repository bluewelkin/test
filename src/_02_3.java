import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class _02_3{
public static void main(String[] args){
ExceptTestFrame frame = new ExceptTestFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
class ExceptTestFrame extends JFrame
{
public ExceptTestFrame()
{
setTitle("ExceptTest");
Container contentPane = getContentPane();
ExceptTestPanel panel = new ExceptTestPanel();
contentPane.add(panel);
pack();
}
}
class ExceptTestPanel extends Box{
public ExceptTestPanel(){
super(BoxLayout.Y_AXIS);
group = new ButtonGroup();
/*addRadioButton("���������", newActionListener()
{
//*********Found********
public void actionPerformed(ActionEvent event)
{
//*********Found********
a[1] = 1 / (a.length - a.length);
}
});
*/
textField = new JTextField(30);
add(textField);                                                    
}
private void addRadioButton(String s, ActionListener listener)
{
JRadioButton button = new JRadioButton(s, false)
{
protected void fireActionPerformed(ActionEvent event)
{
try
{
textField.setText("No exception");
super.fireActionPerformed(event);
}
catch (Exception exception)
{
//*********Found********
textField.setText(exception.toString());
}
}
};
button.addActionListener(listener);
add(button);
group.add(button);
}
private ButtonGroup group;
private JTextField textField;
private double[] a = new double[10];
}
