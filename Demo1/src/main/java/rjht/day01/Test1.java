package rjht.day01;

/**
 * @Description 细节决定成败
 * @Date 2020/11/8 15:29
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test1 {
    public static void main(String[] args) {
        /*
        强制类型转换
         */
        short i = 10;
        int s ;
        s = i + 3;
        i = (short)(i + 3);
        System.out.println("s"+"="+s);
        System.out.println("i"+"="+i);

    }
}
