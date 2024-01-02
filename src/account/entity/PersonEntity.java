package account.entity;

public class PersonEntity extends Entity {

    public PersonEntity(String name, long id, int age) {
        super(name,id,age,false);
    }
    @Override
    public void print(){
        System.out.println("Is it " +super.getName()+ " and his have " +super.getAge()
        + " old years.");
    }
}
