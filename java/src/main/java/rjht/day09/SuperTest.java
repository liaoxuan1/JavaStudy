package rjht.day09;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 13:58
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class SuperTest extends Test{
    SuperTest(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(String name, int age) {
        super.study(name, age);

        System.out.println(name+"++++++"+age);
    }
}
