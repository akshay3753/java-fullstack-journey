package stage1c_oopdeepdive;

abstract class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    int getSalary() {
        return this.salary;
    }

    void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    String getName() {
    return this.name;
}
    abstract void getDetails();
}

interface Workable{
    void doWork();
}
    class Developer extends Employee implements Workable{
        String programmingLanguage;
        Developer(String name, int salary, String programmingLanguage){
            super(name, salary);
            this.programmingLanguage = programmingLanguage;
        }
        @Override
        void getDetails(){
            System.out.println("Name: " + getName() + " Salary: " + getSalary() + " ProgrammingLanguage : " + programmingLanguage);
        }
        @Override
        public void doWork(){
            System.out.println("Task : Add an abstract class");
        }


    }
    class Manager extends Employee implements Workable{
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
        void getDetails() {
        System.out.println("Name: " + getName() + " Salary: " + getSalary()+ " Department: " + department);
        }
        @Override
        public void doWork(){
            System.out.println("Task: Visit client at 4 pm");
        }

    public static void main(String[] args) {
        // Write your solution here
        Manager man = new Manager("Askdfa", 90000, "Sales");
        Developer dev = new Developer("fjsd;", 100000, "Java");
        man.getDetails();
        dev.getDetails();
        man.doWork();
        dev.doWork();
        Employee emp1 = new Manager("Raj", 70000, "HR");
        Employee emp2 = new Developer("Sam", 85000, "Python");

        emp1.getDetails();
        emp2.getDetails();

    }

}

