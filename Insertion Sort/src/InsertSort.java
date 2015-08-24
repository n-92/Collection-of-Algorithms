/*Code for Insertion Sort 
 * 
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] randomNum = {22,33,44,11,100,1000,876,45,22,3,1};
		
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
	
		for (int x = 0; x < randomNum.length; x++){
			System.out.print(randomNum[x]+"\t");
		}
	}
	
	
}
