package com.Shalaka.LibrarySys;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        Admin admin = new Admin(1, "Admin");
        Student student = new Student(2, "Student");

        while (true) {
            System.out.println("\nLogin as:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int role = sc.nextInt();

            if (role == 1) {   // Admin menu
                System.out.println("\n--- Admin Menu ---");
                System.out.println("1. Add Book");
                System.out.println("2. Remove Book");
                System.out.println("3. Display Books");
                System.out.print("Choose: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: admin.requestbook(library, sc); break;
                    case 2: admin.returnbook(library, sc); break;
                    case 3: library.displaybook(); break;
                    default: System.out.println("Invalid choice");
                }
            }
            else if (role == 2) {   // Student menu
                System.out.println("\n--- Student Menu ---");
                System.out.println("1. Issue Book");
                System.out.println("2. Return Book");
                System.out.println("3. Display Books");
                System.out.print("Choose: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1: student.requestbook(library, sc); break;
                    case 2: student.returnbook(library, sc); break;
                    case 3: library.displaybook(); break;
                    default: System.out.println("Invalid choice");
                }
            }
            else if (role == 3) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else {
                System.out.println("Invalid role, try again!");
            }
        }
    }
}

