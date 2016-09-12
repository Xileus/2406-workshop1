package PracSix;

/**
 * Created by Xileus on 12/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemSold = new ItemSold();
        ItemSold itemSold1 = new ItemSold();
        PetSold petSold = new PetSold();
        PetSold petSold1 = new PetSold();
        itemSold.setDesc("Food - Cat");
        itemSold.setInvoiceNumber(67);
        itemSold.setPrice(32.65f);
        itemSold1.setDesc("Food - Human");
        itemSold1.setPrice(2);
        itemSold1.setInvoiceNumber(77);
        petSold.setDesc("Cat");
        petSold.setInvoiceNumber(66);
        petSold.setPrice(5);
        petSold.setHousebrokited(true);
        petSold.setNeutered(false);
        petSold.setVacc(true);
        petSold1.setHousebrokited(false);
        petSold1.setDesc("Human");
        petSold1.setPrice(3);
        petSold1.setInvoiceNumber(78);
        petSold1.setNeutered(true);
        petSold1.setVacc(true);
    }
}
