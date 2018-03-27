
//              Умова
//Відділ садових інструментів. Реалізувати ієрархію садових інструментів, присутніх в магазині.
//Реалізувати пошук інструментів, необхідних для проведення профілактичних робіт з деревами.

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        // Connect scanner
        Scanner scanner = new Scanner(System.in);

        // create instruments in market
        Instruments instrument1 = new Instruments("Ножниці", "для саду");
        Instruments instrument2 = new Instruments("Лопата", "для саду");
        Instruments instrument3 = new Instruments("Лопата", "для снігу");
        Instruments instrument4 = new Instruments("Ножниці", "для паперу");
        Instruments instrument5 = new Instruments("Кісточка", "для саду");
        Instruments instrument6 = new Instruments("Кісточка", "для паперу");
        Instruments instrument7 = new Instruments("Граблі", "для саду");
        Instruments instrument8 = new Instruments("Граблі", "для городу");
        Instruments instrument9 = new Instruments("Газонокосарка", "для саду");
        Instruments instrument10 = new Instruments("Сокира", "для саду");


        Garden garden = new Garden();

        // add to instrumentsList
        garden.add(instrument1);
        garden.add(instrument2);
        garden.add(instrument3);
        garden.add(instrument4);
        garden.add(instrument5);
        garden.add(instrument6);
        garden.add(instrument7);
        garden.add(instrument8);
        garden.add(instrument9);
        garden.add(instrument10);

        System.out.println("Search by type or name: ");
        String actions = scanner.nextLine();
        if (actions.equals("type")) {
            // Enter name of instruments
            System.out.println("Enter name of instruments: ");
            String instrumentsName = scanner.nextLine();
            System.out.println("В нявності: " + garden.searchByType(instrumentsName));
        } else if (actions.equals("name")) {
            // Enter type of instruments
            System.out.println("Enter type of instruments: ");
            String instrumentsType = scanner.nextLine();
            System.out.println("Тип: " + garden.searchByName(instrumentsType));
        }
        else
            System.out.println("Error");
    }
}
