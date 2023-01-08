package arrays.programs.part2;

public class AssignmentSecondLargestInArrayExample2 {

	public static void main(String[] args) {
		//int[] arr= {2,6,1,9,8,5,9,7};
		int[] arr= {6,6,6,6};
		secondLargest(arr);
	}
	public static void secondLargest(int[] arr) {
		int l = Integer.MIN_VALUE;
		int sl = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l&&i==0)
				l=arr[i];
			else if(arr[i]>l&&l>sl) {
					sl = l;
					l=arr[i];
				
			}else if(arr[i]>sl&&arr[i]!=l) {
				sl=arr[i];
			}
				
		}
		System.out.println(sl);
	}

}
