package typeinfo;

/**
 * Created by ty on 2016/11/16.
 */
class Position {
    private String titile;
    private Person person;
    public Position(String jobTitle, Person employee) {
        titile = jobTitle;
        person = employee;
        if (person == null)
            person = Person.Null;
    }

    public Position(String jobTitle) {
        titile = jobTitle;
        person = Person.Null;
    }

    public String getTitile() { return titile; }

    public void setTitile(String newTitle) { titile = newTitle; }

    public Person getPerson() { return person; }

    public void setPerson(Person newPerson) {
        person = newPerson;
        if (person == null)
            person = Person.Null;
    }

    public String toString() {
        return "Position: " + titile + " " + person;
    }
}
