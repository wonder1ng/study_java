import java.util.*;

// 클래스 블록
public class HelloWorld {
    enum CoffeType {
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    };
    /* 메서드 블록 */
    public static void main(String[] args) {
        // Heello World
        System.out.println("Hello World");

        // 숫자 자료형
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

        // 문자 및 문자열 자료형
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

        String sp1 = "a:b:::c:d";
        String[] result = sp1.split(":");
        System.out.println(result);     // 출력 시 메모리값 출력
        System.out.println(Arrays.toString(sp1.split(":")));
        System.out.println("----------");

        System.out.println(String.format("I eat %d apples.", 3));					// 숫자
        System.out.println(String.format("I eat %d123 apples.", 3));				// 숫자 뒤 붙이기
        System.out.println(String.format("I eat %09.1f apples.", 3141.592));		// 9개 자리수에 0을 채우고 소수 첫자리까지 반올림
        System.out.println(String.format("I eat %s apples.", "three"));				// 문자
        System.out.println(String.format("I eat %s plus %s apples.", 3, "six"));	// 숫자를 문자로
        System.out.println(String.format("I %4s fine.", "am"));						// 4글자에 우측정렬
        System.out.println(String.format("I %-4s fine.", "am"));					// 4글자에 좌측정렬
        System.out.printf("I eat %d apples.\n", 3);		// String.format은 문자 자체를 포맷팅, printf는 출력문을 포맷팅
        System.out.println("----------");

        StringBuffer sb = new StringBuffer();	// 생성 시 문자열 입력 가능
        sb.append("hello");			// 문자열 추가
        sb.append(" ");
        sb.append("jump to java");
        String res = sb.toString();
        System.out.println(res);
        sb.insert(5, " amaging");	// 목표 인덱스에 삽입
        System.out.println(sb);     // 그냥도 출력 되네??
        System.out.println(sb.substring(0,5));

        String res2 = "";
        res2 += "hello";
        res2 += " ";
        res2 += "jump to java";
        System.out.println(res2);   // 출력 결과는 같지만 String 객체가 4개 생성되었다.
        System.out.println("----------");

        // 배열 자료형
        int[] odds = {1, 3, 5, 6, 7, 1, 3,};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
        System.out.println(Arrays.toString(odds));
        System.out.println(Arrays.toString(weeks));

        String[] weeks2 = new String[7];	// 배열 길이 설정 후 값 할당 가능.
        System.out.println(Arrays.toString(weeks2));
        weeks2[1] = "월";
        weeks2[2] = "화";
        weeks2[3] = "수";
        weeks2[4] = "목";
        weeks2[5] = "금";
        weeks2[6] = "토";
//        weeks2[7] = "일";		// 미리 설정한 인덱스 범위를 초과하여 오류 발생.
        System.out.println(Arrays.toString(odds));
        System.out.println(weeks2[5]);
        System.out.println(Arrays.toString(weeks2));
        System.out.println(weeks2.length);
        System.out.println("----------");

        // 리스트 자료형
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("142");
        pitches.add("129");
        System.out.println((pitches));
        pitches.add(1, "133");          // 목표 인덱스에 값 삽입
        System.out.println(pitches);

        System.out.println(pitches.get(2));             // 목표 인덱스 값 반환
//        System.out.println(pitches[2]);               // 문법 오류
        System.out.println(pitches.size());             // 리스트 크기 출력
        System.out.println(pitches.contains("142"));    // 리스트 원소에 존재하는지 판별
        System.out.println(pitches.remove("142"));   // 해당 원소 제거.
        System.out.println(pitches.remove("142"));   // 제거 실패 시 false.
        System.out.println(pitches);
        System.out.println(pitches.remove(1));
        System.out.println(pitches);
//        System.out.println(pitches.remove(3));        // 범위 오류
//        System.out.println((Arrays.toString(pitches));   // 오류 발생
        System.out.println("----------");

        // 제네릭스
//        ArrayList<String> geTmp1 = new ArrayList<String>(); // 기본 방식
//        ArrayList<String> geTmp2 = new ArrayList<>();       // 선호 방식

        // 제네릭스 미사용
        ArrayList geTmp1 = new ArrayList();
        geTmp1.add(138);
        geTmp1.add(129);
        System.out.println(geTmp1);
        Integer one = (Integer) geTmp1.get(0);
//        Integer two = geTmp1.get(1);             // type 오류 발생
        java.lang.Object two = geTmp1.get(1);    // Object는 최상위 클래스 및 자료형. 제네릭스 미사용 시 Object로 인식.
        System.out.println(one.getClass().getName());
        System.out.println(two.getClass().getName());   // 근데 출력은 Integer로 된다. 받고나서 자동으로 형변환된다고 GPT가 말했다.
        // 제네릭스 사용
        ArrayList<Integer> geTmp2 = new ArrayList<>();
        geTmp2.add(138);
        geTmp2.add(129);
        Integer one2 = geTmp2.get(1);   // .get()에서 형변환 하지 않음.
        Integer two2 = geTmp2.get(0);
        System.out.println(one2.getClass().getName());
        System.out.println(two2.getClass().getName());
        System.out.println("----------");

        // add, join, 정렬
        String[] data = {"138", "129", "142"};
        ArrayList<String> geTmp3 = new ArrayList<>(Arrays.asList(data));
        System.out.println(geTmp3);
//        geTmp3.add(Arrays.asList(data));    // 자료형 오류 발생. 각 원소 별로 넣어줘야 한다.
        Collections.addAll(geTmp3, data);   // 한벙에 넣기위해 Collections.addAll 사용.
        System.out.println(geTmp3);

        String geTmp3Res = String.join(", ", geTmp3);   // 각 원소 뒤에 구분자 입력
        System.out.println(geTmp3Res);
        System.out.println(geTmp3.toString());      // .toString으로 출력 시 대괄호도 나온다.

        geTmp3.sort(Comparator.naturalOrder());     // 정순
        System.out.println(geTmp3);
        geTmp3.sort(Comparator.reverseOrder());     // 역순
        System.out.println(geTmp3);
        System.out.println("----------");

        // 맵(Map)
        HashMap<String, String> map = new HashMap<>();  // 형식을 배열로 설정하면 배열도 기입 가능.
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.toString());
        System.out.println(map.get("people"));
        System.out.println(map.get("사람"));      // .get은 키로만 조회한다.
        System.out.println(map.getOrDefault("사람", "없음")); // null 대신 특정값 출력
        System.out.println(map.containsKey("people"));  // key에 대한 true, false 반환
        System.out.println(map.containsValue("사람"));    // value에 대한 true, false 반환
        System.out.println(map.keySet());       // key 전체
        System.out.println(map.values());       // value 전체
        System.out.println(map.entrySet());     // key, value 전체
        System.out.println(map.remove("people")); // 해당 키 삭제
        System.out.println(map.size());     // key 갯수 출력
        System.out.println("----------");

        // 집합(Set)
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);       // intersection와 set2의 교집합, 바로 출력하면 작동 여부 반환
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);      // union과 set2의 합집합

        HashSet<Integer> substract = new HashSet<>(set1);
        substract.removeAll(set2);
        System.out.println(substract);      // substract와 set2의 차집합
        System.out.println("----------");

        // enum 상수 집합
//        enum CoffeType {
//            AMERICANO, ICE_AMERICANO, CAFE_LATTE
//        };
        System.out.println(CoffeType.AMERICANO);
        System.out.println(CoffeType.ICE_AMERICANO);
        System.out.println(CoffeType.CAFE_LATTE);
        System.out.println("----------");

        // 형 변환
        String num = "123";
//        Integer n = num;    // incompatible types 오류 발생
        Integer n = Integer.parseInt(num);
        System.out.println(n +" " + n.getClass().getName());
//        num = n + 456;          // incompatible types 오류 발생
        num = "" + n + 456;         // 어떤 문자열이든 +로 합치면 변환
        System.out.println(num +" " + num.getClass().getName());
        num = String.valueOf(n);    // 문자 변환
        System.out.println(num +" " + num.getClass().getName());
        num = Integer.toString(n+456);  // 문자 변환
        System.out.println(num +" " + num.getClass().getName());

        int n1 = 123;   // 원시 자료형은 .getClass().getName()이 안 된다.
        double d1 = n1;
        System.out.println((d1));

        double d2 = 123.678;    // 버림
//        int n2 = d2;      오류 발생
        int n2 = (int) d2;
        System.out.println(n2);

    }
}