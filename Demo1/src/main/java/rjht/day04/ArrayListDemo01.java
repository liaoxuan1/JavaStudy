package rjht.day04;


import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/12/1 22:30
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        ArrayList  集合

        定义： 集合类型<存储数据的引用数据类型>  集合名 = new ArrayList<存储数据的引用数据类型>();

        ArrayList  集合中的方法：
        add  添加元素  元素类型和定义集合对象值的类型一致
        get 获取  get (int index)

        size 集合的长度大小

        set(index,数据) 给index索引插入元素
        remove(index,数据) 移除index索引上的数据
        clear 清空集合的所有数据
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {

        ArrayList<student> arr = new ArrayList<student>();
        add(arr);
        System.out.println("========");
        printOneName(arr);
        System.out.println("========");
        randomName(arr);

    }
    //存储数据
    public static void add(ArrayList<student> arr){
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        student s4 = new student();
        s1.name="张三1";
        s1.age=21;
        s2.name="张三2";
        s2.age=22;
        s3.name="张三3";
        s3.age=23;
        s4.name="张三4";
        s4.age=24;

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

    }

    //打印全班每一个人的信息
    public static void printOneName(ArrayList<student> arr){
        for (int i =0;i<arr.size();i++){
            student student = arr.get(i);
            System.out.println(student.name+"   "+student.age);
        }
    }

    //随机查找一个同学的信息
    public static void randomName(ArrayList<student> arr){
        Random random = new Random();
        int i = random.nextInt(arr.size());
        student student = arr.get(i);
        System.out.println(student.name+"   "+student.age);
    }

}
