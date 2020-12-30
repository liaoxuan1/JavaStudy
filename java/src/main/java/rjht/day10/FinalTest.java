package rjht.day10;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 14:48
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class FinalTest extends Person{

    FinalTest() {
        super();
    }

    @Override
    public void work1() {
        System.out.println("子类重写父类的方法");
    }
}
