package rjht.day10;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 14:48
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Person {
    final String name;
    final int age = 20;
    String work;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    Person(){
        this.name="李四";
    }


    public void work1(){
        System.out.println("这是一个方法");
    }

    public final void work2(){
        System.out.println("父类特有的方法");
    }
}
