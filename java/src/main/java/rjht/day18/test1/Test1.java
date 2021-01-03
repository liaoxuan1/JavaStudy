package rjht.day18.test1;

import java.util.ArrayList;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 15:28
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Person> arr = new ArrayList<Person>();

        arr.add(new Person("张三",20));
        arr.add(new Person("李四",40));
        arr.add(new Person("王五",30));

        for (int i =0;i <arr.size();i++){
            System.out.println(arr.get(i));

        }
    }
}
