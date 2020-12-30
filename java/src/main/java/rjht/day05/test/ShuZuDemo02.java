package rjht.day05.test;

/**
 * @Description 细节决定成败
 * @Date 2020/12/3 9:30
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        数组选择排序
 */
public class ShuZuDemo02 {
    public static void main(String[] args) {
        int[] arr ={10,14,2,67,155,21};
        chooseMethod(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void chooseMethod(int[] arr){
        for (int i =0;i<arr.length-1;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
