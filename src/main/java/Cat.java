public class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.printf(super.getName() + "says Meow");
    }

    @Override
    public void feed() {
        System.out.printf("Feeding cat" + super.getName());

    }

    @Override
    public void walk() {
        System.out.printf("Wlaking cat" + super.getName());

    }

    @Override
    public void play() {
        System.out.printf("Playing with cat" + super.getName());

    }
}
