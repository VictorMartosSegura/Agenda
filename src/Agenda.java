import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private ArrayList<Persona> contacts;
    private int lastContactId = 1;

    public Agenda() {
        contacts = new ArrayList<>();
    }

    public ArrayList<Persona> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Persona> contacts) {
        this.contacts = contacts;
    }

    public int getLastContactId() {
        return lastContactId;
    }

    public void setLastContactId(int lastContactId) {
        this.lastContactId = lastContactId;
    }

    public Persona createContact(String[] data){
        Persona p = new Persona(lastContactId, data[0], data[1], Long.parseLong(data[2]), data[3]);
        contacts.add(p);
        lastContactId++;
        return p;

    }
    public List<Persona> searchByAll() {
        return contacts;
    }
    public ArrayList<Persona> searchContactByName(String searchName){
        ArrayList<Persona> names = new ArrayList<>();
        for (Persona p : contacts) {
            if (p.getName().equals(searchName)) {
                names.add(p);

            }
        }
        return names;
    }
    public ArrayList<Persona> searchContactBySurname(String searchSurname){
        ArrayList<Persona> surnames = new ArrayList<>();
        for (Persona p : contacts) {
            if (p.getSurname().equals(searchSurname)) {
                surnames.add(p);

            }
        }
        return surnames;
    }
    public ArrayList<Persona> searchContactByPhone(Long searchPhones){
        ArrayList<Persona> phones = new ArrayList<>();
        for (Persona p : contacts) {
            if (p.getPhone() == searchPhones) {
                phones.add(p);

            }
        }
        return phones;
    }
    public ArrayList<Persona> searchContactByEmail(String searchEmail){
        ArrayList<Persona> emails = new ArrayList<>();
        for (Persona p : contacts) {
            if (p.getEmail().equals(searchEmail)) {
                emails.add(p);

            }
        }
        return emails;
    }
    public Persona updateContact(Object[] setData) {
        int id = (Integer) setData[0];
        for (int i = 0; i < contacts.size(); i++) {
            Persona p = contacts.get(i);
            if (p.getID() == id) {
                p.setName((String) setData[1]);
                p.setSurname((String) setData[2]);
                p.setPhone((Long) setData[3]);
                p.setEmail((String) setData[4]);

                return p;
            }
        }
        return null;

    }
    public void deleteContact(int idDelete) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getID() == idDelete) {
                contacts.remove(i);
                break;
            }
        }

    }

}

