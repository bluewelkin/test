import java.util.Scanner;
public class ÒÆÎ»1151 {
    public static void main(String[] args){
            Scanner cin=new Scanner(System.in); 
            int a,b,n,i;
            while(cin.hasNext()){
                n=cin.nextInt();
                for(i=0;i++<n;d(a,b)){
                    a=cin.nextInt();
                    b=cin.nextInt();
                }
            }
    }
    static void d(int a,int b){
        int flag=0,i;
        for(i=0;i<16;i++){
            if(a==b){flag=1;break;}
            b=(b<<1|b>>15)&0xffff;
        }
        if(flag==1)System.out.println("YES");
        else System.out.println("NO");
    }
}