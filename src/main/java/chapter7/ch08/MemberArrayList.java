package chapter7.ch08;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

  private ArrayList<Member> arrayList;

  public MemberArrayList() {
    arrayList = new ArrayList<>();
  }

  public void addMember(Member member) {
    arrayList.add(member);
  }

  // 요소 순회란?
  //   컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
  //   순서가 있는 List인터페이스의 경우는 Iterator를 사용하지 않고 get(i)메서드를 활용할 수 있음
  //   set 인터페이스의 경우 get(i)메서드가 제공되지 않으므로 iterator를 활용하여 객체를 순회함
  public boolean removeMember(int memberId) {
//    for (int i = 0; i < arrayList.size() ; i++) {
//      Member member = arrayList.get(i);
//      if(member.getMemberId() == memberId) {
//        arrayList.remove(i);
//        return true;
//      }
//    }
    // 위 반복을 Iterator로 리펙토링해봄
    Iterator<Member> ir = arrayList.iterator();
    while(ir.hasNext()) {
      Member member = ir.next();
      if (member.getMemberId() == memberId) {
        arrayList.remove(member);
        return true;
      }
    }

    System.out.println(memberId + "가 존재하지 않습니다.");
    return false;
  }

  public void showAllMembers() {
//    for (int i = 0; i < arrayList.size() ; i++) {
//      Member member = arrayList.get(i);
//      System.out.println(member);
//    }
    // 위 코드를 iterator로 리펙토링해봄
    Iterator<Member> ir = arrayList.iterator();
    while(ir.hasNext()) {
//      Member member = ir.next();
      System.out.println(ir.next());
    }


  }

}
