import java.io.*;
public class _25_3{
public static void main(String[] args){
String sizeStr;
String fileName;
if(args.length > 1)
sizeStr = args[1];
else
sizeStr = "3000";
if(args.length > 0)
fileName = args[0];
else
fileName = "NewFile.doc";
long size = 0;
try{
size = Long.parseLong(sizeStr);
}
catch(NumberFormatException e){}
try{
//*********Found********

RandomAccessFile raf = new RandomAccessFile(fileName,"rw");
//*********Found********
raf.setLength(size);
raf.close();
}
catch(IOException e){}
}
}
