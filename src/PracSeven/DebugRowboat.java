package PracSeven;
public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      passengers = 2;
   }
   public void setPower()
   {
      power = "oars";
   }
}