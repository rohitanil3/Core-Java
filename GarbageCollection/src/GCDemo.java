
public class GCDemo {

	GCDemo(){
		System.out.println(this+"created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GCDemo();
		new GCDemo();
		new GCDemo();
		System.gc();

	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this+"memory freed");
	}

}
