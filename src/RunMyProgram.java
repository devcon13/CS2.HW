public class RunMyProgram {

    public static void main(String[] args) {
        Food dinner;
        dinner = new Food();
        System.out.println(dinner.eat());
        dinner.cook(10);
        System.out.println(dinner.eat());
    }
}
