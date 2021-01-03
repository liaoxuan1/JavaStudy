import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.util.HashMap;

/**
 * @Description 细节决定成败
 * @Date 2020/12/30 16:16
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
    向hdfs写数据
 */
public class HdfsWrite {
    public static void main(String[] args) throws IOException {
        //指定是hdfs文件系统
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","node01:8020");

        //指定用户
        System.setProperty("HADOOP_USER_NAME","root");

        //通过FileSystem静态方法来回去文件客户端对象
        FileSystem fileSystem = FileSystem.get(conf);

        //创建写入
        FSDataOutputStream writePath = fileSystem.create(new Path("/test/hdfsWriteTest/1.txt"));
        writePath.writeBytes("spark hive flink storm");
        writePath.close();
        fileSystem.close();
        System.out.println("写入成功");

        HashMap<String, String> objectObjectHashMap = new HashMap<String,String>();
        objectObjectHashMap.put("a","b");
        String a = objectObjectHashMap.get("a");
        System.out.println(a);
    }
}
