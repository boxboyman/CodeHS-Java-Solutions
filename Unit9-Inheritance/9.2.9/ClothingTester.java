public class ClothingTester
{
    public static void main(String[] args)
    {
        TShirt tShirt = new TShirt("large", "white", "cotton");
 
        Sweatshirt sweatShirt = new Sweatshirt("XL", "blue", true);
 
        Jeans jeans = new Jeans("10");
        Clothing clothing = new Clothing("small", "red");
 
        System.out.println("You want a " + tShirt.getSize() + " "
            + tShirt.getFabric() + " t-shirt in " + tShirt.getColor() + ".");
        if (sweatShirt.hasHood())
        {
            System.out.println("And a " + sweatShirt.getSize() + " "
                + sweatShirt.getColor() + " hooded sweatshirt.");
        } else {
            System.out.println("And a " + sweatShirt.getSize() + " "
                + sweatShirt.getColor() + " sweatshirt.");
        }
        System.out.println("Also, " + jeans.getSize() + " " + jeans.getColor()
            + " jeans.");
        System.out.println("Finally, " + clothing.getSize() + " " + clothing.getColor()
            + " clothes.");
    }
}
