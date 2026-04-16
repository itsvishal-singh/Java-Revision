/*

*/
class Computer {
  public void playMusic() {
    System.out.println("Playing Music");
  }

  public String getMePen(int cost) {
    if (cost >= 10)
      return "Pen";
    return "No Pen";
  }
}

public class OOP_ {
  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.playMusic();
    String pen = computer.getMePen(5);
    System.out.println(pen);
  }
}
