package rjht.day05.demo.util;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description 细节决定成败
 * @Date 2020/12/6 14:35
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class CollectMsql {

    public  Connection collect() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql://localhost:3306/javastudy?characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        /*
        将用户名和密码封装在Properties中
         */
        Properties info = new Properties();
        info.setProperty("user","root");
        info.setProperty("password","root");

        Connection conn = driver.connect(url,info);
        return conn;

    }
}
