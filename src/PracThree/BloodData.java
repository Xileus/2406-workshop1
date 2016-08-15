package PracThree;

/**
 * Created by Xileus on 15/08/2016.
 */
public class BloodData {
    String bloodType;
    String rh;
    BloodData (){
        bloodType = "O";
        rh = "+";
    }
    BloodData(String bloodType, String rh){
        setBloodType(bloodType);
        setRh(rh);
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRh() {
        return rh;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }
}
