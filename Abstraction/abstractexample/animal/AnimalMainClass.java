package abstractexample.animal;

public class AnimalMainClass {
   public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.sound();
    dog.eat();
    cat.sound();
    cat.eat();
   }
    
}
