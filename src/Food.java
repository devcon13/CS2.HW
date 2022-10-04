public class Food {
    private int taste = 3;
    public static String chef;
    public String foodType;

    public Food(String food){
        foodType = food;
    }


    public int eat(){
        return taste;
    }
    public void cook(int t){
        taste = t;
    }

    public static void cookedBy(String name){
        chef = name;
    }
    public static void rating(int x){
        System.out.println(x+" stars");
    }
    public static void rating(boolean yORn){
        if(yORn == true){
            System.out.println("yay!");
        }
        else{
            System.out.println("nay");
        }
    }
}
