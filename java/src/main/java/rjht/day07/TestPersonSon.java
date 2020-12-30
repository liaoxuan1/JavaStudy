package rjht.day07;

/**
 * @Description 细节决定成败
 * @Date 2020/12/9 16:28
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class TestPersonSon {
    public static void main(String[] args) {
        Son son = new Son();
        son.work();
        son.setName("李四");
        System.out.println(son.getName());

        son.setNames("五五");
        System.out.println(son.getNames());

    }
}
