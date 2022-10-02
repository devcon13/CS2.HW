public class RunMyProgram {

    public static void main(String[] args) {
        Food dinner;
        dinner = new Food();
        System.out.println(dinner.eat());
        dinner.cook(10);
        System.out.println(dinner.eat());

        // Static methods/overloading, 10/2/2022
        Food.foodType("sushi");
        System.out.println(Food.food);
        Food.rating(5);
        Food.rating(true);

    }
}
