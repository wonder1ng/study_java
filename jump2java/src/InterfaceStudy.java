//class Zoo {
//    String name;
//
//    void setName(String name) { this.name = name; }
//}
//class Mongkey extends Zoo {
//}
//class PolarBear extends Zoo {
//}
//class ZooKeeper {
//    void feed(Mongkey monkey) { System.out.println("feed apple" );
//    }
//
//    void feed(PolarBear polarbear) { System.out.println(("feed banana")); }
//}
//
//class Bouncer {
//    void barkAnimal(Zoo animal) {
//        if (animal instanceof Mongkey) {
//            System.out.println("원숭이");
//        } else if (animal instanceof PolarBear) {
//            System.out.println("북극곰");
//        }
//    }
//}
//public class InterfaceStudy {
//    public static void main(String[] args) {
//        ZooKeeper zooKeeper = new ZooKeeper();
//        Mongkey mongkey = new Mongkey();
//        PolarBear polarbear = new PolarBear();
//        zooKeeper.feed(mongkey);
//        zooKeeper.feed(polarbear);
//
//        Bouncer bouncer = new Bouncer();
//        bouncer.barkAnimal((mongkey));
//        bouncer.barkAnimal((polarbear));
//    }
//}

interface Predator {    // 인터페이스는 규칙.
    String getFood();   // abstract method

    default void printFood() {  // 디폴트 메서드: default로 선언. 오버라이딩 가능.
        System.out.printf("my food is %s\n", getFood());
    }
}

interface  Barkable {
    void bark();
}

interface BarkablePredator extends  Predator, Barkable {    // interface 다중 상속
}

// 추상 클래스 시작
abstract class ZooAnimal {	// 추상 클래스 선언
    String name;
    void setName(String name) { this.name = name; }
    abstract String absGetFood();  // 추상 메서드
    void absPrintFood() {   // 추상 클래스에서는 default 불가
        System.out.printf("my abstract food is %s\n", absGetFood());
    }

}
// 추상 클래스 종료

class Zoo {
    String name;

    void setName(String name) { this.name = name; }
}
class Mongkey extends Zoo implements Predator, Barkable {
    public String getFood() {       // getFood 메서드 미선언 시 추상 메서드 부재 오류
        return "apple";
    }
    public  void  bark() { System.out.println("원숭이"); }
}
class PolarBear extends Zoo implements BarkablePredator {
    public String getFood() { return "banana"; }
    public  void  bark() { System.out.println("북극곰"); }
}
class ZooKeeper {
    void feed(Predator predator) {  // 동물의 증감으로부터 독립
        System.out.println("feed "+predator.getFood());
    }
}
class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

// 추상 클래스 상속
class Tiger extends ZooAnimal implements BarkablePredator {
    public String absGetFood() { return "abstract meat"; }
    public String getFood() { return "meat"; }
    public  void  bark() { System.out.println("호랑이"); }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Mongkey mongkey = new Mongkey();
        PolarBear polarbear = new PolarBear();
        zooKeeper.feed(mongkey);
        zooKeeper.feed(polarbear);
        mongkey.printFood();
        polarbear.printFood();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal((mongkey));
        bouncer.barkAnimal(polarbear);
        System.out.println("==========");

        // 추상 클래스 사용
        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);
        tiger.absPrintFood();
        tiger.printFood();
        bouncer.barkAnimal((tiger));
        ZooAnimal zooAnimal = new ZooAnimal() {
            @Override
            String absGetFood() {
                return "추상화";
            }
        };
        zooAnimal.absPrintFood();
    }
}