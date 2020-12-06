package rjht.day05;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 16:01
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        求1-100之间奇数和
 */
public class SumDemo1 {
    public static void main(String[] args) {
        int sum=0;
        for (int i =1;i <=100 && i>=1;i++){
            if (i%2 ==0){
                continue;
            }else {
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
