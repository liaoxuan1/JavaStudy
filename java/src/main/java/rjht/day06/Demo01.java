package rjht.day06;

/**
 * @Description 细节决定成败
 * @Date 2020/12/6 20:12
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        面向对象，成员变量，局部变量，private  this  get  set 方法
 */
public class Demo01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setName("张三");
        person.speak();
        System.out.println(person.getName()+"===="+person.getAge());
    }
}
