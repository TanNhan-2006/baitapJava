public class Bai14 {
    public static class Employee {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;

        public Employee(int id, String firstName, String lastName,int salary){
            this.id =id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public int getId(){
            return id;
        }

        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getName(){
            return firstName+" "+lastName;
        }

        public int getSalary(){
            return salary;
        }

        public void setSalary(int salary){
            this.salary = salary;
        }

        public int getAnnualSlary(){
            return salary*12;
        }

        public int raiseSalary(int percent){
            return salary+=salary*percent/100;
        }

        @Override
        public String toString(){
            return "Employee [id=" + id + ", name=" + firstName +" "+lastName+", salary="+salary+"]";
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee(8, "Peter","Tan",2500);
        System.out.println(employee);
        employee.setSalary(999);
        System.out.println(employee);
        System.out.println("id is: "+employee.getId());
        System.out.println("firstName is: "+employee.getFirstName());
        System.out.println("lastName is: "+employee.getLastName());
        System.out.println("salary is: "+employee.getSalary());
        System.out.println("name id: "+employee.getName());
        System.out.println("annual slary is: "+employee.getAnnualSlary());

        System.out.println(employee.raiseSalary(10));
        System.out.println(employee);
    }
}
