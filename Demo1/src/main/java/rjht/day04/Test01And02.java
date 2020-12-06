package rjht.day04;

/**
 * @Description 细节决定成败
 * @Date 2020/12/1 22:10
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Test01And02 {
    public static void main(String[] args) {
        classDemo01 classDemo01 = new classDemo01();
        classDemo02 classDemo02 = new classDemo02();
        classDemo01.brand="格力";
        classDemo01.color="红色";
        classDemo01.size=30.0;
        System.out.println(classDemo01.brand+"  "+classDemo01.color+"   "+classDemo01.size);
        classDemo02.brand="宝马";
        classDemo02.color="黑色";
        classDemo02.monry=500000;
        System.out.println(classDemo02.brand+"  "+classDemo02.color+"   "+classDemo02.monry);
    }
}
