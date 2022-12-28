import java.util.*;
 
public class Wrapper {
    public static void main(String args[]) throws Exception
    {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();
       
        while (true) {
        	System.out.println("1");
            m.put(r.nextInt(), "randomValue");
        }
    }
}