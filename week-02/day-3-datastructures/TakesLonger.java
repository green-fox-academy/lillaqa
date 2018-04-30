package DataStructures;

public class TakesLonger {

    public static void main(String[] args){

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        quote = new StringBuilder(quote).insert(21,"always takes longer than ").toString();


        System.out.println(quote);
    }
}
