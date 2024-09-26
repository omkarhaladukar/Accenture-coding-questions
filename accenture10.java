
/* 

Ques: The program is supposed to calculate the sum of  distance between three points from each other.

For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6

Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2

*/


public class accenture10 {
    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 4;
        int x3 = 3, y3 = 6;

        double ds1 = distance(x1, x2, y1, y2);
        double ds2 = distance(x2, x3, y2, y3);
        double ds3 = distance(x1, x3, y1, y3);
        double total = ds1 + ds2 + ds3;
        System.out.println(total);

    }
}
