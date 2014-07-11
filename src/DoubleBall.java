import java.util.ArrayList;
import java.util.Random;


public class DoubleBall {

	public static void main(String[] args) {
	ArrayList<Integer> redBalls=getBalls(1,33,6);
	ArrayList<Integer> blueBalls=getBalls(1,16,1);
	System.out.println("本期双色球中奖号码："+redBalls+":"+blueBalls);
	}
private static ArrayList<Integer> getBalls(int min,int max,int size){
	ArrayList<Integer> result=new ArrayList<Integer>();
	ArrayList<Integer> stores=new ArrayList<Integer>();
	for(int i=min;i<=max;i++){
		stores.add(i);
	}
	for(int i=0;i<size;i++){
        int index = getRandomIndex(stores.size() - i);  
        result.add(stores.get(index));  
        swapNumbers(stores, index, stores.size() - i - 1);  
	}
	return result;
}
private static int getRandomIndex(int max){
	Random random=new Random(System.currentTimeMillis());
	return random.nextInt(max);	
}
private static void swapNumbers(ArrayList<Integer> stores,int index,int last){
	int tmp=stores.get(index);
	stores.set(index, stores.get(last));
	stores.set(last, tmp);
}
}
