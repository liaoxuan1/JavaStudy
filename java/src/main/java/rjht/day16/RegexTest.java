package rjht.day16;

/**
 * @Description 细节决定成败
 * @Date 2021/1/3 14:43
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        正则表达式学习


 */
public class RegexTest {
    public static void main(String[] args) {
        String str = "www.baidu.com";
        boolean matches = str.matches(".*baidu.*");
        System.out.println(matches);


        //检验手机号是否正确

        String t1 = "13565657444";

        boolean matches1 = t1.matches("1[34857][\\d]{9}");
        System.out.println(matches1);



        //切割字符串

        String t2 = "19   20      40        60";
        String[] split = t2.split(" +");
        System.out.println("数组的长度:"+split.length);
        for (int i = 0;i<split.length;i++){
            System.out.println(split[i]);
        }


        //替换字符串中的数字
        String t3 ="asd2323jkj3232jk43434jk1313jkj43l4j32jlk5j46jel";
        //替换所有的
        //String replace = t3.replaceAll("[\\d]", "#");
        //String replace = t3.replaceAll("[\\d+]", "#");
        //相邻的替换为一个
        String replace = t3.replaceAll("[\\d]+", "#");
        System.out.println(replace);

    }
}
