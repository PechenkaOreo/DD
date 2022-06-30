public class Lion extends  Animal implements WildAnimal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void hunting() {
        System.out.printf("Lion" + getName() + "goes hunting");

    }

    @Override
    void greets() {
        System.out.printf("Lion"+ super.getName() + "says Roar");
    }
}
