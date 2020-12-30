package rjht.day01;

/**
 * @Description 细节决定成败
 * @Date 2020/11/9 22:02
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        for 循环嵌套for循环

        for (){
            for(){

            }
        }
        外循环控制的是行数
        内循环控制的是每行的个数

        总循环次数：外循环次数 X 内循环次数
 */
public class ForAndForDemo {

    public static void main(String[] args) {
        for (int i = 0; i < 9 ;i ++){
            for (int j = 0 ; j < i+1 ; j ++){
                System.out.print("陈芳 ");
            }
            System.out.println();
        }
    }

}
