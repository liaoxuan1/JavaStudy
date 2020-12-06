package rjht.day05.demo;

/**
 * @Description 细节决定成败
 * @Date 2020/12/4 11:34
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class Goods {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String word;
    int money;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", word='" + word + '\'' +
                ", money=" + money +
                '}';
    }
}
