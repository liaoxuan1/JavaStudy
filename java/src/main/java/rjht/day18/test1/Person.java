package rjht.day18.test1;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 15:27
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Person {
    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{"+name+","+age+"}";
    }
}
