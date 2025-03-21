import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class TUI {
    Scanner sc = new Scanner(System.in);
    private InputStream inputStream;

    public int showMainMenu(){
        System.out.println("Hellcome to the agenda, please choose an option:\n    " +
                                "1. Create a new contact.\n    " +
                                "2. Search for existing contacts.\n    " +
                                "3. Update an existing contacts.\n    " +
                                "4. Delete an existing contacts.\n    " +
                                "5. Exit");
        int option= sc.nextInt();
        sc.nextLine();
        return option;
    }
    public int showSearchMenu(){
        System.out.println();
        System.out.println("Search menu, please choose an option:\n   " +
                                "1. Search all.\n   " +
                                "2. Search by name.\n   " +
                                "3. Search by surname.\n   " +
                                "4. Search by phone.\n   " +
                                "5. Search by email.\n   " +
                                "6. Back");

        int option= sc.nextInt();
        sc.nextLine();
        return option;
    }
    public String[] requestDataNewContact(){
        String[] newContact = new String[4];
        System.out.println("Please, write the contact's name:");
        newContact[0] = sc.nextLine();
        System.out.println("Please, write the contact's surname:");
        newContact[1] = sc.nextLine();
        System.out.println("Please, write the contact's phone:");
        newContact[2] = sc.nextLine();
        System.out.println("Please, write the contact's email:");
        newContact[3] = sc.nextLine();
        return newContact;
    }
    public void showByAll(List<Persona> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("The agenda is empty. Create a new contact.\n");

        } else {
            System.out.println("Contacts in the agenda:");
            for (Persona p : contacts) {
                System.out.println(p.toString());
            }
        }

    }
    public String requestSearchData(String camp){
        System.out.println("Please, write the contact's "+ camp +" to search:\n");
        return sc.nextLine();
    }
    public Object[] requestDataUpdate() {
        Object[] setContact = new Object[5];
        System.out.println("Please, write the contact's ID:");
        setContact[0]= sc.nextInt(); sc.nextLine();
        System.out.println("Please, write the contact's name:");
        setContact[1] = sc.nextLine();
        System.out.println("Please, write the contact's surname:");
        setContact[2] = sc.nextLine();
        System.out.println("Please, write the contact's phone:");
        setContact[3] = sc.nextLong(); sc.nextLine();
        System.out.println("Please, write the contact's email:");
        setContact[4] = sc.nextLine();
        return setContact;
    }
    public int requestDataDelete(){
        System.out.println("Please, write the contact's ID:");
        int option= sc.nextInt();
        sc.nextLine();
        return option;
    }
    public void showMessage(String message) {
        System.out.println(message);
    }
}
