package rjht.day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 14:22
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        随机点名
        1.添加元素
        2.打印
        3.随即打印
 */
public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<student> arr = new ArrayList<student>();
        addInformation(arr);
        printAll(arr);
        System.out.println("============");
        randomPrintAll(arr);

    }

    //1.添加元素
    public static void addInformation(ArrayList<student> arr){
        student s1 = new student();
        s1.name = "张三1";
        s1.age = 21;

        student s2 = new student();
        s2.name = "张三2";
        s2.age = 22;

        student s3 = new student();
        s3.name = "张三3";
        s3.age = 23;

        student s4 = new student();
        s4.name = "张三4";
        s4.age = 24;

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
    }

    //打印
    public static void printAll(ArrayList<student> arr){
        for (int i =0;i<arr.size();i++){
            student s = arr.get(i);
            System.out.println(s.name+" "+s.age);

        }
    }

    //随即打印
    public static void randomPrintAll(List<student> arr){
        Random random = new Random();
        int i = random.nextInt(arr.size());
        System.out.println(arr.get(i).name+"    "+arr.get(i).age);
    }
}
