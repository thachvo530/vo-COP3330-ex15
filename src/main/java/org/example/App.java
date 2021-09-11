/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        String correctpass = "abc$123";

        System.out.print("What is the password? ");
        Scanner password = new Scanner(System.in);
        String password1 = password.next();

        if (password1.equals(correctpass)) {

            System.out.print("Welcome!");
        }

        else {
            System.out.print("I don't know you.");
        }


    }
}
