
public class ExFor02 {

	public static void main(String[] args) {
		
		// 77~1
		int sum = 0;
		for(int i=77; i>=1;i--) {
			sum = sum + i*(78-i);
			// sum += i*(78-i)
			// 77*(78-77), 76*(78-76), 75*(78-75)		
		}
		System.out.println(sum);
		
		
	}
	
	
//	int sum = 0;
//	for(int i=77; j=1 ; i>=1 ;i--, j++) {
//		sum += i*j;
//		// sum += i*(78-i)
//		// 77*(78-77), 76*(78-76), 75*(78-75)		
//	}
//	System.out.println(sum);
	
	
}
