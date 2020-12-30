package rjht.day10;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 21:09
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        使用匿名内部类  加上   多态的方式
 */
public class Test03 {
    public static void main(String[] args) {
        Ainmal a = new Ainmal() {
            @Override
            public void eat() {
                System.out.println("在吃饭");
            }

            @Override
            public void sleep() {
                System.out.println("在睡觉");
            }
        };

        a.eat();
        a.sleep();
    }
}
