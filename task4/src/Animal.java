public class Animal {
    protected String subspecies;
    protected String name;
    protected int age;

    public Animal (){}

    public Animal(String subspecies, String name, int age){
        this.subspecies = subspecies;
        this.name = name;
        this.age = age;
    }

    public void talk(){
        System.out.println("Sound of an animal!");
    }

}
