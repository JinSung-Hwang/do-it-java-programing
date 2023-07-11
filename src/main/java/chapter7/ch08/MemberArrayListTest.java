package chapter7.ch08;

import java.util.ArrayList;

// ArrayList 활용
public class MemberArrayListTest {

  public static void main(String[] args) {
    MemberArrayList memberArrayList = new MemberArrayList();

    Member memberLee = new Member(1001, "이순신");
    Member memberKim = new Member(1002, "김유신");
    Member memberKang = new Member(1003, "강감찬");
    Member memberHong = new Member(1004, "홍길동");

    memberArrayList.addMember(memberLee);
    memberArrayList.addMember(memberKang);
    memberArrayList.addMember(memberKim);
    memberArrayList.addMember(memberHong);

    memberArrayList.showAllMembers();
    memberArrayList.removeMember(memberHong.getMemberId());
    System.out.println("------------------------------");
    memberArrayList.showAllMembers();

    memberArrayList.removeMember(1005);

//    ArrayList<Member> arrayList = new ArrayList<>();
//    arrayList.add(memberLee);
//    arrayList.add(memberKim);
//    arrayList.add(memberHong);
//    arrayList.add(memberKang);

//    arrayList.remove(memberKim); // arrayList.remove의 구현 코드를 살펴보면 found라는 Label Syntax를 한다.
                                   // 이것은 안티패턴이니 사용하려고하면 안된다. 그냥 무엇인지만 알아두자.

//    System.out.println(arrayList.contains(memberKim));

  }

}
