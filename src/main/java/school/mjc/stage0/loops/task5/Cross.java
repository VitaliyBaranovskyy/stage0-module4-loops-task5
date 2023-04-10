package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int i;
        int j;
        for (i=1; i<=sideLength; i++){
             for (j=1; j<=sideLength; j++){
              if (i==sideLength/2+1 || j==sideLength/2+1)
                  System.out.print("8");
                 else
                     System.out.print(" ");
             }
            System.out.println();
        }
    }
    public static void main (String [] args ){
       Cross main = new Cross();
        main.printCross(7);
    }
   }
