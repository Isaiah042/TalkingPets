public class Dog extends Pets{


//    public Dog(String name) {
//        super(name);
//    }

    @Override
    public void speak() {
        System.out.println("My name is " + getName() + " I'll eat anything, Woof Woof");
    }
}

