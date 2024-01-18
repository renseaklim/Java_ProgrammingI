public class TaskEight {
    public static int input(int num) throws IllegalArgumentException{
        if(num==0){
            throw new IllegalArgumentException("cannot input zero");
        }
        else{
            return num;
        }

    }
    public static void main(String[] args) {
        try{
            System.out.println(input(0));
        }catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("This is the end of the code!!!!");
    }
}

