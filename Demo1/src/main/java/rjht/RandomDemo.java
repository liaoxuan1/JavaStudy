package rjht;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/8 21:28
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        Random类：产生随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int j = random.nextInt(100);
        int i;
        for (i = 0;i < 100; i++){
            System.out.println(i +" "+ "hello"+" "+j);
        }
    }
}
