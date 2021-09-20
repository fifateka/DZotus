package Menu;

import otus.practice.dz.Animal;
import otus.practice.dz.Cat;
import otus.practice.dz.Dog;
import otus.practice.dz.Duck;

import java.util.Scanner;

enum AnimalKinds {
    CAT,
    DOG,
    DUCK
}

public class CreateAnimalMenu {
    Scanner scanner;
    Animal creatingAnimal;

    public CreateAnimalMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void inputAnimalKind() {
        System.out.println("Какое животное надо создать?");
        System.out.println("CAT");
        System.out.println("DOG");
        System.out.println("DUCK");

        AnimalKinds kind = AnimalKinds.valueOf(scanner.next().trim().toUpperCase());
        boolean correct = false;

        while (!correct) {
            correct = true;

            switch (kind) {
                case CAT:
                    creatingAnimal = new Cat();
                    break;
                case DOG:
                    creatingAnimal = new Dog();
                    break;
                case DUCK:
                    creatingAnimal = new Duck();
                    break;
                default:
                    System.out.println("Такого животного у нас нет!");
                    correct = false;
            }
        }
    }

    public void inputName() {
        System.out.println("Как зовут животное?");
        creatingAnimal.setName(scanner.next().trim());
    }

    public void inputAge() {
        System.out.println("Сколько лет животному?");
        creatingAnimal.setAge(Integer.parseInt(scanner.next().trim()));
    }

    public void inputWeight() {
        System.out.println("Сколько весит животное?");
        creatingAnimal.setWeight(Integer.parseInt(scanner.next().trim()));
    }

    public void inputColor() {
        System.out.println("Какого цвета животное?");
        creatingAnimal.setColor(scanner.next().trim());
    }

    public Animal getAnimal() {
        return creatingAnimal;
    }
}