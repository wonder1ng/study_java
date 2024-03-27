// 클래스 블록
public class HelloWorld {
    /* 메서드 블록 */
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 2;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("----------");

        double a2 = 2;
        double b2 = 4;
        System.out.println(a2+b2);
        System.out.println(a2-b2);
        System.out.println(a2*b2);
        System.out.println(a2/b2);
        System.out.println(a2%b2);
        System.out.println("----------");

        int i =0;
        int j = 10;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);

        boolean isSuccess = true;
        boolean isTest = false;

        int base = 100;
        int height = 185;
        boolean isTall = height < base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        } else {System.out.println("키가 작습니다.");

        }
        boolean isOdd = base % 99 == 1;
        System.out.println(base % 99);
        System.out.println(isOdd);
    }
    public static void main2(String[] args) {
    }
}