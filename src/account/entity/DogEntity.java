package account.entity;

public class DogEntity extends Entity{

    public DogEntity(String name, long id, int age) {
        super(name, id, age,true );
    }
    @Override
    public void print(){
        System.out.println("It is "+ super.getName()+ " it is my dog"+
                " she is have " +getAge()+ " old");
    }
}
