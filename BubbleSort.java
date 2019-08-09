import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		int [] nums = {1,693,88,60,20};
			int[] newArr = bubbleSort(nums);
			System.out.print(Arrays.toString(newArr));
	}	
    public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			
			
			for(int j=0;i<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
			
		}
		return arr;
	}
	
	
	
	
}