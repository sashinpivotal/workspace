package mypackage.your_package;

public class Address {

    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getAddressInfo() {
        return city + " " + country;
    }
}

class Employee {
    private String name;
    private double salary;
    private Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeInfo() {
        return name + " "
                + salary + " "
                + address.getAddressInfo();
    }
}

class Company {

    private String companyName;
    private Employee[] employees = new Employee[100];
    int currentIndex = 0;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public double computeTotalSalary() {
        double total = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

}

class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("sang", 2000.0,
                new Address("boston", "usa"));
        String employeeInfo = employee.getEmployeeInfo();

        Company company = new Company();
        company.addEmployee(employee);
        double salary = company.computeTotalSalary();
        System.out.println(salary);

    }
}

