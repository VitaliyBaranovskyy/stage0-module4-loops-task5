package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        int i;
        int j;
        for (i =1; i <= height; i++){
            for (j=1; j<=length; j++){
             if (i==1 || i == height || j==1 || j== length)
                 System.out.print("8 ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
     Rectangle main = new Rectangle();
        main.printRectangleFrom8s(11,7);
    }
}
