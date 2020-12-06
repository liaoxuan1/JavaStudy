package rjht.day05;

import java.util.ArrayList;

/**
 * @Description 细节决定成败
 * @Date 2020/12/4 10:38
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        冒泡排序
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {10,1,4,2,9,3,5,7,6,8};
        mapPaoSort1(arr);
        for (int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void maoPaoSort(int[] arr){
        for (int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }


    /*
            双重for循环，第一次循环是次数
            第二次为数组中元素值比较
            arr.length -1  防止数组越界
            arr.length -i  为了比较效率，避免重复比较
     */
    public static void mapPaoSort1(int[] arr){

        for (int i = 0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}

