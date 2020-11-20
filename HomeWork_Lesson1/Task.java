
public class Task {
    private String name;
    private String surname;
    private int age;
    private String description;


    public static void main(String[] args) {
        Task task = new Task("Masha", "Shevchuk", 25, "I like it");
        System.out.println(task.toString());
    }

    public Task (String personName, String personSurname, int personAge, String personDescription){
        name = personName;
        surname = personSurname;
        age = personAge;
        description = personDescription;
    }

    @Override
    public String toString() {
        return "My name is " + name + " " + surname + " I am " + age + " years old"
                + " I learn Java because " + description;

    }
}