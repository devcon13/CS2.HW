public class Food {
    private int taste = 3;

    public int eat(){
        return taste;
    }

    public void cook(int t){
        taste = t;
    }
}
