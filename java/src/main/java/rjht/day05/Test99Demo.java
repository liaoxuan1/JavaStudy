package rjht.day05;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 16:54
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        99惩罚表

        1*1=1
        1*2=2 2*2=4
 */
public class Test99Demo {
    public static void main(String[] args) {
        for (int i =1;i<10;i++){
            for (int j =1;j<=i;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
