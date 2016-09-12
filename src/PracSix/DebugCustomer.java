package PracSix;
public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    DebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
