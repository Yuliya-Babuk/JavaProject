package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Babuk Yuliya", "Accountant", "babuk@gmail.com",
                "80291111111", 10000, 30);
        empArray[1] = new Employee("Sidorov Ivan", "Developer", "sidorov@gmail.com",
                "80291524513", 20000, 40);
        empArray[2] = new Employee("Antonov Paul", "Marketer", "antonov@gmail.com",
                "80292626541", 35000, 45);
        empArray[3] = new Employee("Zaharov Tim", "Engineer", "zaharov@mail.ru",
                "80291111212", 40000, 30);
        empArray[4] = new Employee("Niels Paul", "Assistant", "niels@gmail.com",
                "80291111313", 50000, 33);
        for (Employee employee : empArray) {
            if (employee.getAge() > 40)
                employee.info();
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(getName() + " " + getPosition() + " " + getEmail() + " " +
                getPhoneNumber() + " " + getSalary() + " " + getAge());
    }
}