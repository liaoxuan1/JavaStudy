package rjht.day05;

/**
 * @Description 细节决定成败
 * @Date 2020/12/2 16:38
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
    打印所有的大小写字母A-Z
 */
public class Demo3 {
    public static void main(String[] args) {
        char name1 = 'A';
        char name2 = 'a';
        for (int i =0 ;i <26;i++){
            System.out.println(name1+"    "+name2);
        name1++;
        name2++;
        }
    }
}

