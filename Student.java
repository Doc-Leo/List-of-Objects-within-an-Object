import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String lastName;
    private String firstName;
    private Degree degree;
    private List<Address> addresses;
    private List<Parent> parents;

    public Student(String id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.addresses = new ArrayList<>();
        this.parents = new ArrayList<>();
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public String getId() {
        return id;
    }

    public void printReport() {
        System.out.println("Student id is " + id);
        System.out.println("Student name is " + lastName.toUpperCase() + ", " + firstName);
        System.out.println("Studying " + degree.getDescription());
        for (Address address : addresses) {
            if (address.getType().equals("C")) {
                System.out.println("City address is " + address.getLocation());
            } else if (address.getType().equals("P")) {
                System.out.println("Provincial address is " + address.getLocation());
            }
        }
        for (Parent parent : parents) {
            String parentType = parent.getType().equals("F") ? "Father's" : parent.getType().equals("M") ? "Mother's" : "Guardian's";
            System.out.println(parentType + " name is " + parent.getName());
        }
        System.out.println();
    }
}
