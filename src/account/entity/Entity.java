package account.entity;

public class Entity {

    private String name;
    private long id;
    private int age;

    boolean isAnimal;
    public Entity(){
        System.out.println("default constructor is working");
    }
    public Entity(String name, long id, int age, boolean isAnimal) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAnimal() {
        return isAnimal;
    }

    public void setAnimal(boolean animal) {
        isAnimal = animal;
    }

    public void print(){}
}
