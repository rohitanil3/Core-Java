
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={1,2,3};
		int k=3;
		int sum=0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = i; j < arr.length; j++) {
				sum=sum+arr[j];
				if(sum==k)
					count++;
			}
			
		}
		System.out.println(count);

	}

}
