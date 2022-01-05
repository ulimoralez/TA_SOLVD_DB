package domain;

public class Professor {
    private int id;
    private int specializationId;
    private String firstname;
    private String lastname;
    private int age;

    public Professor(int id, int specializationId, String firstname, String lastname, int age) {
        this.id = id;
        this.specializationId = specializationId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(int specializationId) {
        this.specializationId = specializationId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", specializationId=" + specializationId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
