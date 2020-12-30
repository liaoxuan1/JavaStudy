package rjht.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 14:05
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class ArrayListDemo02 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>();
        arr.add("汽车");
        arr.add("手机");
        arr.add("电视");

        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
            System.out.println("======");
        }
        arr.remove(2);
        System.out.println(arr.size());
        arr.clear();
        System.out.println(arr.size());
    }
}
