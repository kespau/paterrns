package lt.kaunascoding.controller;

import lt.kaunascoding.model.AnimalSingelton;
import lt.kaunascoding.model.vo.IAnimal;
import lt.kaunascoding.view.Menu;

import java.util.Scanner;

public class Controller {
    public Controller() {

        int pasirinkimas = 0;
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();

        while (pasirinkimas != 3) {
            menu.showMenu();

            pasirinkimas = sc.nextInt();

            switch (pasirinkimas) {
                case 3:
                    break;

                case 1:
                    AnimalSingelton.getInstance().readAnimals();
                    System.out.println("Iš viso yra " + AnimalSingelton.getInstance().getAnimalsCount() + " gyvūnų");
                    break;

                case 2:
                    System.out.println("Iveskite gyvuno numeri nuo 0 iki " + (AnimalSingelton.getInstance().getAnimalsCount() - 1));
                    int index = sc.nextInt();
                    IAnimal obj = AnimalSingelton.getInstance().getAnimalByIndex(index);
                    System.out.println(obj);
                    break;

            }

        }


    }
}
