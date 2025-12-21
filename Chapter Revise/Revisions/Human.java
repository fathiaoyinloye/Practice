package Revisions;

public class Human {
    private String name;
    private int age;
    private String complexion;

    public Human() {

    }

    public Human(String name, int age, String complexion) {
        this.name = name;
        this.age = age;
        this.complexion = complexion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    @Override
    public String toString() {
        return "My name is " +
                name + ".\n" +
                "I am " + age + " years old.\n" +
                "I am " + complexion + " in complexion.\n";
    }
}
