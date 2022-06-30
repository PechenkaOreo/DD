public class Wolf extends  Animal implements WildAnimal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void hunting() {
        System.out.printf("Wolf" + super.getName() + "goes hunting");

    }

    @Override
    void greets() {
        System.out.printf("Wolf" + super.getName()+ "says Hawoo ");
    }
}
