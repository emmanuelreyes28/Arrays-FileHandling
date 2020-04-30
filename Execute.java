import java.util.ArrayList;

public class Execute
{
	
	//Sums up the integers in the ArrayList 
	public static int sum(ArrayList<Integer> x){
		int sum = 0;
		for(int i = 0; i < x.size(); i++){
			sum += x.get(i);
		}
		return sum;
	}
	
	//Swaps two values in the arrayList based on index
	public static void swap(ArrayList<Integer> x, int i, int j){
		int temp = x.get(i);
		x.set(i,x.get(i));
		x.set(j, temp);
	}
	
	//Returns the position of the first occurrence of the value
	public static int getFirstPosition(ArrayList<Integer> x, int value){
		int i = 0;
		while(i < x.size()){
			//System.out.println(x.get(i));
			if(x.get(i) == value)
				return i;
			else
				i++;
		}
		return -1;
	}

}
