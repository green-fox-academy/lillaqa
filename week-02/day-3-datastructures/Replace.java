package DataStructures;

public class Replace {

    public static void main(String[] args){

        String amend = replace("In a dishwasher far far away","dishwasher","galaxy");

        System.out.println(amend);
    }

    static String replace(String text, String toChange, String amended){
        text = text.replaceAll(toChange,amended);
        return text;

    }
}

