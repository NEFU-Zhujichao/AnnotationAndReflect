package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> c1 = Class.forName("reflection.User");
//        User user = (User) c1.newInstance();
//        System.out.println(user);
//        Constructor<?> constructor = c1.getDeclaredConstructor(int.class, String.class);
//        User user2 = (User) constructor.newInstance(1, "hello");
//        System.out.println(user2);
//        User user3 = (User) c1.newInstance();
//        Method setName = c1.getMethod("setName", String.class);
//        setName.invoke(user3,"超");
//        System.out.println(user3.getName());
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        // 不能直接操作私有属性  关闭安全检测
        name.setAccessible(true);
        name.set(user4,"张");
        System.out.println(user4.getName());
    }
}
