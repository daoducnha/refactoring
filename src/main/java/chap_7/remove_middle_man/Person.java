package chap_7.remove_middle_man;

public class Person {
    Department department;

//    public Person getManager() {
//        return department.getManager();
//    }

    public Department getDepartment() {
        return department;
    }
}
class Department {
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
