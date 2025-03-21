import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean exit=true;
        TUI tui = new TUI();
        Agenda a = new Agenda();
        Persona p;

        while (exit) {
            switch (tui.showMainMenu()) {
                case 1:
                    String[] data = tui.requestDataNewContact();
                    tui.showMessage("\nNew contact created:");
                    tui.showMessage(a.createContact(data).toString());
                    break;
                case 2:
                    switch (tui.showSearchMenu()){
                        case 1:
                            tui.showByAll(a.searchByAll());
                            break;
                        case 2:
                            ArrayList <Persona> names;
                            names = a.searchContactByName(tui.requestSearchData("name"));
                            if (!names.isEmpty()) {
                                for (Persona persona : names) {
                                    tui.showMessage(persona.toString());
                                }
                            } else {
                                tui.showMessage("Contact not found.\n");
                            }
                            break;
                        case 3:
                            ArrayList <Persona> surnames;
                            surnames = a.searchContactBySurname(tui.requestSearchData("surname"));
                            if (!surnames.isEmpty()) {
                                for (Persona persona : surnames) {
                                    tui.showMessage(persona.toString());
                                }
                            } else {
                                tui.showMessage("Contact not found.\n");
                            }
                            break;
                        case 4:
                            ArrayList <Persona> phones;
                            phones = a.searchContactByPhone(Long.parseLong(tui.requestSearchData("phone")));
                            if (!phones.isEmpty()) {
                                for (Persona persona : phones) {
                                    tui.showMessage(persona.toString());
                                }
                            } else {
                                tui.showMessage("Contact not found.\n");
                            }
                            break;
                        case 5:
                            ArrayList <Persona> emails;
                            emails = a.searchContactByEmail(tui.requestSearchData("email"));
                            if (!emails.isEmpty()) {
                                for (Persona persona : emails) {
                                    tui.showMessage(persona.toString());
                                }
                            } else {
                                tui.showMessage("Contact not found.\n");
                            }
                            break;
                        case 6:
                            break;
                        default: tui.showMessage("Invalid option.\n");
                            break;
                    }
                    break;
                case 3:
                    p = a.updateContact(tui.requestDataUpdate());
                    if (p != null) {
                        tui.showMessage("Contact Update:\n");
                        tui.showMessage(p.toString());
                    } else {
                        tui.showMessage("Contact not found.\n");
                    }
                    break;
                case 4:
                    a.deleteContact(tui.requestDataDelete());
                    tui.showMessage("Contact Delete");
                    break;
                case 5:
                    tui.showMessage("You have closed the agenda.");
                    exit=false;
                    break;
                default:
                    tui.showMessage("Invalid option.\n");
                    break;
            }
        }

    }
}