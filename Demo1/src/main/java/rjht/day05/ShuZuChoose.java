package rjht.day05;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 18:28
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        数组选择排序
 */
public class ShuZuChoose {
    public static void main(String[] args) {
        int[] arr = {11,7,2,79,20};
        choose(arr);

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void choose(int[] arr){
        for (int small=0;small<arr.length-1;small++){
            for (int j =small+1;j<arr.length;j++){
                if (arr[small] >arr[j]){
                    int tmp = arr[small];
                    arr[small] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }
}
