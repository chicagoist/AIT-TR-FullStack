package ait;


import ait.controllers.UserController;
import ait.controllers.UserControllerConsoleImpl;
import ait.model.User;
import ait.model.UserServiceImpl;
import ait.repositories.UserRepository;
import ait.repositories.UserRepositoryList;
import ait.services.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserRepository repository = new UserRepositoryList();
        UserService service = new UserServiceImpl(repository);
        UserController controller = new UserControllerConsoleImpl(service);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create User");
            System.out.println("2. View All Users");
            System.out.println("3. View User by ID");
            System.out.println("4. View User by email");
            System.out.println("5. Update User");
            System.out.println("6. Delete User");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch(choice) {
                case 1:
                    controller.create();
                    break;
                case 2:
                    controller.printAll();
                    break;
                case 3:
                    User userById = controller.getById();
                    if(userById != null) {
                        System.out.println(userById);
                    }
                    break;
                case 4:
                    User userByEmail = controller.getByEmail();
                    if(userByEmail != null) {
                        System.out.println(userByEmail);
                    }
                    break;
                case 5:
                    controller.update();
                    break;
                case 6:
                    controller.delete();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

    }
}
