package rjht.day09;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 13:58
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test {
    private String name;
    private int age;

    //无参构造
    Test(){

    }

    Test(String name){
        this.name=name;
    }

    Test(String name,int age){
        this(name);
        this.age=age;
    }

    public void study(String name,int age){
        System.out.println(this.name+"，今年"+this.age+"岁"+"，他特别i喜欢读书"+"=======父类方法");
    }
}
