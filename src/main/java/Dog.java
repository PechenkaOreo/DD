public class Dog extends Animal implements Pet{
    public Dog(String name) {
        super(name);
    }

    void greets() {
        System.out.printf(super.getName()+ "says Woof");
    }
    void greets(Dog another){
        System.out.printf("Wooooof");
    }

    @Override
    public void feed() {
        System.out.printf("Feeding dog" + super.getName());
    }

    @Override
    public void walk() {
        System.out.printf("Walking dog" + super.getName());

    }

    @Override
    public void play() {
        System.out.printf("Playing with dog" + super.getName());
    }
}
