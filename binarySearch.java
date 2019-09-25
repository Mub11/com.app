import java.util.Arrays;
public class binarySearch{
	public static void main(String[] args){
		int a[] = new int[] {1, 3, 4, 6, 8, 9};  
        int x1 = Arrays.binarySearch(a, 1);  
        int x2 = Arrays.binarySearch(a, 4);  
        int x3 = Arrays.binarySearch(a, 7);  
        int x4 = Arrays.binarySearch(a, 9);
		System.out.printf("x1 = %d\n",x1);
		System.out.printf("x2 = %d\n",x2);
		System.out.printf("x3 = %d\n",x3);
		System.out.printf("x4 = %d\n",x4);
	}
}