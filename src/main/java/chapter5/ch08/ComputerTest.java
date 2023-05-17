package chapter5.ch08;


class ComputerTest {
  public static void main(String[] args) {
    Computer deskTop = new DeskTop();
    deskTop.display();
    deskTop.turnOff();

    NoteBook myNoteBook = new MyNoteBook();
    myNoteBook.display();
    myNoteBook.typing();
  }

}