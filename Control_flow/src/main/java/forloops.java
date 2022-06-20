public class forloops {

    public static void printAssociatesNames(String[] names){

        for(int i = 0; i < names.length; i++){

        }
    }

    public static int printAssociatesNameCount(String[] associates){
        int counter = 0;

        //here we have an enhanced for loop
        for(String arrayloop: associates){
            //next, we'll add the length/count of each count in associates to our count
            System.out.println(arrayloop);
            if(arrayloop != null) {
                counter++;
            }
        }
        return counter;
    }
}
