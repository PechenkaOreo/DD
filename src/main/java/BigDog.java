public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.printf("Woow");;
    }

    @Override
    void greets(Dog another) {
        System.out.printf("Woooow");;
    }
    void greets(BigDog another){
        System.out.printf("Wooooooow");
    }

}
