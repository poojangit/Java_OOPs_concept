package hybrid.animal;

public class Dolphin implements Mammal, Aquatic{
    @Override
    public void eat() {
        System.out.println("Dolphin eats");
    }
    @Override
    public void walk() {
        System.out.println("Dolphin cannot walk");
    }
    @Override
    public void swim() {
        System.out.println("Dolphin can swim");
    }
}
