package rjht.day01;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 21:40
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        while 循环
        格式：
        while (条件){
            循环体
        }
        条件的结果必须是布尔类型，如果条件一直是false 则会陷入死循环
 */

public class WhileDemo {
    public static void main(String[] args) {
        WhileDemo a = new WhileDemo();
        a.m1();
    }

    public void m1(){
        Random random = new Random();
        int i = random.nextInt(10);
        while (i < 5){
            System.out.println("仁聚");
        }
        System.out.println(i);
    }
}
