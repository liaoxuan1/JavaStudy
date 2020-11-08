package rjht;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/8 21:41
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        需求:将不同的五个随机数放入数组中
 */
public class ForDemoAndRandom {
    /*
        思路：创建数组->数组每个空间初始值为0->创建随机数->利用循环来进行随机数和数组值的判断以及将值写入数组->循环遍历数组打印
     */
    public static void main(String[] args) {
        int[] arr = new int[5];
        //数组每个空间初始值为0
        for (int i = 0; i <arr.length;i++){
            arr[i]= 0;
        }
        Random random = new Random();

        int index = 0;

        w:while (index < arr.length){
            int j = random.nextInt(10);
            for (int i = 0 ; i<arr.length;i++){
                if (arr[i]==j){
                    continue w;
                }
            }
            arr[index]=j;
            index++;
        }

        for (int n = 0 ; n < arr.length ; n ++){
            System.out.print(arr[n]);
        }
    }
}
