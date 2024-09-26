/*
Problem Statement 

Convert binary no to decimal
Convert dec to binary

Input: 1010
Output: 10

input:5
output:0101

*/
public class accenture5{
    public static int binaryToDec(String binary){
        return Integer.parseInt(binary,2);
    }
    public static String decToBin(int dec){
        return Integer.toBinaryString(dec);
    }
    public static void main(String[] args) {
        String binary="1111";
        System.out.println(binaryToDec(binary));
       int dec=55;
       System.out.println(decToBin(dec));
    }
}
