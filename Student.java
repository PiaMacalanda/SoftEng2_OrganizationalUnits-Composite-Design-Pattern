public class Student implements UniversityComponent {

    private String name;
    private String studentId;
    private double tuition;

    public Student(String name, String studentId, double tuition) {

        this.name = name;
        this.studentId = studentId;
        this.tuition = tuition;
    }

    @Override
    public void displayDetails() {
        System.out.println(" Student: " + name + 
                            "\n\tID: " + studentId + 
                            "\n\tTuition ₱ " + tuition);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuition;
    }

    @Override
    public void add(UniversityComponent component) {
        throw new UnsupportedOperationException("Leaf node - cannot add");
    }

    @Override
    public void remove(UniversityComponent component) {
        throw new UnsupportedOperationException("Lead node - cannot remove");
    }
}