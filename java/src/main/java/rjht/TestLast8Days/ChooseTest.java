package rjht.TestLast8Days;

/**
 * @Description 细节决定成败
 * @Date 2020/12/13 16:19
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        选择排序

        思路：

                int [] a = {1,4,3,2}
 */
public class ChooseTest {
    public static void main(String[] args) {
        int []  a = {1,3,2,7,4,10,8};
        choose(a);
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    public static void choose(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j =i+1;j<a.length;j++){
                if (a[i] > a[j]){
                    int tmp =0;
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
