package dsAlgo;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		// reverse of array
		int StartValueIndex=0;
		int LastValueIndex=arr.length-1;
		// main logic
		
		int temp;
		//strtindex=3 endindex=3
			for(int i=StartValueIndex;StartValueIndex<LastValueIndex;StartValueIndex++,LastValueIndex--) {
				temp=arr[StartValueIndex];  //temp=3
				arr[StartValueIndex]=arr[LastValueIndex]; //start=5
				arr[LastValueIndex]=temp; // end=3 
			}

			// old 1 2 3 4 5 6 7	
			// new 765	4		321
			
			for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			}

	}

}
