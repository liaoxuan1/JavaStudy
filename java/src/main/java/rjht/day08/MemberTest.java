package rjht.day08;

/**
 * @Description 细节决定成败
 * @Date 2020/12/10 11:21
 * @Param 仁聚汇通信息科技有限责任公司
 * @Author liaoxuan
 **/
public class MemberTest {
    public static void main(String[] args) {
        Member son = new MemberSon();
        System.out.println(son.num);

        MemberSon memberSon = new MemberSon();
        System.out.println(memberSon.num);

    }
}
