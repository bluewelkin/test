import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;


public class JFrameDemo01 {
	public static void main(String args[]){
		JFrame f=new JFrame("第一个swing窗口");
		f.setSize(230,150);
		f.setBackground(Color.red);
		f.setLocation(300,200);
		f.setVisible(true);
		Point p=new Point(300,200);
		f.setLocation(p);
		f.setVisible(true);
	}

}
