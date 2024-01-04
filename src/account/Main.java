package account;

import account.entity.CatEntity;
import account.entity.DogEntity;
import account.entity.Entity;
import account.entity.PersonEntity;

import java.util.Scanner;


public class Main {
    Scanner scanner = new Scanner(System.in);
    private double num1;
    private double num2;
    public static void main(String[] args) {
        Main main = new Main();
        PersonEntity person = new PersonEntity("Anar",1L,32);
        person.print();
        DogEntity dog = new DogEntity("cheep",2L,2);
        dog.print();
        CatEntity cat = new CatEntity("Kisa", 2L,3);
        cat.print();
        System.out.println(new Entity().hashCode());
        main.multi();

    }
    private void multi(){
        num1 = Math.ceil(Math.random()*9);
        num2 = Math.ceil(Math.random()*9);
        System.out.println(num1 + "*" + num2);

        double sum = scanner.nextDouble();
        if(sum == num1*num2) System.out.println("well done!");
        else System.out.println("wrong!");
    }
}
