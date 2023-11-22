import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Test {
    String s;
    public Test() {
        s = "Programming Languages";
    }

    public void method1() {
        System.out.println(s);
    }

    public void method2(int n) {
        System.out.println("Int is: " + n);
    }

    private void method3() {
        System.out.println("Private method is invoked");
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Test test = new Test();
        Class cls = test.getClass();

        Constructor constructor = cls.getConstructor();
        System.out.println("The name of the constructor is: " + constructor.getName());

        System.out.println("The public methods of class are:");
       Method[] methods = cls.getMethods();
       for(Method method : methods) {
           System.out.println("Method name: " + method.getName());
       }

           System.out.println("Printing the result of method 1: ");
           Method methodCall1 = cls.getDeclaredMethod("method1");
           methodCall1.invoke(test);

           System.out.println("Printing the result of method 2: ");
           Method methodcall2 = cls.getDeclaredMethod("method2", int.class);
           methodcall2.invoke(test, 15);

       System.out.println("This should be illegal");
       try {
           Field field = cls.getDeclaredField("s");
           System.out.println(field.get(test));
       } catch (Exception e) {
           System.out.println("Yes this results in a Illegal Exception because it is private obviously");
       }


        try {
            System.out.println("Now accessible");
            Field field = cls.getDeclaredField("s");
            field.setAccessible(true);
            System.out.println(field.get(test));

            System.out.println("Print the changed value of s");
            field.set(test, "JAVA");
            methodCall1.invoke(test);

        } catch (Exception e) {
            System.out.println("Smt smt wrong");
        }

        try {
            System.out.println("Printing the result of method 3: ");
            Method methodCall3 = cls.getDeclaredMethod("method3");
            methodCall3.invoke(test);
        } catch (Exception e) {
            System.out.println("It's private!");
        }

    }
}
