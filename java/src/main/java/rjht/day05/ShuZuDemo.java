package rjht.day05;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 17:11
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        数组元素逆袭  颠倒顺序
 */
public class ShuZuDemo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        nixi(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //元素逆袭
    public static void nixi(int[] arr){
        for(int start=0,end=arr.length-1;start<end;start++,end--){
            int tmp = arr[start];
            arr[start]=arr[end];
            arr[end] = tmp;
        }
    }
}
