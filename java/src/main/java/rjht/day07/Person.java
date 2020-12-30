package rjht.day07;

/**
 * @Description 细节决定成败
 * @Date 2020/12/9 16:15
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        继承  父类
 */
public class Person {

    private String name ;

    public String getName() {
        System.out.println("这是父类的名字");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("努力工作");
    }

}
