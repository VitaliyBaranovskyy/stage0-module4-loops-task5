package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i;
        int j;
        for (i = 1; i <= height; i++){
            for(j=1; j<=height; j++){
                if (i==j || i+j==height+1 || i==1 || i==height)
                    System.out.print("8");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main (String [] args){
        Hourglass main = new Hourglass();
        main.printHourglassOfGivenSize(9);
    }
}
