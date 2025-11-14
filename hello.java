// Method overloading
class hello {
    void sum(){
        System.out.println("hello");
    }

    void sum(int a){
        System.out.println(a);
    }

    void sum(int a, int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        hello obj = new hello();
        obj.sum(5,5);
    }
}