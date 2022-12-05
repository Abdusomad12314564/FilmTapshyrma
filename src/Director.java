public class Director {
    private String name2;
    private String lastName;


    public Director(String name, String lastName) {
        this.name2 = name;
        this.lastName = lastName;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name) {
        this.name2 = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name2 + " " + lastName;
    }
}
