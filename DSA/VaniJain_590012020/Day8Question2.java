import java.util.*;
class Counter 
{
    public static void main(String[] args) 
    {
        String str;
        char ch;
        int l, count = 0;

    System.out.println("Enter a String");
        Scanner scr = new Scanner(System.in);
        str = scr.nextLine(); 
        l = str.length();
        System.out.println("Enter the character whose count you need to find");
        ch = scr.next().charAt(0);
        for (int i = 0; i < l; i++) 
        {
            if (str.charAt(i) == ch) 
            {
                count++;
            }
        }

        System.out.println("The count of " + ch + " is " + count);
    }
}
