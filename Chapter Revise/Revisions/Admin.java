package Revisions;

public class Admin {
    private String name;
    private int age;
    private static Admin onlyInstance;

    private Admin(){
        this.name = "default name";
    }


    public static Admin getOnlyInstance(){
        if(onlyInstance == null)  onlyInstance = new Admin();

        return onlyInstance;
    }
    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
