public class FoodTester

{

    public static void main(String[] args)

    {

        Food curry = new Food("curry", 320);

        HealthyFood brownRice = new HealthyFood("brown rice", 170, "grain", "brown");

        Fruit mango = new Fruit("mango", 60, "yellow", false, "C, B6, A");

        System.out.println(curry);

        System.out.println(curry.getName());

        System.out.println(curry.getCalories());

        System.out.println();

        System.out.println(brownRice);

        System.out.println(brownRice.getName());

        System.out.println(brownRice.getCalories());

        System.out.println(brownRice.getGroup());

        System.out.println(brownRice.getColor());

        System.out.println();

        System.out.println(mango);

        System.out.println(mango.getName());

        System.out.println(mango.getCalories());

        System.out.println(mango.getGroup());

        System.out.println(mango.getColor());

        System.out.println(mango.isInSeason());

        System.out.println(mango.getVitamins());

    }

}
