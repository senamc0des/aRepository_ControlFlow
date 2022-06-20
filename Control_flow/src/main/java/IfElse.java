public class IfElse {

    public IfElse(){

    }

    public boolean checkStringLength(String input){


        //the condition says that if the length of the input we send in is longer
        //than seven characters, return true, otherwise, return false
        if (input.length() > 7) {

            return true;
        }
        else {
            return false;
        }

        //note: we will no longer need this, because this line will never be reached
        //because every possible outcome will cause a return in the previous lines
        //return false;
    }

    public String printTStringsOnly(String input){
        //Here, we made the variable firstLetter and it is equal to the character
        //at index 0 of the string input
        char firstLetter = input.charAt(0);
        //here, we declare check, but we do not assign it a value
        boolean check;
        if(String.valueOf(firstLetter).equals("T") || String.valueOf(firstLetter).equals("t")){
            return input + " begins with the letter t.";
        }
        else {
            //Here, we're giving check a value;
            check = false;
        }
        return "Did this word begin with the letter T?? " + check;
    }
}
