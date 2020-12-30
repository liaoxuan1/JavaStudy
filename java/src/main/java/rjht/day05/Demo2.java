package rjht.day05;

import javax.sound.midi.Soundbank;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 16:16
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        找出所有的水仙花数

        水仙花数是指一个3位数（100-999之间），其每位数字立方之和等于该3位数本身。如153 = 1*1*1 + 3*3*3 + 5*5*5，
即 3位数本身 = 百位数立方 + 十位数立方 + 个位数立方;
 */
public class Demo2 {
    public static void main(String[] args) {

        for (int i = 100;i <1000; i++){
            int one = i/100;
            int second = i%100/10;
            int three = i%10;
            if (i == one*one*one + second*second*second+three*three*three){
                System.out.println(i);
            }
        }
    }
}
