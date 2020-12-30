package rjht.day03;



import java.util.Random;
import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/11/30 22:34
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
       需求：   随机点名：
 */
public class MethodDemo3 {

    public static void main(String[] args) {
        String[] arr = new String[4];
        addName(arr);
        printName(arr);
        randomName(arr);

    }

    public static void addName(String[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.next();
        }
    }

    public static void printName(String[] arr){
        for (int i =0;i<arr.length;i++){
            String name = arr[i];
            System.out.println("每个同学的名字是"+" "+name);
        }
    }

    public static void randomName(String[] arr){
        Random random = new Random();
        int i = random.nextInt(arr.length);
        System.out.println(arr[i]);
    }
}
