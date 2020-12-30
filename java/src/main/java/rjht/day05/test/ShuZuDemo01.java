package rjht.day05.test;

/**
 * @Description 细节决定成败
 * @Date 2020/12/3 9:19
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        数组逆袭   颠倒顺序
 */
public class ShuZuDemo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reversal(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reversal(int[] arr){
        for (int i =0,j=arr.length-1;i<arr.length;i++,j--){
            if (arr[i] >arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
}
