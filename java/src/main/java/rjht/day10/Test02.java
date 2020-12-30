package rjht.day10;

/**
 * @Description 细节决定成败
 * @Date 2020/12/14 20:57
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        匿名内部类

       格式：
       new 接口/父类(){
            重写父类或者接口的方法
       }.方法;

       匿名内部类解决了代码多的问题，如下：
       主要是简化了创建类的对象，以及对象掉方法的步骤
 */
public class Test02 {
    public static void main(String[] args) {
         new Smoking(){
            public void smoking(){
                System.out.println("人在抽烟");
            }
        }.smoking();
    }
}
