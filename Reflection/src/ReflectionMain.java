import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Class<?> myclass = Class.forName(Clac.class.getName());
		Constructor<?>[] constructors = myclass.getConstructors();
		System.out.println(constructors[0]);
		System.out.println(constructors[1]);
		 Object object = constructors[0].newInstance(100,100);
		 Method method = myclass.getMethod("sum", null);
		 Object invoke = method.invoke(object, null);
		 System.out.println(invoke);
		

	}

}
