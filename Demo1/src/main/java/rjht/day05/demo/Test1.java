package rjht.day05.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/12/4 16:52
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        b:while (true) {
            Random random = new Random();
            int i = random.nextInt(33);
            arr.add(i);
            if (arr.size() <8 ) {
                System.out.println("已退出");
                break b;

            }
            for (int a =0;a<arr.size();a++){
                Integer integer = arr.get(a);

            }
            for (int j = 0; j < arr.size(); j++) {
                Integer integer = arr.get(j);
                System.out.println(integer.intValue());
            }
        }
      }
}
