package rjht.day01;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 22:16
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        break  用于终止循环,写在那个循环中就结束那个循环 ，但是可以给循环加名称 a:for  a:while  break a ; 则直接结束叫a的循环
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100){
            if (i == 3){
                break;
            }else {
                System.out.println(i);
            }
            i ++ ;
        }
    }
}
