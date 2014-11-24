
public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = new int[5];
		
		//init
		System.out.println("Init array");
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 100 + j++;
		}
		
		//print 
		System.out.println("Print array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
