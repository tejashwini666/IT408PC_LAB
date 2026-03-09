import java.lang.reflect.Method;
import java.lang.annotation.*;
public class First{
   	public static void main(String[] args) throws NoSuchMethodException{
	try{
		anyMethod();
		}
	catch(Exception e){
	System.out.println(e.getMessage());
	
	}
	}
	@Bullet(str="Camlin",dbl=12.3456)
	public static void anyMethod() throws NoSuchMethodException{
		Method m=First.class.getMethod("anyMethod");
		Bullet b=m.getAnnotation(Bullet.class);
		System.out.println("String..."+b.str());
		System.out.println("Double..."+b.dbl());
	}
	
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bullet{
	String str();
	double dbl();
}
