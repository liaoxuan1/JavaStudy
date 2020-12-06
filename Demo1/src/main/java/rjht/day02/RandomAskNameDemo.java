package rjht.day02;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/10 22:44
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        课堂随机点名
 */
public class RandomAskNameDemo {
    public static void main(String[] args) {
        String[] name = {"张三","李四","王麻子","赵云","马关","将军","驴子"};
        for (int i = 0; i < name.length;i++){
            System.out.println(name[i]);
        }
        System.out.println("======");
        Random random = new Random();
        int j = random.nextInt(name.length);
        System.out.println(name[j]);
        System.out.println("=======");
        int i = random.nextInt(33);
        System.out.println(
                i
        );

    }
}
