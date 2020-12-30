package rjht.day02;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/10 20:52
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        switch 选择语句 只能针对某个表达式的值做出判断

        格式：
        switch(表达式){
            case 常量值1:
                要执行的语句;
            break;
            case 常量值2:
                要执行的语句;
            break;
            case 常量值3:
                要执行的语句;
            break;
            default:
                要执行的语句;
            break;


        }
 */
public class SwitchDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(9);

        switch (i){
            case 1:
                System.out.println("今天星期1");
                break;
            case 2:
                System.out.println("今天星期2");
                break;
            case 3:
                System.out.println("今天星期3");
                break;
            case 4:
                System.out.println("今天星期4");
                break;
            case 5:
                System.out.println("今天星期5");
                break;
            case 6:
                System.out.println("今天星期6");
                break;
            case 7:
                System.out.println("今天星期天");
                break;
                default:
                    System.out.println("不存在");
                    break;
        }

    }
}
