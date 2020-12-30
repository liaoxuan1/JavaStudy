package rjht.day01;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 22:27
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        需求：猜数字游戏
        后台预先生成一个0-100的随机数，用户则键盘录入一个数
        如果猜对了，则打印"恭喜您，猜对了"
        如果猜错了，则进行判断是猜大了，还是猜小了
 */
public class AllDemo {
    public static void main(String[] args) {
//        Random random = new Random();
//        int i = random.nextInt(100);
//        Scanner scanner = new Scanner(System.in);
//        int j = scanner.nextInt();
//        a:if (i == j){
//            System.out.println("恭喜您，猜对了");
//        } else {
//            while (i > j){
//                System.out.println("不好意思，您猜小了");
//                break a;
//            }
//            System.out.println("不好意思，您猜大了");
//
//        }
//        System.out.println(i);
//        System.out.println(j);

        System.out.println("猜数字游戏开始了");
        System.out.println("请键盘输入数字：");
        Random random = new Random();
        int i = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            int j = scanner.nextInt();
            if (i>j){
                System.out.println("您猜小了");
                System.out.println(i);
                System.out.println(j);
            }else if (i < j ){
                System.out.println("您猜大了");
                System.out.println(i);
                System.out.println(j);
            }else {
                System.out.println("您猜对了");
                System.out.println(i);
                System.out.println(j);
            }
        }

    }
}
