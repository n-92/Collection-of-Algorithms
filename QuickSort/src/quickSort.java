
public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomNum = {22,33,44,11,100,1000,876,45,22,3,1};
		quickSort(randomNum, 0, randomNum.length-1);
		for (int x = 0; x < randomNum.length; x++){
			System.out.print(randomNum[x]+"\t");
		}
	}
	
	static void quickSort(int[] arr, int start, int end){
		
		int pivot_pos=0;
		if(start >=end) return;
		pivot_pos = partition(arr,start,end);
		quickSort(arr, start, pivot_pos-1);
		quickSort(arr, pivot_pos+1,end);
	}
	
	static int partition(int[] arr, int start,int end){
		int i, last_small, pivot;
		int mid = (start + end)/2;
		swap(arr,start,mid);
		pivot = arr[start];
		last_small = start;
		for (i= start+1; i<=end; i++){
			if (arr[i] < pivot)
				
				swap(arr,++last_small,i);
		}
		swap (arr,start, last_small);
		return last_small;
	}
	
	static void swap (int[] arr, int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second]= temp;
	}
}
