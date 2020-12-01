package rjht.day03;


import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/11/30 23:37
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
1.查看库存清单
2.修改商品库存数量
3.退出
请输入要执行的操作序号：
每一项功能操作，我们采用方法进行封装，这样，可使程序的可读性增强。
选择“1.查看库存清单”功能，则控制台打印库存清单
选择“2.修改商品库存数量”功能，则对每种商品库存数进行更新
选择“3.退出”功能，则退出库存管理，程序结束


stringBuffer  是final修饰的
 */
public class MethodDemo4 {

    static String[] name= new String[]{"苹果","华为","小米"};
    static double[] size = new double[]{13.4,16.0,14.0};
    static double[] price = new double[]{5888.0,6888.0,3999.0};
    static int[] num = new int[]{10,20,4};

    public static void main(String[] args) {
        System.out.println("您好！功能如下：");
        chooseDetailedList();
        System.out.println("请您选择：");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                lookStock(name,size,price,num);
            case 2:
                updateStock(name,num);
            case 3:
                signOut();
        }
    }

    public static void chooseDetailedList(){

        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
    }

    public static void lookStock(String[] name,double[] size,double[] price,int[] num){
        System.out.println("库存清单如下：");
        System.out.println("商品名称"+" "+"型号"+"    "+"价格"+"    "+"库存数量");
        /*
               另求 库存总金额，库存总数量
         */
        double moneySum=0;
        int numSum=0;
        for (int i = 0;i<name.length;i++){
            System.out.println(name[i]+"    "+size[i]+" "+price[i]+" "+num[i]);
            //库存总金额
            moneySum +=price[i] * num[i];
            System.out.println("库存总金额为："+"  "+moneySum);
            //库存总数量
            numSum += num[i];
            System.out.println("库存总数量为："+"  "+numSum);
        }

    }

    public static void updateStock(String[] name,int[] num){
        for (int i = 0; i < name.length; i++) {
            System.out.println("请输入"+ name[i] +"商品库存数");
            num[i] = new Scanner(System.in).nextInt();
        }
    }

    public static void signOut(){
        System.out.println("您已退出");
    }

}
