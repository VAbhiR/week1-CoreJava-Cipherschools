public class lecture7 {
  public static void main(String[] args) {
      char a='A';
      int xa=a;
      char k='0';
      int l=Character.digit(k, 10);
      System.out.println(l);
      System.out.println(xa+" "+Character.getNumericValue(k));
      char b='c';
      int ax=b-'a';
      System.out.println(ax);
  }
}