package rjht.day18;

import java.util.ArrayList;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 15:22
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        arrayList集合

        集合和数组的区别：

           长度：数组是固定的，集合是可变的
           集合存储的是引用数据类型，不接受基本数据类型
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(111);
        arr.add(222);
        arr.add(333);

        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
