import java.util.*;
class Employee{
    String name;
    String id;
    Double basicSalary;
    Employee(String name, String id, Double basicSalary){
        this.name=name;
        this.id=id;
        this.basicSalary=basicSalary;
    }
    double calculateSalary(){
        return basicSalary;
    }
    @Override
    public String toString(){
        return "Employee"+name+" ( "+id+" ), Salary: "+calculateSalary();
    }
}
class Manager extends Employee{
    private double bonus;
    Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }
    @Override
    double calculateSalary(){
        return basicSalary+bonus;
    }
    @Override
    public String toString(){
        return "Manager "+name+" ( "+id+" ), Salary: "+calculateSalary();
    }
}
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.isEmpty())
                break;

            String[] data = input.split(",");

            Employee emp;

            if (data[0].equalsIgnoreCase("Employee")) {
                emp = new Employee(
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]));
            } else {
                emp = new Manager(
                        data[1],
                        data[2],
                        Double.parseDouble(data[3]),
                        Double.parseDouble(data[4]));
            }

            System.out.println(emp);
        }
    }
}
