package arrays.programs;

public class PairSum {

	public static void main(String[] args) {
		// {1, 3, 6, 2, 5, 4, 3, 2, 4}; sum = 7
		int[] arr = {0,4,1,2,5,4};
		int x = 5,count=0;;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
