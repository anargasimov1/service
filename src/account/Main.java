package account;

import account.entity.CatEntity;
import account.entity.DogEntity;
import account.entity.Entity;
import account.entity.PersonEntity;

public class Main {
    public static void main(String[] args) {
        PersonEntity person = new PersonEntity("Anar",1L,32);
        person.print();
        DogEntity dog = new DogEntity("cheep",2L,2);
        dog.print();
        CatEntity cat = new CatEntity("Kisa", 2L,3);
        cat.print();
        new Entity();

    }
}
