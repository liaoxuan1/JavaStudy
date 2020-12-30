package rjht.day08;

/**
 * @Description 细节决定成败
 * @Date 2020/12/10 15:19
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Teacher extends Person implements PersonOther{
    @Override
    public void work() {
        System.out.println("我的工作是老师");
    }

    @Override
    public void eat() {
        System.out.println("我喜欢吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("我每天睡7个小时");
    }

    @Override
    public void diaoyu() {
        System.out.println("我还喜欢钓鱼");
    }

    public void speak(){
        System.out.println("我可以教学生口语");
    }
}
