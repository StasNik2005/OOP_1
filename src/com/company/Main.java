package com.company;

import com.company.classes.User;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
//        user.setName("Cfhcgtuj");
//        user.setLogin("Stas2005");
//        user.setPassword("********");
        Scanner scanner = new Scanner(System.in);
/*
        do{
            System.out.println("Input UserName (starting with UpperCase Letter): ");
            user.setName(scanner.nextLine());
        }while (user.getName()==null);

        do{
            System.out.println("Input login (not empty): ");
            user.setLogin(scanner.nextLine());
        }while(user.getLogin()==null);

        do{
            System.out.println("Input password (at least 8 chars): ");
            user.setPassword(scanner.nextLine());
        }while(user.getPassword()==null);

        do{
            System.out.println("Input your height: ");
            user.setHeight(scanner.nextInt());
        }while(user.getHeight()==-1);
*/
user.generatePassword(10);
//        System.out.println(user.getName());
//        System.out.println(user.getLogin());
//        System.out.println(user.getPassword());
user.setBirthday(new Date(2019-1900, 9, 18));
        System.out.println(user);
    }
}
