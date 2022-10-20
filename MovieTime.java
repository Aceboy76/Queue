
package movietime;
import java.util.*;

public class MovieTime {

   
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       
       Queue Movies = new LinkedList();
       Queue Snacks = new LinkedList();
       
        for(int i = 1; i <= 3; i++){
            System.out.print("Enter movie " + i + " of 3: ");
            String m = scn.nextLine();
            Movies.offer(m);
        }
         for(int i = 1; i <= 3; i++){
            System.out.print("Enter snacks " + i + " of 3: ");
            String s = scn.nextLine();
            Snacks.offer(s);
        }
      
        System.out.println("------------------------------");
        System.out.println("Movies to watch are: " + Movies.toString().replace("[", "").replace("]", ""));
        System.out.println("Snacks available are: " + Snacks.toString().replace("[", "").replace("]", ""));
        
        for(int a  = 1; a <= 3; a++){
            System.out.println("----------------------------------");
            System.out.print("Press S everytime you finish a snack: ");
            String eat = scn.nextLine();
            if(eat.equalsIgnoreCase("S")){
                Snacks.poll();
                System.out.println(Snacks.toString().replace("[", "").replace("]", ""));
                if(Snacks.isEmpty()){
                    System.out.println("No more snacks");
                }
            }
        }
    }
    
}
