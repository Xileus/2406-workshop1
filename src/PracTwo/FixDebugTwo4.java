package PracTwo;

import javax.swing.JOptionPane;
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final double tax = 0.06;
      costString = JOptionPane.showInputDialog(null, "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + tax * 100 +
         "% tax,  purchase  is $" + (cost - cost * tax));
   }
}
