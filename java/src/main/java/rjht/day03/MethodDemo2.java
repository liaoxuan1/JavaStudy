package rjht.day03;


import sun.reflect.generics.tree.VoidDescriptor;

/**
 * @Description 细节决定成败
 * @Date 2020/11/30 22:26
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        方法的重载

        和方法修饰符无关，返回类型无关，只和方法名和参数列表有关
 */
public class MethodDemo2 {

    public static void main(String[] args) {

    }

    public static int m1(int i ,int j){
        return 1;
    }

    public static String m1(String a){
        return "aa";
    }

    public final static void m1(int i,double j){

    }

    public static void m1(double a , int b){

    }

}
