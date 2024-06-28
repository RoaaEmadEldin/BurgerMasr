import Mains.AdminMain;
import Mains.UsersMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Choose Who Are You:\n 1. User\n 2. Admin");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            UsersMain usersMain = new UsersMain(scanner);
        }
        else{
            AdminMain adminMain = new AdminMain(scanner);
        }
    }
}