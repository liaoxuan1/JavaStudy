package rjht.day01;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 21:49
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        do while循环

         格式：
         do{
            循环体
         }while(条件);

         此循环的规则是：程序执行的时候会先无条件的执行一次方法体，然后在进行while判断，如果为true 则继续执行循环体，
         否则跳出循环
 */

public class DoWhileDemo {
    public static void main(String[] args) {
        //打印1-4之间的自然数
        int i = 1;
        do {
            System.out.println(i);
            i ++;
        } while (i < 5);
    }
}
