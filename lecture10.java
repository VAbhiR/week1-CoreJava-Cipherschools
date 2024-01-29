public class lecture10 {
  int rollno;
  String name;
  static int count = 0;

  lecture10(int rollno, String namString) {
      this.rollno = rollno;
      this.name = name;
      count++;
  }

  static void show() {// can only be contain static varibles thesee are created becuase to main single
                      // refrence  --used to do common task for all objects 
      System.out.println(count);
  }

  public static void main(String[] args) {
      lecture10 a = new lecture10(1, "sanjay");
      System.out.println(count);
      lecture10 b = new lecture10(1, "sanjay");
      System.out.println(count);
      lecture10 c = new lecture10(1, "sanjay");
      System.out.println(lecture10.count);
      lecture10.show();
  }
}