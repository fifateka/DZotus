package otus.practice.dz;

import java.util.ArrayList;
import java.util.Scanner;
import Menu.CreateAnimalMenu;

public class Menu {
    Scanner scan;
    States currentState;
    ArrayList<Animal> animals = new ArrayList<>();

    public Menu(Scanner scanner) {
        this.scan = scanner;
    }

    void mainMenuState() {
        System.out.println("Меню:");
        System.out.println("Введите add для добавления животного");
        System.out.println("Введите list для вывода списка животных");
        System.out.println("Введите exit для выхода");

        Commands command = Commands.valueOf(scan.next().trim().toUpperCase());

        switch (command) {
            case ADD:
                this.currentState = States.KIND_INPUT;
                break;
            case LIST:
                this.currentState = States.LIST_VIEW;
                break;
            case EXIT:
                this.currentState = States.EXIT;
                break;
            default:
                System.out.println("Ввели не верное значение");
        }
    }

    public void start() {
        currentState = States.MENU;
        CreateAnimalMenu animalMenu = new CreateAnimalMenu(scan);

        while (!currentState.equals(States.EXIT)) {
            switch (currentState) {
                case MENU:
                    mainMenuState();
                    break;
                case KIND_INPUT:
                    animalMenu.inputAnimalKind();
                    currentState = States.NAME_INPUT;
                    break;
                case NAME_INPUT:
                    animalMenu.inputName();
                    currentState = States.AGE_INPUT;
                    break;
                case AGE_INPUT:
                    animalMenu.inputAge();
                    currentState = States.WEIGHT_INPUT;
                    break;
                case WEIGHT_INPUT:
                    animalMenu.inputWeight();
                    currentState = States.COLOR_INPUT;
                    break;
                case COLOR_INPUT:
                    animalMenu.inputColor();
                    currentState = States.ANIMAL_CREATED;
                    break;
                case ANIMAL_CREATED:
                    Animal createdAnimal = animalMenu.getAnimal();
                    animals.add(createdAnimal);
                    createdAnimal.Say();
                    currentState = States.MENU;
                    break;
                case LIST_VIEW:
                    if (animals.size() == 0)
                        System.out.println("Ой! А у нас здесь никого нет");

                    animals.forEach((animal -> {
                        System.out.println(animal.toString());
                    }));
                    currentState = States.MENU;
                    break;
                default:
                    currentState = States.MENU;
            }

            System.out.println("===================");
        }
    }
}