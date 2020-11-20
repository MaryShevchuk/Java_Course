public class Dog extends Animal {
    public Dog(String subspecies, String name, int age) {
        super(subspecies, name, age);
    }
    public void talkDog(){
        System.out.println("Гав!");
    }

    @Override
    public void talk() {
        System.out.println("Woof!");
    }
}
