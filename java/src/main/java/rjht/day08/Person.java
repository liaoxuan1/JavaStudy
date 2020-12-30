package rjht.day08;

/**
 * @Description 细节决定成败
 * @Date 2020/12/10 15:15
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
abstract class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();
    public abstract void eat();

    public void papa(){
        System.out.println("怕怕我的爱");
    }


}
