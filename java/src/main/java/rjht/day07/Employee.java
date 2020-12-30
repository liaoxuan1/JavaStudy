package rjht.day07;

/**
 * @Description 细节决定成败
 * @Date 2020/12/9 17:14
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        抽象员工类
 */
abstract class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void work();

    public void work1(){
        System.out.println("父类的工作1");
    }

    private void work2(){
        System.out.println("父类自己的工作");
    }
}
