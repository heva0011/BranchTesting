public class Dog extends Animal {
    public Dog() {
        //super(name);
    }

    @Override
    public boolean makeSound() {
        System.out.println("woof");
        return true;
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}