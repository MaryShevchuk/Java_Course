public class Main {
   public static void main(String[] args) {
      Animal animal = new Animal();
      animal.talk();

      Cat cat = new Cat("cat", "Barsik", 5);
      cat.talk();
      System.out.println("This " + cat.subspecies + " name is " + cat.name + ". " + cat.name + " is " + cat.age + " years old!");

      Dog dog = new Dog ("dog", "Bim", 7);
      dog.talk();
      System.out.println("This " + dog.subspecies + " name is " + dog.name + ". " + dog.name + " is " + dog.age + " years old!");



   }

}