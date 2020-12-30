package rjht.day05.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/12/4 16:21
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        双色球中奖

        1-33之间无重复的 7个数
 */
public class ShuangSeQiuDemo {
    public static void main(String[] args) {
        System.out.println("中奖号码为：");
        ArrayList<Integer> arr = new ArrayList<Integer>();

        a:while (true){
            Random random = new Random();
            int i = random.nextInt(33);

            arr.add(i);
            if (arr.size() < 7){
                for (int j=0;j<arr.size();j++){
                    Integer integer = arr.get(j);
                    if (integer.intValue() == i){
                        arr.remove(j);
                    }
                }
                for (int a = 0;a<arr.size();a++){
                    System.out.println(arr.get(a).intValue());
                }
            }else {
                System.out.println("已退出");
                break a;
            }
        }


    }
}
