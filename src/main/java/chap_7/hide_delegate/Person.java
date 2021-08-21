package chap_7.hide_delegate;

public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Delegate method
    public Person getManager() {
        return department.getManager("String code");
    }
}
