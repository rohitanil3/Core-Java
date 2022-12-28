
public class Singleton {
	
	private static Singleton singleton=null;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getSingleton(){
		
		if(singleton==null)
		  singleton= new Singleton();
		return singleton;
	}
			


}
