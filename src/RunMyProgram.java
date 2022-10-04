import java.util.ArrayList;

public class RunMyProgram {

    public static void main(String[] args) {
        Food dinner;
        dinner = new Food("sample");
        System.out.println(dinner.eat());
        dinner.cook(10);
        System.out.println(dinner.eat());

        System.out.println();


        // Static methods/overloading, 10/2/2022
        Food.cookedBy("devon");
        System.out.println("prepared by "+Food.chef);
        Food.rating(5);
        Food.rating(true);

        System.out.println();


        // ArrayLists, 10/4/2022
        ArrayList<Food> buffet = new ArrayList<Food>();
        buffet.add(new Food("sushi"));
        buffet.add(new Food("burritos"));
        buffet.add(new Food("pizza"));
        for(Food x : buffet){
            System.out.println(x.foodType);
        }

        System.out.println();


        // ...


    }
}
