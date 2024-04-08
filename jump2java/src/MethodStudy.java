public class MethodStudy {
    int num=0;
    int sum(int a, int b) { // a, b는 매개변수
        return a+b;         // a, b는 매개변수
    }
    void sub(int a, int b) {    // 출력값이 없을 경우 void
        System.out.println("입력값은 있지만 출력값은 없음");
    }
    void mul() {
        System.out.println("입력값도 출력값도 없음");
    }
    String div() {
        System.out.print("인스턴스 객체인 num 출력: "+this.num+"\n");
        this.num++;
        int a = 1000; int b = 5;
        int c = a/b;
        return "입력값은 없지만 출력값은 있음\n"
                +"인스턴스의 값은 영향을 받아(저장) 값이 바뀐 num 출력: "+this.num+"\n"
                +"메서드 안에서 c가 "+c+"으로 변경되었지만 매개변수라서 메서드 밖의 변수에 영향 주지 않음.\n";
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        MethodStudy sample = new MethodStudy();
        int c = sample.sum(a, b);   // a, b는 인수
        System.out.println(c);
        sample.sub(a, b);
//        System.out.println(sample.sub(a, b));   // 'void' type not allowed here 오류 발생
        sample.mul();
        System.out.println(sample.div());
        System.out.println("기존 값이 그대로 유지되어 3+4+7 = 14를 반환");
        System.out.println(a+b+c);  // 기존 값이 그대로 유지됨.
    }
}