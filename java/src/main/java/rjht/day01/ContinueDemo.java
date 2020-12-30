package rjht.day01;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 22:21
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        continue用于结束本次循环，开始下次循环
 */

public class ContinueDemo {
    public static void main(String[] args) {
        //打印0-100的奇数

        for (int i = 0 ; i <= 100 ; i ++){
            if (i %2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
