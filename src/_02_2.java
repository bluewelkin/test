import java.awt.*;
import java.awt.event.*;

public class _02_2 extends Frame {

 public _02_2(String s){
  super(s);
 }

 public static void main(String args[]){ 
	 _02_2 fr = new _02_2("Testing");
  Button b=new Button("Please press me!");
//*********Found********
b.addActionListener(new HandleButton());
  fr.add(b);
  fr.setSize(500,500);
   
  fr.addWindowListener(new WindowAdapter(){
   public void windowClosing(WindowEvent e) {
    System.exit(0);

 }
  });
//*********Found********
  fr.setVisible(true);
 }
}
class HandleButton implements ActionListener{
public void actionPerformed(ActionEvent e){
 System.out.println("The button is pressed!");
}
}
