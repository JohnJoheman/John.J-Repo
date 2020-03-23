
public class bubbleSort {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		
		for (int i=0; i < n; i++){
			for(int j=1; j < (n-1); j++) {
				if(arr[j-1] > arr[j]){
					//swap elements
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {3,50,24,47,56,84,26,34,82,17,95,35,79};
		
		System.out.println("Array Before Bubble Sort");
		for(int i=0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
			
		}
		System.out.println();
		
		bubbleSort(arr);     //Sorting array elements
		
		System.out.println("Array After Bubble Sort");
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
