import java.util.Arrays;

class Day3_Strings {
    public static void main(String[] args) {

        //  --> Finding the no. of vowels in the string..
        String str="hello";
        int v=0;
        for(char ch :str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                v++;
            }
        }
         System.out.println(v);

// --> Finding the largest string in given string..
        String str1="hello is powerfull";
        String a[]=str1.split(" ");
        String largest="";
        for(String val: a){
            if(val.length()>largest.length()){
                largest=val;
            }
        }
        System.out.println(largest);

// --> Comparison b/w the two strings..
        String str2="hello";
        String str3="hlleo";
        char ch1[]=str2.toCharArray();
        char ch2[]=str3.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String val1=new String(ch1);
        String val2=new String(ch2);
        if(val1.equals(val2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}