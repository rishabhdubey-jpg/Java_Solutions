class FunctioningOfRegex {
    public static void main(String[] args){
// --> Functioning of Regex function..
        String str="hello java cpp";
        String a[]=str.split(" "); // Splitting the string in three indexes
        System.out.println(a[1]);        //  Shows the string at address 1
        for(String str1 : a){
            System.out.println(str1);
        }

    }
}