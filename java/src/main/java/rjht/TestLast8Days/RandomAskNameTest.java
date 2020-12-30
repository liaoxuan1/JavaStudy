package rjht.TestLast8Days;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/12/13 16:03
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        随机点名
 */
public class RandomAskNameTest implements MethodTest {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<Person>();
        RandomAskNameTest test = new RandomAskNameTest();
        test.method(arr);
        Random random = new Random();
        int i = random.nextInt(arr.size());
        System.out.println(arr.get(i).getName()+"   "+arr.get(i).getAge());
    }
    @Override
    public void method(ArrayList<Person> arr) {
        Person person1 = new Person();
        person1.setAge(21);
        person1.setName("张三1");
        Person person2 = new Person();
        person2.setAge(22);
        person2.setName("张三2");
        Person person3 = new Person();
        person3.setAge(23);
        person3.setName("张三3");
        Person person4 = new Person();
        person4.setAge(24);
        person4.setName("张三4");
        arr.add(person1);
        arr.add(person2);
        arr.add(person3);
        arr.add(person4);
    }
}
