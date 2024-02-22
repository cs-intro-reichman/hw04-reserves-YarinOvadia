public class StringOps {
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation    3 question 5             ///////
    //////                                               ///////
    public static void main(String[] args) {
        /*
        String str = "deMO demo DEMO dEMo vowels are fun";
        String check= "Hello World";
        System.out.println(capVowelsLowRest(str));
System.out.println(capVowelsLowRest(check));
System.out.println(camelCase(str));

        */


    }
    
     public static String capVowelsLowRest(String string) {
        
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                    str += (char) (ch - 32);
                } else {
                    str += ch;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U') {
                    str += ch;
                } else {
                    str += (char) (ch + 32);
                }

            }
            if (ch == ' ') {
                str += ch;
            }
        }
        return str;

    }


    
  
    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
