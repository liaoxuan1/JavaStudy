package rjht;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Method;

/**
 * @Description 细节决定成败
 * @Date 2020/11/8 15:37
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test2 {
    public static void main(String[] args) {

        Test2 t = new Test2();

       // t.m1(1,1);

        int x = t.m2(1, 3);

        System.out.println(x);

    }
    public void m1(int i,int j){
        /*
        逻辑运算：与：&  或：|    非：！
         */

        if (i++ == 2 & ++j ==2){
            i = 7;
        }

        System.out.println("i=" + i+",j=" +j);

    }

    public int m2(int i , int j){
        if (i == 2 | j < 4){
            i++;
            System.out.println("哈哈");
        }
        return i;

    }
}
