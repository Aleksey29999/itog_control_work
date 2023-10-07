import java.util.ArrayList;

//package ru.geekbrains;
public class Main {
    public static void main(String[] args) {

        ArrayList animalsList = new ArrayList();
        Cat barsik = new Cat(1, "Barsik", "комне", "2012-02-02");
        Dog tuzik = new Dog(2, "Tuzik", "место", "2020-03-03");
        Cat barsik1 = new Cat(3, "Barsik", "брысь", "2015-05-05");
        Donkey tuzik1 = new Donkey(4, "Tuzik", "фу", "2020-02-02");



        animalsList.add(barsik);
        animalsList.add(tuzik);
        animalsList.add(barsik1);
        animalsList.add(tuzik1);



        System.out.println(animalsList);

        System.out.printf("Общее Кол-во животных: %d\n",Animals.getCounter());
        System.out.printf("Кол-во домашних животных: %d\n",Home_Animals.getCounter());
        System.out.printf("Кол-во вьючных животных: %d\n",Pack_Animals.getCounter());
        System.out.printf("Кол-во собак животных: %d\n",Dog.getCounter());
        System.out.printf("Кол-во кошек ивотных: %d\n",Cat.getCounter());
        System.out.printf("Кол-во хомяков животных: %d\n",Hamster.getCounter());
        System.out.printf("Кол-во лошадей животных: %d\n",Horse.getCounter());
        System.out.printf("Кол-во верблюдов животных: %d\n",Camel.getCounter());
        System.out.printf("Кол-во ослов животных: %d\n",Donkey.getCounter());


}
}
