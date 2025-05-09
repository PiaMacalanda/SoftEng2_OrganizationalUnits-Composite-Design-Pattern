# New Era University Structure -Composite Design Pattern

This Java program models the organizational structure of New Era University using the **Composite Design Pattern**, strictly following **Object-Oriented Programming principles** .


## 🧱 Class Structure

- `UniversityComponent.java` – Interface that defines all common operations  
- `Student.java` – Leaf node representing a student  
- `Teacher.java` – Leaf node representing a teacher  
- `Department.java` – Composite node representing a department  
- `College.java` – Composite node representing a college or sub-college  
- `Main.java` – Client code that builds and demonstrates the university structure

---

## 🧪 Sample Output

```

College: New Era University

College: College of Informatics and Computing Studies

Department: Computer Science
Teacher: Prof. Esperanza
Subject: Java
Salary: ₱55000.0
Student: Wonks
ID: S001
Tuition ₱ 25000.0
Student: Juls
ID: S002
Tuition ₱ 27000.0

Department: Information Technology
Teacher: Prof. Simbulan
Subject: Cyber Security
Salary: ₱50000.0
Student: Binse
ID: S003
Tuition ₱ 26000.0

Total Students: 3
Total Budget: ₱27000.0

````

## 📌 Notes

* `add()` and `remove()` operations are only supported by composite classes (`College`, `Department`).
* Leaf classes (`Student`, `Teacher`) throw `UnsupportedOperationException` on `add/remove`.
* Budget is calculated as:
  **Total Teacher Salaries − Total Student Tuition Fees**

---