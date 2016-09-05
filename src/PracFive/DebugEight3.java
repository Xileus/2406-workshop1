package PracFive;
// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import javax.swing.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'};
      int[] pricesInThousands = {145, 190, 235};
      int x, fp = 99;
      String prompt = "Please select a floor plan\n" +
          "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorPlans letter";
       entry = JOptionPane.showInputDialog(null, prompt);
       System.out.println(entry.charAt(0));
       for(x = 0; x < floorPlans.length; ++x)
          if(entry.charAt(0) == floorPlans[x]) {
              fp = x;
              break;
          }

       if(fp == 99)
        JOptionPane.showMessageDialog(null,
            "Invalid floor plan code entered");
      else
      {
        if(x > pricesInThousands.length)
           fp = x - pricesInThousands.length;
        JOptionPane.showMessageDialog(null, "Model " +
           floorPlans[fp] + " is priced at only $" +
           pricesInThousands[fp] + ",000");
      }
   }
}

