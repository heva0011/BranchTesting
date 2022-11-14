public class Cat extends Animal {
    public Cat() {
     //   super(name);
    }

    @Override
    public boolean makeSound() {
        System.out.println("meow");
        return true;
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
