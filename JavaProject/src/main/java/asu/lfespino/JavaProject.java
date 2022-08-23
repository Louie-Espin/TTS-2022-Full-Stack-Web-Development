package asu.lfespino;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaProject {

    private boolean is_running;
    private AddressBook addressBook;

    public JavaProject() {
        this.is_running = true;
        this.addressBook = new AddressBook();
    }

    public void run(Scanner scan) {
        System.out.println("Welcome!");

        while(is_running) {
            try {
                System.out.print(
                        "\n" +
                                "1) Add an entry.\n" +
                                "2) Remove an entry.\n" +
                                "3) Search the Address Book.\n" +
                                "4) Display Address Book entries.\n" +
                                "5) Delete all Address Book entries.\n" +
                                "6) Quit program.\n"
                );

                switch (scan.nextInt()) {
                    case 1:
                        this.runAdd(scan);
                        break;
                    case 2:
                        this.runRemove(scan);
                        break;
                    case 3:
                        this.runSearch(scan);
                        break;
                    case 4:
                        System.out.println(addressBook.toString());
                        break;
                    case 5:
                        System.out.println("IMPORTANT: Deleting all Address Book entries...");
                        addressBook.clear();
                        break;
                    case 6:
                        System.out.println("IMPORTANT: Quitting program...");
                        is_running = false;
                        break;
                    default:
                        System.out.println("Invalid input! Please enter numbers 1-6");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                scan.nextLine();
            }
        }
    }

    private void runAdd(Scanner scan) {
        scan.nextLine();

        System.out.print("First Name: ");
        String fName = scan.nextLine();

        System.out.print("Last Name: ");
        String lName = scan.nextLine();

        System.out.print("Phone Number: ");
        String pNum = scan.nextLine();

        System.out.print("Email Address: ");
        String email = scan.nextLine();

        if (addressBook.add(fName, lName, pNum, email)) System.out.println("Entry successfully added!");
        else System.out.println("ERROR: Entry could not be added as email is not unique.");
    }

    private void runRemove(Scanner scan) {
        scan.nextLine();

        System.out.print("Enter an entry's email to remove: ");
        String email = scan.nextLine();

        if (addressBook.remove(email)) System.out.println("Entry successfully removed!");
        else System.out.println("No entries found with given email.");
    }

    private void runSearch(Scanner scan) {
        scan.nextLine();

        String searchFor;
        int searchBy;

        System.out.print(
                "Search by?\n" +
                "1) Search by First Name.\n" +
                "2) Search by Last Name.\n" +
                "3) Search by Phone Number.\n" +
                "4) Search by Email.\n"
        );
        searchBy = scan.nextInt();

        scan.nextLine();
        System.out.print("Enter the subject of your search: ");
        searchFor = scan.nextLine();

        switch (searchBy) {
            case 1:
                System.out.println(addressBook.searchBy("fName", searchFor));
                break;
            case 2:
                System.out.println(addressBook.searchBy("lName", searchFor));
                break;
            case 3:
                System.out.println(addressBook.searchBy("pNum", searchFor));
                break;
            case 4:
                System.out.println(addressBook.searchBy("email", searchFor));
                break;
            default:
                System.out.println("Invalid input! Please enter numbers 1-4");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JavaProject obj = new JavaProject();
        obj.run(scan);
    }
}
