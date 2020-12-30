package rjht.day03;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 9:49
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class testArr {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(arr);
        System.out.println(arr[2]);
        test1(arr);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr);
        System.out.println(arr[2]);
        System.out.println(arr[1]);
    }

    public static void test1(int[] arr){
        arr[2] = 100;
    }
}
