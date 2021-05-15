package reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        User user = new User();
        // 1.forName
        Class c1 = Class.forName("reflection.User");
        // 2.通过对象获得
        Class c2 = user.getClass();
        // 3.类名.class获得
        Class<User> c3 = User.class;
        // 4.基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        System.out.println(c4);
        // 获得父类类型
        Class c5 = c2.getSuperclass();
        System.out.println(c5);
    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class User{
    private int id;
    private String name;
}