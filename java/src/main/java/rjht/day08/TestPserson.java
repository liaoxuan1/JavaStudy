package rjht.day08;

/**
 * @Description 细节决定成败
 * @Date 2020/12/10 15:23
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class TestPserson {
    public static void main(String[] args) {
        //描述老师的能力
       Person teacher= new Teacher();
       if (teacher instanceof Person){
           teacher.setName("李四老师");
           teacher.setAge(30);
           System.out.println("我叫"+teacher.getName()+",我今年"+teacher.getAge()+"岁");
           teacher.work();
           teacher.eat();
           ((Teacher) teacher).sleep();
           ((Teacher) teacher).diaoyu();
           ((Teacher) teacher).speak();
           System.out.println("==============over=======");
       }else {
           System.out.println("转型失败");
           return;
       }
        //描述老板的能力
        Person boss = new Boss();
       if (boss instanceof Person){
           boss.setAge(30);
           boss.setName("霸哥");
           System.out.println("我的名字叫"+boss.getName()+"，我今年"+boss.getAge()+"岁");
           ((Boss) boss).getMoney();
           boss.work();
           boss.eat();
       }else {
           System.out.println("类型转换失败");
           return;
       }

        System.out.println("==============over==================");
        Boss boss1 = new Boss();
        boss1.setName("奥巴马");
        boss1.setAge(20);
        System.out.println("我的名字叫"+boss1.getName()+"，我今年"+boss1.getAge()+"岁");
        boss1.papa();
        boss1.momoda(boss1);
        boss1.getMoney();
        boss1.work();
        boss1.eat();

        System.out.println("==============over==================");

        PersonOther gg = new GG();
        if (gg instanceof PersonOther){
            gg.sleep();
            gg.diaoyu();
        }else {
            System.out.println("类型转换失败");
            return;
        }
    }
}
