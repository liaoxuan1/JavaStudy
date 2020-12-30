package rjht.day06;

/**
 * @Description 细节决定成败
 * @Date 2020/12/6 20:13
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        private关键字：用来修饰成员变量和  成员方法

        成员变量和局部变量的区别：
        1.定义上的区别：
            成员变量：定义在类中，方法外
            局部变量：定义在方法中
        2.作用域区别：
            成员变量：作用域整个类中
            局部变量：作用于当前方法中
        3.内存位置
            成员变量：跟随对象，在堆内存中
            局部变量：跟随方法进去栈中
        4.生命周期
            成员变量：在堆内存中，对象生命周期结束，则成员变量结束
            局部变量：跟随方法在栈中执行完毕，跟着方法出栈，此时生命周期结束
        5.初始化不同
            成员变量：初始化默认右值
            局部变量：则需要手动赋值
 */

public class Person {
    private String name;
    private int age;

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

    public void speak(){
        String name = "李四";
        int age = 10;
        //System.out.println("我的名字叫"+this.name+"我今年"+this.age);
        //局部变量
        System.out.println("我的名字叫"+name+"我今年"+age);
    }
}
