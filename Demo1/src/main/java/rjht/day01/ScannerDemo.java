package rjht.day01;

import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/11/8 21:16
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
引用数据类型demo
格式：类型 变量名 = new 类型()
调用此类型的方法：  变量名.方法
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nextInt  控制台接受整数类型的变量
        int i = scanner.nextInt();
        System.out.println(i);

        //next  控制台接受字符串类型的变量

        String j = scanner.next();
        System.out.println(j+" "+"I love U");

    }
}
