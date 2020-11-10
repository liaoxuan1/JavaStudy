package rjht.day02;

import java.util.Random;

/**
 * @Description 细节决定成败
 * @Date 2020/11/10 21:08
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        case 穿透性  在switch语句中
 */
public class CaseDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(7);
        switch (i){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("这是工作日");
                break;
            default:
                System.out.println("这是休息日");
                break;
        }
    }
}
