package otus.practice.dz;

public class Duck extends Animal implements Flying {

    @Override
    public void Say() {
        super.Say();
        System.out.println("Кря");
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}