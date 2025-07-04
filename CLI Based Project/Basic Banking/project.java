import java.util.*;

class Employee {
    String name;
    int age;
    String designation;
    double salary;

    Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;

        if (designation.equalsIgnoreCase("m")) {
            this.salary = 30000;
        } else if (designation.equalsIgnoreCase("t")) {
            this.salary = 20000;
        } else if (designation.equalsIgnoreCase("p")) {
            this.salary = 25000;
        } else {
            this.salary = 0;
        }
    }
}

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1) Create\n2) Display\n3) Raise Salary\n4) Exit\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the age:");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter the designation (m=30t=20, p=25):");
                    String designation = sc.nextLine();

                    employees.add(new Employee(name, age, designation));
                    break;

                case 2:
                    System.out.println("Name\tAge\tSalary\tDesignation");
                    for (Employee e : employees) {
                        System.out.println(e.name + "\t" + e.age + "\t" + e.salary + "\t" + e.designation);
                    }
                    break;

                case 3:
                    System.out.println("Enter name:");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    for (Employee e : employees) {
                        if (e.name.equalsIgnoreCase(searchName)) {
                            found = true;
                            System.out.println("How much % you have to increase:");
                            double percent = sc.nextDouble();
                            e.salary += e.salary * (percent / 100);
                            System.out.println("Salary Updated.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thanks for using the app.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}