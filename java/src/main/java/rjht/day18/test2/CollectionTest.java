package rjht.day18.test2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 15:46
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/


/*

    collection 集合的总接口
        分为下面两个子接口
        list
        set

      list中又包含ArrayList  和LinkedList  两个实现类    允许存储重复元素

      set 中包含了HashSet  LinkedHashSet 两个实现类      不允许存储重复元素
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<Object> arr = new ArrayList<Object>();

        arr.add("张三");
        arr.add("123");
        arr.add("1.21");

        System.out.println(arr);

        //清除集合中的对象数据
        arr.clear();
        System.out.println(arr);

        arr.add("张三");
        arr.add("123");
        arr.add("1.21");

        //contains  用于判断集合是否存在集合中
        boolean contains = arr.contains("123");
        System.out.println(contains);

        //remove 移除指定索引的数据
        ((ArrayList<Object>) arr).remove(2);

        System.out.println(arr);
        //remove移除指定的数据
        arr.remove("123");
        System.out.println(arr);

        arr.add("张三");
        arr.add("123");
        arr.add("1.21");

        for (int i =0;i<arr.size();i++){
            System.out.println(((ArrayList<Object>) arr).get(i));
        }

        //移除第一个出现的指定数据
        arr.remove("张三");
        System.out.println(arr);
    }
}
