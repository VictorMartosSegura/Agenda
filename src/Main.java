import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        boolean exit=true;
        Agenda newContact = new Agenda();
        Persona p;

        while (exit) {
            System.out.println("Hellcome to the agenda, please choose an option:");
            System.out.println("   1. Create a new contact.");
            System.out.println("   2. Search for existing contacts.");
            System.out.println("   3. Update an existing contacts.");
            System.out.println("   4. Delete an existing contacts.");
            System.out.println("   5. Exit");

            switch (sc.nextLine()) {
                case "1":
                    newContact.createContact(sc);
                    break;
                case "2":
                    System.out.println();
                    System.out.println("Search menu, please choose an option:\n   " +
                            "1. Search all.\n   " +
                            "2. Search by name.\n   " +
                            "3. Search by surname.\n   " +
                            "4. Search by phone.\n   " +
                            "5. Search by email.\n   " +
                            "6. Back");
                    switch (sc.nextLine()){
                        case "1":
                            System.out.println();
                            newContact.searchByAll();
                            break;
                        case "2":
                            System.out.println();
                            p=newContact.searchContactByName(sc);

                            if(p!= null) p.Contact();
                            else System.out.println("Contact not found.\n");

                            break;
                        case "3":
                            System.out.println();
                            p=newContact.searchContactBySurname(sc);

                            if(p!= null) p.Contact();
                            else System.out.println("Contact not found.\n");

                            break;
                        case "4":
                            System.out.println();
                            p=newContact.searchContactByPhone(sc);

                            if(p!= null) p.Contact();
                            else System.out.println("Contact not found.\n");

                            break;
                        case "5":
                            System.out.println();
                            p=newContact.searchContactByEmail(sc);

                            if(p!= null) p.Contact();
                            else System.out.println("Contact not found.\n");

                            break;
                        case "6": System.out.println();//Back
                            break;
                        default: System.out.println("Invalid option.\n");
                            break;
                    }
                    break;
                case "3":
                    System.out.println();
                    p = newContact.updateContact(sc);
                    if (p == null) System.out.println("Contact not found. Please check the ID.\n");

                    break;
                case "4":
                    System.out.println();
                    newContact.deleteContact(sc);
                    break;
                case "5":
                    System.out.println("You have closed the agenda.");
                    exit=false;
                    break;
                default:
                    System.out.println("Invalid option.\n");
                    break;
            }
        }

    }
}