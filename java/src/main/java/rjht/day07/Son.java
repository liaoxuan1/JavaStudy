package rjht.day07;

/**
 * @Description 细节决定成败
 * @Date 2020/12/9 16:21
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
/*
    子类
 */
public class Son extends Person{
//    @Override
//    public void work() {
//        super.work();
//        System.out.println("重写此方法，表示在父类方法的基础上增加新的功能了");
//    }


    private String names;

    public String getNames() {
        System.out.println("这是子类的名字");
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public void work() {
        System.out.println("重写父类方法");
    }


}
