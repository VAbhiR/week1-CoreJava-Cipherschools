import java.util.Scanner;
class student{
    String name;
    int marks;
    boolean checkpass(){
        if(marks>=40){
            return true;
        }
        else{
            return false;
        }
    }
}
public class lecture8 {
    int max(int a ,int b,int c){
        if(a>b){
            if(a>c)
               return a;
        }
        else if(b>c){
            return b;
        }
        return c;
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.name="sanjay";
        s1.marks=30;
        student s2=new student();
        s2.name="matta";
        s2.marks=90;
        System.out.println(s1.checkpass());
        System.out.println(s2.checkpass());
        lecture8 c=new lecture8();
       System.out.println( c.max(20, 10, 3));
       Scanner sc=new Scanner(System.in);
        s1.name=sc.nextLine();
        s1.marks=sc.nextInt();
        System.out.println(s1.checkpass());
        char l='a';
        switch(l){
            case 'a':
            System.out.println("hi im a");
            break;
            case 'b':
            System.out.println("hi im b");
            break;
             default:
             System.out.println("hi im default");
        }
    }
}