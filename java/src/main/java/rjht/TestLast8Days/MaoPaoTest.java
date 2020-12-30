package rjht.TestLast8Days;

/**
 * @Description 细节决定成败
 * @Date 2020/12/13 16:33
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        冒泡排序

        int[] a ={4,1,5,2,7,3,9,8,6}

        思路：a[0] 和 a[1] 比  如果a[0]大 则换位置，然后a[0]在和a[2]相比
 */
public class MaoPaoTest {
    public static void main(String[] args) {
        int [] a= {4,1,5,2,7,3,9,8,6};

        maopao(a);
        for (int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
     }

    public static void maopao(int[] a){
        for (int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int tmp =0;
                    tmp = a[i];
                    a[i] =a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
