package rjht.day02;

/**
 * @Description 细节决定成败
 * @Date 2020/11/10 22:24
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        定义二维数组：
        数据类型[] [] 数组名 = {{},{},{}}
 */
public class Arr2Demo {
    public static void main(String[] args) {

        int m1 =0;
        int m2 =0;

        int[][] arr = {{1,2,3},{2,5,6},{1}};
        for (int i =0;i < arr.length; i++){
            for (int j =0;j <arr[i].length;j++){
                m1 += arr[i][j];

            }
            System.out.println("每小组求和："+" "+m1);
            m2 += m1;
            //每个小组在求和之后进行清空
            m1 = 0;
        }
        System.out.println("总和："+" "+m2);
    }
}
