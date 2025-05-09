public class Teacher implements UniversityComponent {
    
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {

        this.name = name;
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println(" Teacher: " + name + 
                        "\n\tSubject: " + subject + 
                        "\n\tSalary: ₱" + salary);
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }

    @Override
    public void add(UniversityComponent component) {
        throw new UnsupportedOperationException("Leaf node - cannot add");
    }

    @Override
    public void remove(UniversityComponent component) {
        throw new UnsupportedOperationException("Leaf node - cannot remove");
    }
}