import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ecommerce {
    public static void main(String[] args)
    {
        // Add items to cart
        ArrayList<String> cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Watch");
        cart.add("Shoes");

        //Prices of each items 

        HashMap<String,Integer> prices=new HashMap<>();
        prices.put("Laptop",50000);
        prices.put("Mouse",2000);
        prices.put("Watch",1000);
        prices.put("Shoes",3000);
        prices.put("Bag",900);

        // Coupons should be unique
        HashSet<String> coupons=new HashSet<>();
        coupons.add("COUPON15");
        coupons.add("FREESHIP");
        coupons.add("NINTYDISC");
        coupons.add("OFFER80");

        HashMap<String,Integer> discount=new HashMap<>();
        discount.put("COUPON15",15);
        discount.put("FREESHIP",25);
        discount.put("NINTYDISC",90);
        discount.put("OFFER80",80);

        //Adding prices of all items in cart
        int totalPrice=0;
        for(String item:cart)
        {
            totalPrice += prices.get(item);
        }
        System.out.println("Total Price:"+totalPrice);
        int  discountPercent=discount.get("COUPON15");
        int discountAmount=(totalPrice*discountPercent)/100;
        System.out.println(discountAmount+" amount is offer on the total price");
        int finalPrice=totalPrice-discountAmount;
        System.out.println("Final Price:"+finalPrice);
        //applying discount
        //calculating discount
        /*
         
        price=totalPrice-totalPrice*(discount/100 )
         */

    }
}
