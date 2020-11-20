public class Cat extends Animal {
    public Cat(String subspecies, String name, int age) {
        super(subspecies, name, age);
    }

    public void talkCat(){
        System.out.println("Mур!");
    }

    @Override
    public void talk() {
        System.out.println("Meow!");
    }

}
