package account.entity;

public class CatEntity extends Entity{

    public CatEntity(String name, long id, int age) {
        super(name, id, age, true);

    }

    @Override
    public void print(){
        System.out.println("It is "+super.getName()+" she is my cat and she is have "+super.getAge());
    }
}
