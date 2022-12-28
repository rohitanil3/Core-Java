
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 100; i++) {
			if(isPrime(i)){
				System.out.println(i);
			}
			
		}

	}
	
	private static boolean isPrime(int n){
		
		if(n<2){
			return false;
			
		}
		
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0){
				return false;
			}
			
		}
		return true;
		
		
		
	}

}
