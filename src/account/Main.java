package account;

import account.entity.CatEntity;
import account.entity.DogEntity;
import account.entity.Entity;
import account.entity.PersonEntity;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    private int num1;
    private int num2;
    private boolean toggle = true;
    private int count = 0;
    int answersTrues = 0;
    int answersFalses = 0;
    public static void main(String[] args) {
        Main main = new Main();
        PersonEntity person = new PersonEntity("Anar",1L,32);
        person.print();
        DogEntity dog = new DogEntity("cheep",2L,2);
        dog.print();
        CatEntity cat = new CatEntity("Kisa", 2L,3);
        cat.print();
        System.out.println(new Entity().hashCode());
        while (main.toggle)main.multi();
        System.out.println("Sizin "+ main.answersTrues+" doğru " + main.answersFalses + " yanlış cavabınız oldu!");

    }
    private void multi(){
        count++;
        if (count == 10) toggle =false;
        num1 = (int) Math.ceil(Math.random()*9);
        num2 = (int) Math.ceil(Math.random()*9);

        System.out.print(num1 + " * " + num2 + " = ");
        int sum = scanner.nextInt();
        if(sum == num1*num2) answersTrues++;
        else answersFalses++;
    }
}
