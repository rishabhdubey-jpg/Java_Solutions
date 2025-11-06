import java.util.Arrays;

class Day2{
    public static void main(String[] args) {
  // --> String's in built functions..
        String str="hello java";
        System.out.println(str.charAt(1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("z"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1, 2));
        System.out.println(str.trim());
        System.out.println(str.length()); // Length
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str);

 // --> Comparisons b/w the two strings..
        String str1 = new String("hello"); // Addresses are comparing
        String str2 = new String("hello"); // Strings are comparing
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}