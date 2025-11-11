// Function calling from main
class Day3{
    // static int a=5;
    void sum(int a){
        System.out.println("hello");
        System.out.println(a);
    }
    public static void main(String[] args) {
        // sum();
    Day3 obj=new Day3();
    obj.sum(5);
    }
}