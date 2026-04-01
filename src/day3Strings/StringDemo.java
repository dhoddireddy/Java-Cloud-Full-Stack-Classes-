package day3Strings;

public class StringDemo {
    
    public static void main(String[] args) {
        
        System.out.println("-- String demo --");
        
        String str = "abcdefghij";
        String str2 = "ABCDefghij";
        String str3 = "  hello  ";

        System.out.println(str); // original

        System.out.println(str.length()); // length

        System.out.println(str.toUpperCase()); // uppercase

        System.out.println(str.toLowerCase()); // lowercase

        System.out.println(str.charAt(5)); // character at index

        System.out.println(str.substring(2,6)); // substring

        System.out.println(str.contains("abc")); // check contains

        System.out.println(str.equals(str2)); // compare (case-sensitive)

        System.out.println(str.equalsIgnoreCase(str2)); // ignore case

        System.out.println(str.startsWith("abc")); // starts with

        System.out.println(str.endsWith("ij")); // ends with

        System.out.println(str.indexOf('d')); // index of

        System.out.println(str.replace('a','z')); // replace

        System.out.println(str.concat("123")); // concat

        System.out.println(str3.trim()); // remove spaces

        System.out.println(str.isEmpty()); // check empty

        System.out.println("ab".repeat(3)); // repeat

    }
}