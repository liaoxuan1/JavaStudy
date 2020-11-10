package rjht.day02;

/**
 * @Description 细节决定成败
 * @Date 2020/11/10 22:03
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        数组
        定于数组的格式：
        数据类型[] 数组名 = new 数组类型[数组大小]
        数据类型[] 数组名 = {}
 */
public class Arr1Demo {
    public static void main(String[] args) {
        //需求:寻找数组中的最大值
        int[] arr = {7,3,5,9,10,2,11};

        int i = arr[0];
        for (int j = 0 ; j < arr.length; j ++){
            if (i < arr[j]){
                i = arr[j];
            }
        }
        System.out.println(i);

    }
}
