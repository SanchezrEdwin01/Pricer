package com.example.UI;
import com.example.User;
import com.example.UI.SignUpUI;
import java.util.HashMap;
import java.util.Scanner;

public class SignInUI {

    static Scanner scan = new Scanner(System.in);

    static HashMap<String, String> registedUsers = new HashMap<>();

    public static void SigningIn(){

        System.out.println("Enter your user, please: ");
        String user = scan.nextLine();

        System.out.println("Please enter your password");
        String password = scan.nextLine();

        if (registedUsers.containsKey(user)){
            if(registedUsers.get(user).equals(password)){
                System.out.println("Bienvenido " + user);
            } else {
                System.out.println("Your password is incorrect");
            }
        } else {
            System.out.println("The user doesn't exist");
        }

    }

}
