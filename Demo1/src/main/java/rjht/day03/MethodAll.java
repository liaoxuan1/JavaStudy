package rjht.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/12/1 14:43
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class MethodAll {
    public static void main(String[] args) {
//        int i = m1(1, 2);
//        System.out.println(i);
//
//        String i1 = m1("张三", 100);
//        System.out.println(i1);
        String[] name = new String[4];
        addName(name);
        askAllName(name);
        randomAskName(name);

    }

    //长方形面积
    public static int m1(int x,int y){
        return x*y;
    }

    /*
        方法的重载，之和方法名和参数列表有关   和其他修饰符  返回值类型无关
     */
    public static String m1(String name,int money){
        return (name+"先生请付款"+money+"，谢谢！");
    }

    /*
            随机点名：
            1.学生存入数组
            2.点名全班同学
            3.随机点名
     */
    public static void addName(String[] name){
        Scanner scanner = new Scanner(System.in);
        for (int i =0;i<name.length;i++){
            name[i]=scanner.next();
        }
    }

    public static void askAllName(String[] name){
        for (int i =0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }

    public static void randomAskName(String[] name){
        Random random = new Random();
        int i = random.nextInt(name.length);
        System.out.println(name[i]);
    }

}
