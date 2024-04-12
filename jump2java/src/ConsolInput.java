import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class ConsolInput {
    public static void main(String[] args) throws IOException {
    // throws 예외 처리 관련 명령어인데 이게 있어야 in.read를 사용할 수 있다.
    // Scanner는 없어도 실행된다.
        InputStream in = System.in;     // 실행 시 콘솔창에 입력(python의 input)
        InputStreamReader reader = new InputStreamReader(in);

        int a;
        a = in.read();                    // 입력값을 아스키코드로 저장. 첫글자만 읽음.
        System.out.println(a);
        System.out.println(a);
        System.out.println("계속해서 첫 글자만 읽는다.");
        System.out.println("==========");


        byte[] b = new byte[3];
        int a2;
        a2 = in.read();
        in.read(b);
        System.out.println("변수를 할당해도 새로 입력하지 못하며 기존에 a가 읽은 다음 글자부터 시작한다.");
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println("==========");

        char[] c = new char[3];
        reader.read(c);
        System.out.println(c);
        System.out.println("b와 동일하게 남은 글자에서 가져갈 수 있는 만큼만 읽는다.");
        System.out.println("==========");

        BufferedReader br = new BufferedReader(reader);
        String d = br.readLine();
        System.out.println(d);
        System.out.println("readLine이라 남은 전부를 읽는다.");
        System.out.println("==========");

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        System.out.println("공백으로 구분하는 듯하다");
        System.out.println(sc.next());
        System.out.println(sc.nextLine());
        System.out.println("Scanner는 문자열이 끝나면 또 입력한다. in.read는 공백?을 읽어 0으로 나온다.");
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println("nextInt에 int 외의 것을 넣으면 오류가 발생하지만 순서를 잘 맞추면 된다.");
        System.out.println("==========");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.nextLine());
        System.out.println("Scanner는 새로 입력한다.");
    }
}