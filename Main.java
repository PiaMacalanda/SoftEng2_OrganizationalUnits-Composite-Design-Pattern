public class Main {
    public static void main(String[] args) {

        UniversityComponent s1 = new Student("Wonks", "S001", 25000);
        UniversityComponent s2 = new Student("Juls", "S002", 27000);
        UniversityComponent s3 = new Student("Binse", "S003", 26000);

        UniversityComponent t1 = new Teacher("Prof. Esperanza", "Java", 55000);
        UniversityComponent t2 = new Teacher("Prof. Simbulan", "Cyber Security", 50000);

        UniversityComponent csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        UniversityComponent itDept = new Department("Information Technology");
        itDept.add(t2);
        itDept.add(s3);

        UniversityComponent cics = new College("College of Informatics and Computing Studies");
        cics.add(csDept);
        cics.add(itDept);

        UniversityComponent neu = new College("New Era University");
        neu.add(cics);

        neu.displayDetails();
        System.out.println("\nTotal Students: " + neu.getStudentCount());
        System.out.println("Total Budget: ₱" + neu.getBudget());
    }
}
