package rjht.day18.test2;

import java.util.ArrayList;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 16:30
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        增强for循环 遍历数组 和集合


        for(数据类型 变量名：数据/集合){

        }
 */
public class Foreach {
    public static void main(String[] args) {

        //增强for遍历 集合
        ArrayList<String> arr = new ArrayList<>();
        arr.add("张三");
        arr.add("李四");
        arr.add("王五");

        for (String i :arr){
            System.out.println(i);
        }

        System.out.println("增强for开始遍历数据");

        int[] a = {1,2,3,4,5,6};
        for (int i:a){
            System.out.println(i);
        }
    }
}
