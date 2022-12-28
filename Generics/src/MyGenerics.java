
public class MyGenerics<T> {
	
	T obj;
	
	public MyGenerics(T obj){
		this.obj=obj;
	}
	
	public void display(){
		System.out.println("type is "+obj.getClass().getName());
	}
	
	public T getObject(){
		return obj;
	}

}
