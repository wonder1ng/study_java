class Dog extends Animal {  // ClassStudy의 Animal 클래스 상속
    void sleep() {
        System.out.println(this.name+" zzz");   // 클래스 확장
    }
}
class Housedog extends Dog {
    public void sleep() {      // 메서드 오버라이딩: 자식 클래스에서 동일 메서드 다른 산출
    // 오버라이딩 한 메서드는 더 좁은 권한을 줄 수 없음. protected->public은 가능하지만 public->protected 불가
        System.out.println(this.name+" zzz in house");
    }
    void sleep(int hour) {   // 메서드 오버로딩: 메서드명은 같지만 매개 변수 상이
        System.out.println(this.name+" zzz in house for "+hour+" hours");
    }
}
// 생성자
class ConstructorDog extends Housedog {
//    ConstructorDog(String name) {
//    } // 기본(Default) 생성자: 생성자만 존재. 미기재 시 컴파일러가 자동 생성.
    ConstructorDog(String name) {   // 클래스명과 동일. 산출값 미정의
        this.setName(name);
    }
    ConstructorDog(int type) {  // 생성자 오버로딩
        if (type==1) {
            this.setName("Jindo");
        } else if (type==2) {
            this.setName("sabsal");
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //메서드
        Dog dog = new Dog();
        dog.setName(("puppy"));
        System.out.println(dog.name);
        System.out.println(dog.getClass().getName());
        dog.sleep();
        System.out.println("==========");

        // 상속
        Animal dog2 = new Dog();
//        Dog dog2 = new Animal();    // incompatible types 오류 발생
        dog2.setName("white");
        System.out.println(dog2.name);
        System.out.println(dog2.getClass().getName());
//        dog2.sleep();               // cannot find symbol 오류 발생
        ((Dog) dog2).sleep();       // Dog로 다시 캐스팅해주어야 한다.
        System.out.println(dog2.getClass() == Dog.class);   // Animal의 기능만 있지만 Dog로 인식
        System.out.println(dog2 instanceof Dog);            // Animal의 기능만 있지만 Dog로 인식
        System.out.println("==========");

        // 오버라이딩
        Housedog dog3 = new Housedog();
        dog3.name = "happy";
        dog3.sleep();
        dog3.sleep(4);
        System.out.println("==========");

        // 생성자
        ConstructorDog dog4 = new ConstructorDog("choko");
        ConstructorDog dog5 = new ConstructorDog(2);
        dog4.sleep(3);
        dog5.sleep();
        System.out.println("==========");

        // 상속 메서드 관계 확인
        C temp = new C();
        temp.msg();			// 마지막에 상속된 메서드 실행
        temp.msg2();        // B에서 구현하지 않아도 A의 메서드까지 모두 상속
        A temp3 = new B();
        temp3.msg();        // B의 메서드 실행
        System.out.println(temp3.getClass() == A.class);    // false: 참조하는 실제 객체의 클래스 비교
        System.out.println(temp3 instanceof A);             // true:  A의 인스턴스인지 확인. GPT가 알려준 차이인데 잘 모르겠다.
        System.out.println(temp3.getClass() == B.class);
        System.out.println(temp3 instanceof B);
    }
}
class A {
    public void msg() {
        System.out.println("A message");
    }
    public void msg2() {
        System.out.println("A message2");
    }
}

class B extends A{
    public void msg() {
        System.out.println("B message");
    }
}
class C extends B {
}