package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        int i ;
        int j ;
        for (i=1; i<=cathetusLength; i++){
            for (j=1; j<=cathetusLength; j++){
                if (i==cathetusLength || j==1 || i==j)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
   public static void main (String [] args){
       Triangle main = new Triangle();
       main.printTriangle(8);
   }
}
