package rjht.day03;

/**
 * @Description 细节决定成败
 * @Date 2020/11/30 21:35
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        方法的定义：
        修饰符  返回值类型   方法名(参数类型：参数){
            方法体
        }

        public static 修饰符


 */

public class MethodDemo {


    public static void main(String[] args) {

        MethodDemo m1 = new MethodDemo();
        int result = m1.mianji(1, 2);
        System.out.println(result);

        System.out.println("===");
        int result1 = mianji(1, 2);
        System.out.println(result1);
    }

    /*
        计算长方形的面积
     */

    public static int mianji(int i,int j){

        int a = i*j;

        return a;
    }
}
