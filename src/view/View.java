package view;

import controller.UserController;
import model.User;

import java.util.Scanner;

public class View {
    private static final UserController userController
            = new UserController();
    public static void UI(){
        while(true){
            System.out.println("=".repeat(35));
            System.out.println("| 1. Show all user");
            System.out.println("| 2. Add user");
            System.out.println("| 3. Remove user");
            System.out.println("| 4. Exit");
            System.out.println("=".repeat(35));
            System.out.print("Insert Option: ");
            int option = new Scanner(System.in).nextInt();
            switch(option){
                case 1->{
                    System.out.println("This is view: ");
                    userController.getAllUsers().forEach(System.out::println);
                }
                case 2->{
                    System.out.print("Insert Name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("Insert Email: ");
                    String email = new Scanner(System.in).nextLine();
                    userController.addNewUser(new User((userController.getAllUsers().size() + 1), name, email));
                }
                case 3->{
                    System.out.println("Remove user by ID");
                    System.out.print("Insert ID to remove: ");
                    int id = new Scanner(System.in).nextInt();
                    userController.deleteUser(id);
                }
                case 4-> System.exit(0);
                default -> System.out.println("Invalid option!!");
            }
        }

    }
}
