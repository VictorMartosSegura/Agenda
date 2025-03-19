public class Persona {
    private int id;
    private String name;
    private String surname;
    private long phone;
    private String email;

    public Persona(int id, String name, String surname, long phone, String email){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    public int getID(){ return id; }
    public String getName(){ return name; }
    public String getSurname(){ return surname; }
    public long getPhone(){ return phone; }
    public String getEmail(){ return email; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setPhone(long phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    void Contact(){
        System.out.println("ID: "+getID()+"\n   " +
                "Name: "+ getName()+"\n   " +
                "Surname: "+ getSurname()+"\n   " +
                "Phone: "+ getPhone()+"\n   " +
                "Email: "+ getEmail()+"\n");
    }
}
