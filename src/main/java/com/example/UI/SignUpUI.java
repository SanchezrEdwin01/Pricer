package com.example.UI;
import com.example.User;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;

public class SignUpUI {
    static HashMap<String, String> userSignUp = new HashMap<>();
    public static void SigningUp(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, its a pleasure to have you here.");
        System.out.println("Please write your name: ");

        String userName = scan.nextLine();

        System.out.println("Thank you :)");
        System.out.println("Now, please provide the password that you want to have: ");

        String userPassWord = scan.nextLine();

        userSignUp.put(userName, userPassWord);

    }

}
