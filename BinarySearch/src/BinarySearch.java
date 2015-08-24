import java.util.Scanner;

/*Very important:
 * Before applying Binary Search, 
 * the list needs to be sorted first 
 * using some Sorting Algorithm :D*/
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] randomNum = {22,33,44,11,100,1000,876,45,22,3,1};
		
		/*Insertion Sort	Insertion Sort	Insertion Sort	Insertion Sort	Insertion Sort*/
		int i,j,temp;
		for (i = 1; i<randomNum.length; i++)
			for (j = i; j > 0; j--){
				if (randomNum[j] < randomNum[j-1]){
					temp = randomNum[j];
					randomNum[j] = randomNum[j-1];
					randomNum[j-1] = temp;
				}
				else 
					break;
		}
		/*Insertion Sort	Insertion Sort	Insertion Sort	Insertion Sort	Insertion Sort*/
		System.out.println("Enter the number that you want to search :D--> ");
		int num = sc.nextInt();
		int index = searchBin(randomNum, 0, randomNum.length-1, num);
		System.out.println("Index is : " +index);
	
	}

	public static int searchBin(int[] arr, int start, int end, int target){
		
		if (end < start) return -1;
		else{
			int mid = (start + end )/2;
			if (target == arr[mid]) 
				return mid;
			else if (target < arr[mid])
					return searchBin(arr, start, mid-1, target);
			else
				return searchBin(arr, mid+1, end, target);
				
					
		}
	}
}
