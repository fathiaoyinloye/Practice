package Revisions;

public class HumanMain {
    public static void main (String... args) {
        Human fathia = new Human();
        System.out.println(fathia);


        fathia.setAge(12);
        fathia.setName("Fathia");
        fathia.setComplexion("Chocolate and Caramel oooweeiii");
        System.out.println(fathia);

        Human temmy = new Human("Omotemmy", 22,"Dark");
        System.out.println(temmy);

    }
}
