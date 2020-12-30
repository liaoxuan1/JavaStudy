package rjht.day06;

/**
 * @Description 细节决定成败
 * @Date 2020/12/11 14:18
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/

/*
        测试封装，private关键字
 */
public class Test001 {
    private String name;
    private  int id;

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

    private void work1(Test002 a){
        System.out.println("这是方法1");
    }

    public void work2(){
        System.out.println("这是方法2");
    }
}
