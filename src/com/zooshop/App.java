package com.zooshop;

import com.zooshop.Animals.Cat;
import com.zooshop.Animals.Lizard;
import com.zooshop.Staff.Employee;
import com.zooshop.Staff.Manager;

import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();

//        System.out.println("Starting program, write 'emp' to show our employees");
//        String inputCommend = scanner.nextLine();

        //if (inputCommend.equals("emp")) {
        //shop.addingEmployees(new Employee(scanner.nextLine(),scanner.nextLine()));
//        shop.addingEmployees(new Employee("Grzegorz", "Kłos"));
//        shop.addingEmployees(new Employee("Tomasz", "Adamek"));
//        shop.printingEmplyees();
        // }
//        else{
//            System.out.println("Wrong commend! Start program again:");
//        }


//        System.out.println("Starting program, write 'man' to show our managers");
//        String inputCommend2 = scanner.nextLine();

        // if (inputCommend2.equals("man")) {
        //shop.addingEmployees(new Employee(scanner.nextLine(),scanner.nextLine()));
//        shop.addingManagers(new Manager("Zdzisław", "Kowalski"));
//
//        shop.printingManagers();
        //  }
//        else{
//            System.out.println("Wrong commend! Start program again:");
//        }
//
//        System.out.println("Write 'cats' to show our cats list");
//        String inputCommend3 = scanner.nextLine();

        //if (inputCommend3.equals("cats")) {
        //shop.addingEmployees(new Employee(scanner.nextLine(),scanner.nextLine()));
        shop.addingCats(new Cat(11.12, 20));
        shop.addingCats(new Cat(120.00, 2));
        shop.addingCats(new Cat(99.99, 5));
        shop.addingCats(new Cat(65.12, 1));
        shop.addingCats(new Cat(34.12, 6));

        shop.printingCats();

        // }
//        else{
//            System.out.println("Wrong commend! Start program again:");
//        }
//
//
//
//        System.out.println("Write 'liz' to show our cats list");
//        String inputCommend4 = scanner.nextLine();

        //if (inputCommend4.equals("liz")) {
        //shop.addingEmployees(new Employee(scanner.nextLine(),scanner.nextLine()));
        shop.addingLizards(new Lizard(22.22));
        shop.addingLizards(new Lizard(33.33));
        shop.addingLizards(new Lizard(64.22));
        shop.addingLizards(new Lizard(11.22));
        shop.printingLizards();
//        }
//        else{
//            System.out.println("Wrong commend! Start program again:");
//        }


        System.out.println();
        System.out.println("Good morning, who sold?");
//String seller = scanner.nextLine();
        System.out.println("Sorting cats!!!");
        shop.sort();

shop.printSortedTable();


        //shop.printCatFromTable();
        //shop.printSortedTable();
    }
}
