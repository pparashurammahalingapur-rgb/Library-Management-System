import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryManager library = new LibraryManager();

        int choice;

        do {

            System.out.println("\n========== Library Management ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid Input.");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book Title : ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author = sc.nextLine();

                    System.out.print("Enter ISBN : ");
                    String isbn = sc.nextLine();

                    System.out.print("Enter Publication Year : ");

                    int year;

                    while (!sc.hasNextInt()) {
                        System.out.println("Enter Valid Year.");
                        sc.next();
                    }

                    year = sc.nextInt();
                    sc.nextLine();

                    library.addBook(new Book(title, author, isbn, year));
                    break;

                case 2:

                    library.viewBooks();
                    break;

                case 3:

                    System.out.print("Enter ISBN to Update : ");
                    String updateISBN = sc.nextLine();

                    System.out.print("Enter New Title : ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author : ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Publication Year : ");

                    int newYear;

                    while (!sc.hasNextInt()) {
                        System.out.println("Invalid Year.");
                        sc.next();
                    }

                    newYear = sc.nextInt();
                    sc.nextLine();

                    library.updateBook(updateISBN, newTitle, newAuthor, newYear);

                    break;

                case 4:

                    System.out.print("Enter ISBN to Delete : ");
                    String deleteISBN = sc.nextLine();

                    library.deleteBook(deleteISBN);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();

    }
}