package AssignmentTwo;

import java.util.ArrayList;

/**
 * Created by Xileus on 28/09/2016.
 */
public class MineralCard extends Card {
    String elements;
    String classification;
    String crystalSystem;
    ArrayList<String> occurrence;

    float hardness;

    float specificGravity;

    String cleavageString;
    float cleavage;

    String crustalAbundanceString;
    float crustalAbundance;

    String economicValueString;
    float economicValue;
    //-----------------------------------------------------------

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    //-----------------------------------------------------------

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    //-----------------------------------------------------------

    public String getCrystalSystem() {
        return crystalSystem;
    }

    public void setCrystalSystem(String crystalSystem) {
        this.crystalSystem = crystalSystem;
    }

    //-----------------------------------------------------------

    public ArrayList<String> getOccurrence() {
        return occurrence;
    }
    //-------------------------------------------------------------------------------------
    public void setOccurrence(String occurrence) {
        ;
    }
    //-------------------------------------------------------------------------------------

    public float getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        float hardnessf;
        String[] str = hardness.split("-");
        try {
            hardnessf = Float.parseFloat(str[1]);
        } catch (ArrayIndexOutOfBoundsException e){
            hardnessf = Float.parseFloat(str[0]);
        }
        this.hardness = hardnessf;
    }

    //-----------------------------------------------------------

    public float getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(String specificGravity) {
        String[] str = specificGravity.split("-");
        float SpGr;
        try{
            SpGr = Float.parseFloat(str[1]);
        } catch (ArrayIndexOutOfBoundsException e){
            SpGr = Float.parseFloat(str[0]);
        }
        this.specificGravity = SpGr;
    }

    //-----------------------------------------------------------

    public String getCleavageString() {
        return cleavageString;
    }

    public void setCleavageString(String cleavageString) {
        this.cleavageString = cleavageString;
        float cleavageValue = 0.0f;
        if (cleavageString.equals("none")){
            cleavageValue = 0.0f;
        } else if (cleavageString.equals("poor/none")){
            cleavageValue = 1.0f;
        } else if (cleavageString.equals("1 poor")){
            cleavageValue = 2.0f;
        } else if (cleavageString.equals("2 poor")){
            cleavageValue = 3.0f;
        } else if(cleavageString.equals("1 good")){
            cleavageValue = 4.0f;
        } else if (cleavageString.equals("1 good, 1 poor")){
            cleavageValue = 5.0f;
        }else if (cleavageString.equals("2 good")){
            cleavageValue = 6.0f;
        } else if (cleavageString.equals("3 good")){
            cleavageValue = 7.0f;
        } else if (cleavageString.equals("1 perfect")){
            cleavageValue = 8.0f;
        } else if (cleavageString.equals("1 perfect, 1 good")){
            cleavageValue = 9.0f;
        } else if(cleavageString.equals("1 perfect, 2 good")){
            cleavageValue = 10.0f;
        } else if (cleavageString.equals("2 perfect, 1 good")){
            cleavageValue = 11.0f;
        } else if (cleavageString.equals("3 perfect")){
            cleavageValue = 12.0f;
        } else if(cleavageString.equals("4 perfect")){
            cleavageValue = 13.0f;
        } else if (cleavageString.equals("6 perfect")){
            cleavageValue = 14.0f;
        }
        setCleavage(cleavageValue);

    }

    //-----------------------------------------------------------

    public float getCleavage() {
        return cleavage;
    }

    public void setCleavage(float cleavage) {
        this.cleavage = cleavage;
    }

    //-----------------------------------------------------------

    public String getCrustalAbundanceString() {
        return crustalAbundanceString;
    }

    public void setCrustalAbundanceString(String crustalAbundanceString) {
        this.crustalAbundanceString = crustalAbundanceString;
        float crustalAbundance = 0.0f;
        if (crustalAbundanceString.equals("ultratrace")){
            crustalAbundance = 0.0f;
        } else if (crustalAbundanceString.equals("trace")){
            crustalAbundance = 1.0f;
        } else if (crustalAbundanceString.equals("low")){
            crustalAbundance = 2.0f;
        } else if (crustalAbundanceString.equals("moderate")){
            crustalAbundance = 3.0f;
        } else if(crustalAbundanceString.equals("high")){
            crustalAbundance = 4.0f;
        } else if (crustalAbundanceString.equals("very high")){
            crustalAbundance = 5.0f;
        }
        setCrustalAbundance(crustalAbundance);
    }

    //-----------------------------------------------------------

    public float getCrustalAbundance() {
        return crustalAbundance;
    }

    public void setCrustalAbundance(float crustalAbundance) {
        this.crustalAbundance = crustalAbundance;
    }

    //-----------------------------------------------------------

    public String getEconomicValueString() {
        return economicValueString;
    }

    public void setEconomicValueString(String economicValueString) {
        this.economicValueString = economicValueString;
        float economicValue = 0.0f;
        if (economicValueString.equals("trivial")){
            economicValue = 0.0f;
        } else if (economicValueString.equals("low")){
            economicValue = 1.0f;
        } else if (economicValueString.equals("moderate")){
            economicValue = 2.0f;
        } else if (economicValueString.equals("high")){
            economicValue = 3.0f;
        } else if(economicValueString.equals("very high")){
            economicValue = 4.0f;
        } else if (economicValueString.equals("Im rich!")){
            economicValue = 5.0f;
        }
        setEconomicValue(economicValue);

    }

    //-----------------------------------------------------------

    public float getEconomicValue() {
        return economicValue;
    }

    public void setEconomicValue(float economicValue) {
        this.economicValue = economicValue;
    }

    //-----------------------------------------------------------

    MineralCard(String image, String name, String elements, String classification, String crystalSystem,
                String occurrence, String hardness, String specificGravity,
                String cleavageString, String crustalAbundanceString, String economicValueString){
        //--------------------------------------------------
        super(image, name, false);
        setElements(elements);
        setClassification(classification);
        setCrystalSystem(crystalSystem);
        setOccurrence(occurrence);
        setHardness(hardness);
        setSpecificGravity(specificGravity);
        setCleavageString(cleavageString);
        setCrustalAbundanceString(crustalAbundanceString);
        setEconomicValueString(economicValueString);
        //-------------------------------------------------
    }

}
