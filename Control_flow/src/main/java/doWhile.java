public class doWhile {

    //this time, we're not creating a constructor, so we'll have to instantiate this class
    //to use its methods

    public void printValueIfTrue(){
        boolean check = false;
        do {
            //here is where we put the logic
            /*
            Here, the logic will run, since it reads tup to bottom, and it will
            go on until the condition (at the bottom) is no longer verified. Otherwise
            we have an infinite loop
             */
            System.out.println("This will run at least once.");
        }while (check == true);
    }
}
