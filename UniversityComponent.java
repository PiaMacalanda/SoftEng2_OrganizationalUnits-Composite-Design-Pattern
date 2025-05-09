public interface UniversityComponent {

    void displayDetails();
    int getStudentCount();
    double getBudget();
    void add(UniversityComponent component);
    void remove(UniversityComponent component);
}