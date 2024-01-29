
public class lecture6 {
  public static void main(String[] args) {
      int x=5;
      int y=7;
      System.out.println("x is" + x);

      byte b2=(byte)129;
      System.out.println("b2 is"+ b2);
      byte b3=(byte)128;
      System.out.println("b3 is"+ b3);
      byte b4=(byte)256;
      System.out.println("b4 is"+ b4);

      float f=(float)5.5;
      double d=2.65;
      //char to string
      char ch='2';
      int z=Character.getNumericValue(ch);
      System.out.println(z);
      int k='3';
      System.out.println(Character.digit(k, 11));

      //incrementor and decrementor
      int a=10;
      int m=a++;
      System.out.println(m);
      System.out.println(a+" "+a++ + " "+ ++a);
      System.out.println(a+" "+a-- + " "+ --a);
  }
}