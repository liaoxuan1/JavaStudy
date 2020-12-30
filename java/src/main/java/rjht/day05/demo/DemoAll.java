package rjht.day05.demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description 细节决定成败
 * @Date 2020/12/4 11:31
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
        模拟真实的库存管理逻辑，完成超市管理系统的日常功能实现
1.完成超市商品初始化。创建商品，将商品添加到集合
2.显示来到超市能做的操作，也就是显示主菜单
3.根据接收到的功能选项，执行对应的功能
3.1.库存货物查询
3.2.添加新货物
3.3.删除货物
3.4.修改货物
3.5.退出系统,结束main方法的运行
4.循环，回到 2.显示主菜单
 */
public class DemoAll {
    public static void main(String[] args) {

        ArrayList<Goods01> arr = new ArrayList<Goods01>();
        initMethod(arr);
        a :while (true){
            operation(arr);
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i){
                case 1:
                    selectOperation(arr);
                    continue;
                case 2:
                    addOperation(arr);
                    continue;
                case 3:
                    deleteOperation(arr);
                    continue;
                case 4:
                    updateOperation(arr);
                    continue;
                case 5:
                    quitOperation();
                    break a;
            }

        }
    }
    public static void initMethod(ArrayList<Goods01> arr){
        Goods01 s1 = new Goods01();
        s1.name="华为1";
        s1.color="白色1";
        s1.money=3001.0;

        Goods01 s2 = new Goods01();
        s2.name="华为2";
        s2.color="白色2";
        s2.money=3002.0;

        Goods01 s3 = new Goods01();
        s3.name="华为3";
        s3.color="白色3";
        s3.money=3003.0;

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
    }
    public static void operation(ArrayList<Goods01> arr){
        System.out.println("==============欢迎来到商店=============");
        System.out.println("1.货物清单"+"   "+"2.添加新货物"+"   "+"3.删除货物"+"    "+"4.修改货物"+"    "+"5.退出");
        System.out.println("请选择您要输入的操作号：");
    }
    public static void selectOperation(ArrayList<Goods01> arr){
        System.out.println("=========商品清单如下：=========");
        System.out.println("商品名称"+"     "+"商品颜色"+"      "+"商品价格");
        for (int i = 0;i <arr.size();i++){
            Goods01 goods = arr.get(i);
            System.out.println(goods.name+"     "+goods.color+"     "+goods.money);
        }
    }
    public static void addOperation(ArrayList<Goods01> arr){
        System.out.println("请开始添加商品：");
        Goods01 s = new Goods01();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        s.name = a;
        Scanner sc1 = new Scanner(System.in);
        String a1 = sc1.next();
        s.color=a1;
        Scanner s2 = new Scanner(System.in);
        double a2 = s2.nextDouble();
        s.money=a2;
        arr.add(s);
    }
    public static void deleteOperation(ArrayList<Goods01> arr){
        System.out.println("请输入您要删除的商品：");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0;i<arr.size();i++){
            Goods01 goods = arr.get(i);
            if (goods.name.equals(a) ){
                arr.remove(goods);
                System.out.println(goods + "商品已经删除");
                return;
            }
        }
        System.out.println("没有此商品");
    }
    public static void updateOperation(ArrayList<Goods01> arr){
        System.out.println("请输入您要更新的商品:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0;i<arr.size();i++){
            Goods01 goods = arr.get(i);
            if (goods.name.equals(s)){
                System.out.println("请输入修改后名称");
                goods.name=scanner.next();
                System.out.println("请输入修改后的颜色");
                goods.color = scanner.next();
                System.out.println("请输入修改后的价格");
                goods.money = scanner.nextDouble();
            }
        }
        System.out.println("没有此商品");
    }
    public static void quitOperation(){
        System.out.println("您以退出此系统");
    }
}
