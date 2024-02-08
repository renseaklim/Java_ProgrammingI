package TaskEight;

public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String setName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
