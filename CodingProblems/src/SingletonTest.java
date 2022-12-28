
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton s1= Singleton.getSingleton();
		Singleton s2= Singleton.getSingleton();
		
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		

	}
}
