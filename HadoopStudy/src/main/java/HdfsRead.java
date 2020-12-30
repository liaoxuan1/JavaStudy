import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * @Description 细节决定成败
 * @Date 2020/12/30 15:43
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/


/*
        读取hdfs数据
 */
public class HdfsRead {
    public static void main(String[] args) throws IOException {
        //指定是HDFS文件系统
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS","node01:9000");

        //通过FileSystem的静态方法来获取文件对象客户端
        FileSystem fileSystem = FileSystem.get(conf);

        //打开一个输入流，来读取数据
        FSDataInputStream in = fileSystem.open(new Path("/aaa.txt"));


    }
}
