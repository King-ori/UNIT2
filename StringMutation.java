import java.util.*;


/**
 * Play with Strings
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String phrase= new String("Change is inevitable");
        int phraseLength=phrase.length();
        System.out.println("Length of phrase="+ phraseLength);
        String mut1, mut2, mut3, mut4;

        mut1=phrase+", except from  vending machines.";
        System.out.println(mut1);
        System.out.println("Length of mut1="+ mut1.length());

        mut2=mut1.toUpperCase();
        System.out.println(mut2);
        System.out.println("Length of mut2="+ mut2.length());

        mut3=mut2.replace('E','X');
        System.out.println(mut3);
        System.out.println("Length of mut3="+ mut3.length());

        mut4=mut3.substring(3,30);
        System.out.println(mut4);
        System.out.println("Length of mut4="+ mut4.length());

        String we="Themouseranuptheclock";
        String word=we.substring(3,8);
        System.out.println(word);


        String message="JackandJillwentupthehill";
        System.out.println(message.substring(message.length()-4));

        System.out.println("hello".substring(3));

        System.out.println("hello".substring(5));

        System.out.println("hello".substring(6));

        String digits="1234567890";
        int pos=digits.indexOf("6");
        System.out.println(pos+digits.indexof("a"));


    }
}
