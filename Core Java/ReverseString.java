public class ReverseString {
    public static String reverse(String string){
        if(string == null )
            return " ";
        StringBuilder reversed = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--)
            reversed.append(string.charAt(i));
        return reversed.toString();
    }
}
