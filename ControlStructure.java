public class ControlStructure {

    public static void main (String [] args) {

        //if statement-control structure

        System.out.println("");
        System.out.println("output of if loop");
        System.out.println("");
        
        int number=10;
        
        if (number>0){
            System.out.println("the number is positive");       
        }

        //for loop-control structure
        

        System.out.println("");
        System.out.println("output of for loop");
        System.out.println("");
        
        for(int y=1; y<=5; y++){
            System.out.println(y);
        }

        //while loop-control structure

        System.out.println("");
        System.out.println("output of while loop");
        System.out.println("");
        
        int z=1;
       
        while(z<=5){
            System.out.println(z);
            z++;
        }

        //do while loop-control structure

        System.out.println("");
        System.out.println("output of do while loop");
        System.out.println("");

        int x=1;

        do { 
          System.out.println(x);
          x++;  
        } while (x<=5);
        
        



    }
}
