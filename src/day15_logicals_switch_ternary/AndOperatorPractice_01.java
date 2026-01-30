package day15_logicals_switch_ternary;

public class AndOperatorPractice_01
{
    public static void main(String[] args)
    {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "shoes";

        //if (onSale == true && freeShipping==true)
        // ikiside dogru olunca ilk condition giriyor degilse ikinci conditoan gecip kapatiyor.
        if (onSale && freeShipping) {
            System.out.println("Adding to cart -" + itemName);
        } else {
            System.out.println("Continue shopping for good deals on-" + itemName);
        }

        // 3 tane condition birbirine baglarken
        if ((freeShipping) && (onSale) && (itemName.equals("shoes"))) {
            System.out.println("Adding to cart -" + itemName);
        } else {
            System.out.println("Continue shopping for good deals on-" + itemName);
        }

    }
}
// variable her zaman assign yapmakliyim if condition baslatabilmem icin yoksa condition baslatamam.