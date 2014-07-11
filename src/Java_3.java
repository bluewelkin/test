import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Java_3{
private Frame f;
private MenuBar mb;
private Menu mFile;
private MenuItem mSave,mExit;
private FileDialog fd;
private String fileName;
private char ch;
private String s="";
private TextArea ta;
private MenuListener menuListener;
private FileOutputStream fos;
private OutputStreamWriter osw;
public Java_3(){
f=new Frame("���ı��༭��");
mb=new MenuBar();
//*********Found********
mFile=new Menu("�˵�");
mSave=new MenuItem("����");
mExit=new MenuItem("�˳�");
f.setMenuBar(mb);
mb.add(mFile);
mFile.add(mSave);
mFile.addSeparator();
mFile.add(mExit);
ta=new TextArea("",10,10);
f.add("Center",ta);
ta.setForeground(Color.black);
ta.addKeyListener(new KeyAdapter()
{
public void keyTyped(KeyEvent ev)
{
s+=ev.getKeyChar();
}
});
f.setSize(800,600);
f.setVisible(true);
menuListener=new MenuListener();
//*********Found********
mExit.addActionListener(menuListener);
//*********Found********
mSave.addActionListener(menuListener);
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(1); //�رմ���
}
});
}
public static void main(String args[])
{
Java_3 te=new Java_3();
}
class MenuListener implements ActionListener
{
public void actionPerformed(ActionEvent ev)
{
MenuItem i=(MenuItem)ev.getSource();
String label=i.getLabel();
//*********Found********
if (label=="�˳�") System.exit(0); //�رմ���
else if (label=="����") saveFile();
}
}
void saveFile()
{
fd=new FileDialog(f,"������Ҫ������ļ���",FileDialog.SAVE);
//*********Found********
fd.setVisible(true);
fileName=fd.getFile();
try
{
fos=new FileOutputStream(fileName);
osw=new OutputStreamWriter(fos);
System.out.println(s);
osw.write(s);
osw.flush();
osw.close();
fos.close();
}
catch(Exception e){}
}
}
