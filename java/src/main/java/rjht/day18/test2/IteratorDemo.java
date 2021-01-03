package rjht.day18.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 16:11
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        迭代器 用于获取集合中的数据


 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("张三");
        arr.add(123);
        arr.add(1.20);
        arr.add("英语");
        iteratorTest(arr);
    }

    public static void iteratorTest(ArrayList<Object> arr){
        Iterator<Object> iterator = arr.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
            System.out.println("=========");
        }
    }
}
