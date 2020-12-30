package rjht.day10;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 14:51
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        总结final  最终的意思

        final修饰类，类中的成员，以及局部变量

        final修饰的类  不能被别人继承，但是可以继承别的类

        final修饰的成员变量，必须在创建对象之前赋值，或者在构造方法中赋值，且不能被子类继承，但是可以被子类调用

        final修饰的成员方法，不能被子类继承，但是可以被子类调用

        final修饰的变量 都成为常量

        final修饰的引用类型对象，只是约束的是此对象的内存空间地址，其内部的属性是可以被改变的
 */
public class Test01 {
    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.name+"==="+finalTest.age);

        finalTest.work1();
        finalTest.work2();

        final Person2 p = new Person2();
        p.setWork("教师");
        System.out.println(p.work);
    }
}
