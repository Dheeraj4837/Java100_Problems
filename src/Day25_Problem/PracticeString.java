package Day25_Problem;

public class PracticeString {
    public static void main(String[] args){
        String str = "Dheeraj";
        String str2 = "DHEERAJ";
        String str3 = "  Programming  ";
        String str4 = "Programming";
        String str5 = "I love Java";
//        System.out.println(str.equals(str2));
//        System.out.println(str.charAt(5));
//        System.out.println(str.toCharArray());
//        System.out.println(str.equalsIgnoreCase(str2));
//        System.out.println(str3.trim());
//        System.out.println(str4.substring(3,7));
//        System.out.println(str5.contains("Java"));
//        System.out.println(str4.indexOf('g'));
//        System.out.println(str4.replace("P", "D"));

        char ch = 'D';
        char ch2 = 'd';
        String ch1 = "Java123";
//        System.out.println(Character.isLetter(ch));
//        System.out.println(Character.isDigit(ch));
//        System.out.println(Character.isUpperCase(ch));
//        System.out.println(Character.isLowerCase(ch));
//        System.out.println(Character.toUpperCase(ch2));
//        System.out.println(Character.toLowerCase(ch));

        String [] arr = str5.split(" ");
        for (String s : arr){
            System.out.println(s);
        }
        System.out.println(str5.startsWith("I"));
        System.out.println(str5.endsWith("Java"));

        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.append(" Language"));
        System.out.println(sb.insert(4, " Programming"));
        System.out.println(sb.delete(5,16));
        System.out.println(sb.reverse());
    }
}
