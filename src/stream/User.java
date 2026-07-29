package stream;

public class User {
    public String name;
    public Integer salary;
    public String department;

    public User(String name, Integer salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'';
    }
}
