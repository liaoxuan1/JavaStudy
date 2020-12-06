package rjht.day05.demo;


import rjht.day05.demo.util.CollectMsql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @Description 细节决定成败
 * @Date 2020/12/6 14:18
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
public class Test {

    public static void main(String[] args) {

        ArrayList<Goods> arr = new ArrayList<Goods>();
        try {
            addGoods(arr);

        } catch (SQLException e) {
            e.getErrorCode();
        }

    }


    //添加商品
    public static void addGoods(ArrayList<Goods> arr) throws SQLException {
        CollectMsql collectMsql = new CollectMsql();
        Connection connection = collectMsql.collect();
        Statement statement = connection.createStatement();
        //执行查询
        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        //展开结果
        Goods goods = new Goods();
        while (resultSet.next()) {
            goods.id = resultSet.getInt("id");
            goods.name = resultSet.getString("name");
            goods.word = resultSet.getString("work");
            goods.money = resultSet.getInt("money");
            arr.add(goods);
            System.out.println(goods.id + "   " + goods.name + "  " + goods.word + "  " + goods.money);
        }

    }

    //显示主菜单
    public static void showGoods(ArrayList<Goods> arr){

    }

    //查询货物
    public static void choodsGoods(ArrayList<Goods> arr){

    }

    //添加新货物
    public static void addNewGoods(ArrayList<Goods> arr){

    }

    //删除货物
    public static void deleteGoods(ArrayList<Goods> arr){

    }

    //修改货物
    public static void updateGoods(ArrayList<Goods> arr){

    }

    //退出系统
    public static void goOut(){

    }


}
