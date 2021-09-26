public class Person {
    private String name;
    private int age;

    public Person() {
        name = "A";
        age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Hello.");
    }

    public void speak(String message) {
        System.out.println(message);
    }

    public void eat() {
        System.out.println("I'm eat.");
    }

    public void eat(String food) {
        System.out.println("I'm eat " + food + ".");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
