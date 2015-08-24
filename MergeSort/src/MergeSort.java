
public class MergeSort {
	public static void main(String[] args) {
		int[] randomNum = {22,33,44,11,100,1000,876,45,22,3,1};
		mergeSort(randomNum);
		
	}
	
	public static void mergeSort(int[] arr){
		
		if (arr.length < 2) return;
		int mid = arr.length/2;
		int[] leftArr = new int[mid+1]; 		// the left sublist is made to contain more elements
		int[] rightArr = new int[arr.length-(mid+1)];
		
		for (int i = 0; i < leftArr.length; i++){ 
			leftArr[i] = arr[i];
			//System.out.print(leftArr[i]+"\t");
		}
		//System.out.println("Above was the contents in left list");
		for (int i = 0; i < rightArr.length; i++){
			rightArr[i] = arr[mid+1+i];
			//System.out.print(rightArr[i]+"\t");
		}
		mergeSort(leftArr);mergeSort(rightArr);
		merge(arr,leftArr,rightArr);
		
	}

	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		// TODO Auto-generated method stub
		int l, r, a;
		l = r  = a =0;
	
		while(l < leftArr.length && r < rightArr.length){
			if (leftArr[l] <= rightArr[r]){
				arr[a] = leftArr[l];
				l++; 
			}else{
				arr[a] = rightArr[r];
				r++;
			}
			a++;
		}
		
		while(l < leftArr.length){
			arr[a] = leftArr[l];
			l++; a++;
		}
		
		while(r < rightArr.length){
			arr[a] = rightArr[r];
			r++; a++;
		}
	}
	
}
