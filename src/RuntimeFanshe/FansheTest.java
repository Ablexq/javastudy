package RuntimeFanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by lenovo on 2018/10/22.
 */
public class FansheTest {

    public static void main(String[] args) {


        Class<People> pClass = People.class;
        try {
            Constructor<People> constructor = pClass.getConstructor(String.class, int.class);
            People people = constructor.newInstance("Bill", 18);
            people.speak();
        } catch (Exception e) {
        }

        Student student = new Student("Bill", 18);
        try {
            //获取learnMethod对象（封装了learn方法）
            Class<? extends Student> aClass = student.getClass();
            Method method = aClass.getDeclaredMethod("learn", String.class);//方法名，实参
            //获取learn方法的参数列表并打印出来
            Class<?>[] paramClasses = method.getParameterTypes();

            for (Class<?> paramClass : paramClasses) {
                System.out.println("learn方法的参数: " + paramClass.getName());
            }

            method.setAccessible(true);
            //判断learn方法是否为private
            System.out.println(method.getName() + " is private " + Modifier.isPrivate(method.getModifiers()));
            //调用learn方法
            method.invoke(student, "Java Reflection");//method为对象的方法，student为对象，实参
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}










