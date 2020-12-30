package rjht.day08;

/**
 * @Description 细节决定成败
 * @Date 2020/12/10 15:22
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Boss extends Person {
    @Override
    public void work() {
        System.out.println("我是老板");
    }

    @Override
    public void eat() {
        System.out.println("我喜欢吃大龙虾");
    }

    public void getMoney(){
        System.out.println("我挣大钱");
    }

    public void momoda(Person a){
        String name = "长大将";
        System.out.println(a.getName()+"///"+name+"喜欢啪啪啪摸摸大");
    }
}
