
public class Main
{
    public static void main(String[] args)
    {

        NormalEmployee n = new NormalEmployee();
        SpecialEmployee s = new SpecialEmployee();
        n.getEmployeeDetails();
        n.salaryCalculation();

        s.getEmployeeDetails();
        s.salaryCalculation();
    }
}
