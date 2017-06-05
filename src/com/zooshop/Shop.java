package com.zooshop;

import com.zooshop.Animals.Cat;
import com.zooshop.Animals.Lizard;
import com.zooshop.Staff.Employee;
import com.zooshop.Staff.Manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by RENT on 2017-06-05.
 */
public class Shop {

    public List<Employee> Employees = new ArrayList<>();
    public List<Manager> Managers = new ArrayList<>();
    public List<Cat> Cats = new ArrayList<>();
    public List<Lizard> Lizards = new ArrayList<>();
    public List<Cat> SortedCats = new ArrayList<>();


    public List<Employee> addingEmployees(Employee employee) {


        Employees.add(employee);

        return Employees;
    }


    public void printingEmplyees() {
        for (int i = 0; i < Employees.size(); i++) {
            System.out.println(Employees.get(i).getFirstName() + " " + Employees.get(i).getSurname());
        }

    }


    public List<Manager> addingManagers(Manager manager) {


        Managers.add(manager);

        return Managers;
    }


    public void printingManagers() {
        for (int i = 0; i < Managers.size(); i++) {
            System.out.println(Managers.get(i).getFirstName() + " " + Managers.get(i).getSurname());
        }

    }


    public List<Cat> addingCats(Cat cat) {


        Cats.add(cat);

        return Cats;
    }


    public void printingCats() {
        for (int i = 0; i < Cats.size(); i++) {
            System.out.println("Cat #" + (i + 1) + " age " + Cats.get(i).getAge() + " price " + Cats.get(i).getPrice());
        }
        System.out.println("We have " + Cats.size() + " cats in total");

    }


    public List<Lizard> addingLizards(Lizard lizard) {


        Lizards.add(lizard);

        return Lizards;
    }


    public void printingLizards() {
        for (int i = 0; i < Lizards.size(); i++) {
            System.out.println("Lizard #" + (i + 1) + " price " + Lizards.get(i).getPrice());
        }
        System.out.println("We have " + Lizards.size() + " lizards in total");
    }


    public Cat[] catstable = new Cat[3];

    public Cat[] makeTable() {


        for (int i = 0; i < catstable.length - 1; i++) {
            catstable[i] = Cats.get(i);
        }
        return catstable;
    }


    public Cat[] sort() {


        for (int i = 0; i < Cats.size() - 1; i++) {

            int index = i;
            for (int j = i + 1; j < catstable.length; j++) {
                if (catstable[j].getAge() < catstable[index].getAge()) {
                    index = j;

                    Cat psmall = catstable[index];
                    catstable[index] = catstable[i];
                    catstable[i] = psmall;

                }

            }
        }
        return catstable;
    }

    public void printSortedTable() {

        for (int i = 0; i < 2; i++) {
            System.out.println(catstable[i]);
        }
    }


}
