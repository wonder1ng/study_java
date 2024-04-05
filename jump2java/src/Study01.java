class Animal{
    String name;    // 객체 변수

    public void setName(String name) {  // 메서드
        this.name = name;   // this: 현재 사용하는 인스터스를 의미(파이썬의 self)
    }
}
public class Study01 {
    public static void main(String[] args) {
        Animal cat = new Animal();      // 인스턴스
        System.out.println(cat+" Type: "+cat.getClass().getName());
        System.out.println(cat.name);   // 미할당 상태라 null
        cat.name = "nabi";              // 자료형은 클래스에서 선언되었기에 입력 불요.
//        int cat.name = 123;           // 오류 발생
        System.out.println(cat.name+" Type: "+cat.name.getClass().getName());
        cat.setName("kiti");            // 메서드 사용
        System.out.println(cat.name+" Type: "+cat.name.getClass().getName());
    }
}