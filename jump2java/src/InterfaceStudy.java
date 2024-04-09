//class Zoo {
//    String name;
//
//    void setName(String name) {
//        this.name = name;
//    }
//}
//class Mongkey extends Zoo {
//}
//class PolarBear extends Zoo {
//}
//class ZooKeeper {
//    void feed(Mongkey monkey) {
//        System.out.println("feed apple");
//    }
//
//    void feed(PolarBear polarbear) {
//        System.out.println(("feed banana"));
//    }
//}
//
//public class InterfaceStudy {
//    public static void main(String[] args) {
//        ZooKeeper zooKeeper = new ZooKeeper();
//        Mongkey mongkey = new Mongkey();
//        PolarBear polarbear = new PolarBear();
//        zooKeeper.feed(mongkey);
//        zooKeeper.feed(polarbear);
//    }
//}

interface Predator {    // 인터페이스는 규칙.
    String getFood();   // abstract method

    default void printFood() {  // 디폴트 메서드: default로 선언. 오버라이딩 가능.
        System.out.printf("my food is %s\n", getFood());
    }
}

class Zoo {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
class Mongkey extends Zoo implements Predator{
    public String getFood() {       // getFood 메서드 미선언 시 추상 메서드 부재 오류
        return "apple";
    }
}
class PolarBear extends Zoo implements Predator{
    public String getFood() {
        return "banana";
    }
}
class ZooKeeper {
    void feed(Predator predator) {  // 동물의 증감으로부터 독립
        System.out.println("feed "+predator.getFood());
    }
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
    }
}