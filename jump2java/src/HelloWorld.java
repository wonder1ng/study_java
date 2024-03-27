import java.util.Arrays;

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
        i++;	// 1 증가 할당
        j--;	// 1 감소 할당
        System.out.println(i);
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);
        System.out.println(j);
        System.out.println("----------");

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
        System.out.println("----------");

        char c1 = 'c';		// 문자로 입력.
        char c2 = 99;		// 숫자로 입력.
        char c3 = '\u0061';	// 유니코드로 입력.
        // char c1 = 'cc';		// 오류 발생.
        // char c2 = 65536;		// 오류 발생. 최대 65535.
        // char c3 = '\uffff';	// 유니코드 최대값.
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("----------");

        String s1 = "Haapy Java";
        String s2 = "a";
        String s3 = new String("123");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("----------");

        String e1 = "hello";
        String e2 = "java";
        String e3 = new String("hello");
        String e4 = "hello";
        String e5 = new String("hello");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1 == e3);   // ==는 객체를 비교하는 것이기에 false
        System.out.println(e1 == e4);   // 리터럴로 생성했기에 같은 객체로 true
        System.out.println(e3 == e5);   // 다른 객체라 false
        System.out.println("----------");

        String i1 = "Hello Java";
        System.out.println(i1.indexOf("Java"));
        System.out.println(i1.indexOf("JAVA"));
        System.out.println(i1.indexOf("a", 8));
        System.out.println("----------");

        String con1 = "Hello Java";
        System.out.println(con1.contains("Java"));
        System.out.println(con1.contains("JAVA"));
        System.out.println("----------");

        String ca1 = "Hello Java";
        System.out.println(ca1.charAt(4));
        System.out.println("----------");

        String r1 = "Hello Java";
        System.out.println(r1.replaceAll("Java", "World"));
        System.out.println("----------");

        String subst1 = "Hello Java";
        System.out.println(subst1.substring(6, 10));
        System.out.println("----------");

        String up1 = "Hello Java";
        System.out.println(up1.toUpperCase());
        System.out.println(up1.toLowerCase());
        System.out.println("----------");

//        String sp1 = "a:b:c:d";
//        String[] result = sp1.split(":");
        String sp1 = "a:b:::c:d";
        String[] result = sp1.split(":");
        System.out.println(result);
        System.out.println(Arrays.toString(sp1.split(":")));
        System.out.println("----------");

        System.out.println(String.format("I eat %d apples.", 3));
        System.out.println(String.format("I eat %s apples.", "three"));
        System.out.println(String.format("I eat %s plus %s apples.", 3, "six"));
        System.out.println("----------");
    }
    public static void main2(String[] args) {
    }
}