package arrays.programs;

public class SwapAlternate {

	public static void main(String[] args) {
		int[] arr = {9,3,6,12,4,32,11};
		int size = arr.length;
		int temp=0,temp2=0;
		for(int i=0;i<size-1;i+=2) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
