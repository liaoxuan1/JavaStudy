package rjht.day06;

/**
 * @Description 细节决定成败
 * @Date 2020/12/11 14:20
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test002 {
    public static void main(String[] args) {
        Test001 test001 = new Test001();
        test001.work2();
        test001.setName("李四");
        test001.setId(12);
        System.out.println(test001.getName()+"  "+test001.getId());

        Test002 test002 = new Test002();
        test002.work1(test001);
    }

    public void work1(Test001 a){
        System.out.println("这是方法3");
    }
}
