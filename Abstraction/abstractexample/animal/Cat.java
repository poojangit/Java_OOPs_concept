package abstractexample.animal;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Cat sounds Meow!");
    }
    public void eat(){
        System.out.println("Cat is having fish");
    }
}
