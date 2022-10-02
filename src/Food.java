public class Food {
    private int taste = 3;
    public static String food;

    public int eat(){
        return taste;
    }
    public void cook(int t){
        taste = t;
    }

    public static void foodType(String name){
        food = name;
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
