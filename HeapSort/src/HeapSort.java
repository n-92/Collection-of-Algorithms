
public class HeapSort {
	
	/*Size of heap decreases
	 * as the heap goes bottom up..
	 * Therefore, need a variable to keep track of that
	 */
	private static int sizeOfHeap=0;
	public static void main(String[] args) {
		
		
		int[] randomNum = {22,33,44,11,100,1000,876,45,22,3,1};
		
		//buildMaxHeap(randomNum);
		heapSort(randomNum);
		for (int i=0; i<randomNum.length;i++)
			System.out.print(randomNum[i]+"\t");
		
	}
	
	/*This function makes sure that the parent node is 
	always greater than its children nodes*/
	public static void maxHeapify(int[] randomNum, int indexNum){
		
		int l = 2*indexNum;	//left child 
		int r = 2*indexNum + 1;	//right child
		int largerIndex = indexNum;
		
		//compares the left child with its parent 
		if (l<=sizeOfHeap && randomNum[l] > randomNum[largerIndex])
			largerIndex = l;
		
		
		if (r<=sizeOfHeap && randomNum[r] > randomNum[largerIndex])
			largerIndex = r;
		
		if (largerIndex != indexNum)
		{
			int temp = randomNum[indexNum];
			randomNum[indexNum] = randomNum[largerIndex];
			randomNum[largerIndex] = temp;
			maxHeapify(randomNum, largerIndex);
		}
		
	}
	
	public static void buildMaxHeap(int[] randomNum){
		sizeOfHeap = randomNum.length-1;
		for (int i = randomNum.length/2; i >=0; i--){
			maxHeapify(randomNum, i);
		}
	}
	
	public static void heapSort(int[] A){
		
		buildMaxHeap(A);
		System.out.println("Size of Heap : "+ sizeOfHeap);
		for (int i = sizeOfHeap; i>0; i--){
			int temp = A[0];
			A[0] = A[i];
			A[i] = temp;
			sizeOfHeap--;
			maxHeapify(A, 0);
		}
	}

}
