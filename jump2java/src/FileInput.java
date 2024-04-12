// 입력 함수
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// 출력 함수
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileInput {
    public static void main(String[] args) throws IOException {
        // FileOutputStream: Byte단위로 처리(String을 byte로 변환하여 저장)
        FileOutputStream output = new FileOutputStream(("./out.txt"));
        for (int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            output.write(data.getBytes());
        }
        output.close();

        // FileWriter: String 그대로 저장
        FileWriter fw = new FileWriter("./out.txt");    // 기존의 내용은 지워진다.
//        FileWriter fw = new FileWriter("./out.txt", true);    // 기존의 내용에 추가된다.
        for (int i=11; i<16; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        // PrintWriter: println(개행문자 자동 입력) 사용 가능
//        PrintWriter pw = new PrintWriter("./out.txt");    // 기존의 내용은 지워진다.
        PrintWriter pw = new PrintWriter(new FileWriter("./out.txt", true));    // 기존의 내용에 추가된다.
        for (int i=16; i<21; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        // 출력
        byte[] b2 = new byte[1024];     // 1024는 임의값. 값이 없는 원소는 " "(null)로 출력
        FileInputStream input2 = new FileInputStream("./out.txt");
        input2.read(b2);
        System.out.println(new String(b2));  // byte 배열을 문자열로 변환 출력
        input2.close();

        BufferedReader br = new BufferedReader(new FileReader(("./out.txt")));
        while (true) {
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();
    }
}
