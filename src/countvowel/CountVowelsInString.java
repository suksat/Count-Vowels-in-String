package countvowel;

import java.util.ArrayList;

public class CountVowelsInString
{
    ArrayList<Character> al;

    // constructor
    CountVowelsInString()
    {
        al = new ArrayList<>();
        al.add('A'); al.add('E');
        al.add('a'); al.add('e');
        al.add('I'); al.add('O');
        al.add('i'); al.add('o');
        al.add('U'); al.add('u');
    }


    // accepts char and returns boolean
    private boolean isVowel(char c)
    {
        for(int i = 0; i < al.size(); i++)
        {
            System.out.println("*** *** within for-loop i="+i+" to al.size()="+al.size()+" *** ***");
            if(c == al.get(i))
            {
                System.out.println("(29) i: " + i + " ---> c: " + c +  " ---> al.get(i): " + al.get(i));
                return true;
            }
        }
        System.out.println("(33) Returning False for c: " + c);
        return false;
    }

    // execution order first as per main method
    // accepts String and returns int
    public int countVowels(String s)
    {
        int countVowel = 0; // store total number of vowels
        int size = s.length(); // size of string
        for(int j = 0; j < size; j++)
        {
            System.out.println("*** *** within for-loop j="+j+" to s.length()="+s.length()+" *** ***");
            char c = s.charAt(j);
            System.out.println("(47) s: " + s + " ... s.length(): " + s.length() + " ... j: " + j + " ... c: " + c + " ... s.charAt(j): " + s.charAt(j));
            if(isVowel(c))
            {
                countVowel = countVowel + 1;
                System.out.println("(51) c: " + c + " ... isVowel(c): " + isVowel(c) + " ... countVowel: " + countVowel);
            }
        }

        return countVowel;
    }

    // main method
    public static void main(String args[])
    {

        CountVowelsInString obj = new CountVowelsInString();

        String str = "Sukumar Satyen is a Pro in Java";

        int noOfVowel = obj.countVowels(str);

        System.out.println("String: " + str);

        System.out.println("Total number of vowels in the string are: "+ noOfVowel);
    }
}


