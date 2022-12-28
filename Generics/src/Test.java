
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyGenerics<String> m=new MyGenerics<>("Rohit");
		m.display();
		System.out.println(m.getObject());
		
		MyGenerics<Integer> n =new MyGenerics<Integer>(10);
		n.display();
		System.out.println(n.getObject());
	}

}
