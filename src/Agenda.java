import java.util.Scanner;

public class Agenda {
    Persona[] contacts= new Persona[100];
    int index=1;
    public void createContact(Scanner sc){
        System.out.println("Please, write the contact's name:");
        String name = sc.nextLine();
        System.out.println("Please, write the contact's surname:");
        String surname = sc.nextLine();
        System.out.println("Please, write the contact's phone:");
        long phone = sc.nextLong(); sc.nextLine();
        System.out.println("Please, write the contact's email:");
        String email = sc.nextLine();

        Persona p = new Persona(index, name, surname, phone, email);
        contacts[index-1] = p;
        System.out.println("\nNew contact created:");
        contacts[index-1].Contact();
        index++;
    }
    public void searchByAll() {
        if (index == 1) {
            System.out.println("The agenda is empty. Create a new contact.\n");
            return;
        }
        System.out.println("Contacts in the agenda:");
        for (int i = 0; i < index - 1; i++) if (contacts[i] != null) contacts[i].Contact();
    }
    public Persona searchContactByName(Scanner sc){
        System.out.println("Please, write the contact's name to search:");
        String name = sc.nextLine();
        System.out.println();
        int i=0;
        while (i<index){
            if(contacts[i].getName().equals(name)) {
                return contacts[i];
            }
            i++;
        }
        return null;
    }
    public Persona searchContactBySurname(Scanner sc){
        System.out.println("Please, write the contact's surname to search:");
        String surname = sc.nextLine();
        System.out.println();
        int i=0;
        while (i<index){
            if(contacts[i].getSurname().equals(surname)) {
                return contacts[i];
            }
            i++;
        }
        return null;
    }
    public Persona searchContactByPhone(Scanner sc){
        System.out.println("Please, write the contact's phone to search:");
        long phone = sc.nextInt(); sc.nextLine();
        System.out.println();
        int i=0;
        while (i<index){
            if(contacts[i].getPhone()==phone) {
                return contacts[i];
            }
            i++;
        }
        return null;
    }
    public Persona searchContactByEmail(Scanner sc){
        System.out.println("Please, write the contact's name to search:");
        String email = sc.nextLine();
        System.out.println();
        int i=0;
        while (i<index){
            if(contacts[i].getName().equals(email)) {
                return contacts[i];
            }
            i++;
        }
        return null;
    }
    public Persona updateContact(Scanner sc) {
        System.out.println("Please, write the contact's ID:");
        int id = sc.nextInt(); sc.nextLine();
        System.out.println();
        for (int i = 0; i < index - 1; i++) {
            if (contacts[i] != null && contacts[i].getID() == id) {

                System.out.println("Please, write the contact's name:");
                String newName = sc.nextLine();
                System.out.println("Please, write the contact's surname:");
                String newSurname = sc.nextLine();
                System.out.println("Please, write the contact's phone:");
                long newPhone = sc.nextLong(); sc.nextLine();
                System.out.println("Please, write the contact's email:");
                String newEmail = sc.nextLine();

                contacts[i].setName(newName);
                contacts[i].setSurname(newSurname);
                contacts[i].setPhone(newPhone);
                contacts[i].setEmail(newEmail);

                System.out.println("Existing contact updated:");
                contacts[i].Contact();
                return contacts[i];
            }
        }
        return null;
    }
    public void deleteContact(Scanner sc) {
        System.out.println("Please, write the contact's ID:");
        int id = sc.nextInt(); sc.nextLine();
        System.out.println();
        boolean found = false;
        for (int i = 0; i < index - 1; i++) {
            if (contacts[i] != null && contacts[i].getID() == id) {
                contacts[i] = null;
                System.out.println("Contact with ID " + id + " has been deleted.\n");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Contact not found. Please check the ID.\n");

    }

}

