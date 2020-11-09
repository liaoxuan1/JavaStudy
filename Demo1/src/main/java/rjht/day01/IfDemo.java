package rjht.day01;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 20:54
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
    if 条件判断语句

    格式：
    if(条件){
        符合条件执行的语句
    }

    条件必须是boolean布尔类型的
 */

public class IfDemo {
    public static void main(String[] args) {

        int i = 5 ;
        if (i == 5){
            System.out.println("符合条件");
        }else {
            System.out.println("不符合条件");
        }

        IfDemo a = new IfDemo();
        a.m1(10);
        a.m2(15);
        a.m3();
    }

    public void m1(int i){
        Random random = new Random();

        if (random.nextInt(i) > 5){
            System.out.println("陈芳我爱你");
        }else {
            System.out.println("陈芳是臭盯盯");
        }
    }

    //多条件判断 if ...else if ...else
    public void m2(int i){
        Random random = new Random();
        int j = random.nextInt(i);
        System.out.println(j);
        System.out.println("\n");
        System.out.println("============");
        if (j >= 10){
            for (int e = 0;e < j ; e++){
                System.out.println(e);
                System.out.println( "j 大于等于 10");
            }

        } else if (5 < j && j < 10){
            System.out.println(j);
            System.out.println("\n");
            System.out.println("j 大于 5  小于 10");
        }else{
            System.out.println(j);
            System.out.println("\n");
            System.out.println("j 小于5");
        }
    }

    // if else 与三元运算符的互相转化， 判断条件多 使用if ；三元必须有结果，if可以没有结果
    public void m3(){
        int i = 10;
        int j = 5;
        if (i > j){
            System.out.println(i  +" " +"i是最大值");
        }else {
            System.out.println(j + " " + "j是最大值");
        }

        int k = i > j ? i : j;
        System.out.println(k + "是最大值");
    }
}
