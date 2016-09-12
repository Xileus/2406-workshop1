package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class PetSold extends ItemSold{
    private boolean vacc;
    private boolean neutered;
    private boolean housebrokited;

    public boolean isVacc() {
        return vacc;
    }

    public void setVacc(boolean vacc) {
        this.vacc = vacc;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebrokited() {
        return housebrokited;
    }

    public void setHousebrokited(boolean housebrokited) {
        this.housebrokited = housebrokited;
    }
}
