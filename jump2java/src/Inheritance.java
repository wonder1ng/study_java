class Dog extends Animal {  // ClassStudy의 Animal 클래스 상속
    public void sleep() {
        System.out.println(this.name+" zzz");   // 클래스 확장
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName(("puppy"));
        System.out.println(dog.name);
        System.out.println(dog.getClass().getName());
        dog.sleep();
        Animal dog2 = new Dog();
//        Dog dog2 = new Animal();    // incompatible types 오류 발생
        dog2.setName("white");
        System.out.println(dog2.name);
        System.out.println(dog2.getClass().getName());
        dog2.sleep();               // cannot find symbol 오류 발생
        ((Dog) dog2).sleep();       // Dog로 다시 캐스팅해주어야 한다.
        System.out.println(dog2.getClass() == Dog.class);
        System.out.println(dog2 instanceof Dog);
    }
}
