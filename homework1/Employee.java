package homework1;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public int detAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int percent) {
        return salary * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Employee[ id = " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary + "]";
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Employee)){
            return true;
        }
        Employee emp = (Employee)o;
        return emp.id == id && emp.firstName.equals(firstName) && emp.lastName.equals(lastName) && emp.salary == salary;
    }

    @Override
    public int hashCode() {
        int result = 18;
        result = 31*result + firstName.hashCode();
        result = 31*result + lastName.hashCode();
        result = 31*result + id;
        result = 31*result + salary;
        return result;
    }


}
