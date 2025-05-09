import java.util.ArrayList;
import java.util.List;

public class College implements UniversityComponent {
    
    private String name;
    private List<UniversityComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    @Override
    public void add(UniversityComponent component) {
        components.add(component);
    }

    @Override
    public void remove(UniversityComponent component) {
        components.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nCollege: " + name);
        for (UniversityComponent comp : components) {
            comp.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (UniversityComponent comp : components) {
            total += comp.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (UniversityComponent comp : components) {
            total += comp.getBudget();
        }
        return total;
    }
}
