import java.util.Scanner;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    private int dimension;
    private int[][] data;

    public Square(String input){
        int row = -1;
        int col = 0;
        for(int index = 1; index < input.length(); index++){
            if(input.charAt(index) == '{'){
                row++;
            } else if(input.charAt(index) == '}'){
                col = 0;
                index += 3;
            } else if(input.charAt(index) == ',' && !(input.charAt(index-1) == '}')){
                index++;
            } else {
                data[row][col] = Integer.parseInt(Character.toString(input.charAt(index)));
            }
        }
    }
    
    public Square(int order){
        dimension = order;
        int[] d1 = new int[order*order];
        for(int i = 1; i <= order*order; i++){
            d1[i-1] = i;
        }
        for(int i = 0; i < order*order; i++){
            int random = (int)Math.round(Math.random()*order*order);
            int temp = d1[i];
            d1[i] = d1[random];
            d1[random] = temp;
        }
        for(int row = 0; row < order; row++){
            for(int i = 0; i < order; i++){
                data[row][i] = d1[i+row*3];
            }
        }
    }
    
    public boolean isMagic(){
        boolean verts = false;
        boolean horis = false;
        for(int i = 0; i < data.length; i++){
            
        }
        if(verts&&horis){
            return true;
        }
        return false;
    }

    public String toString(){
        String toString = "";
        for(int i = 0; i < dimension; i++){

        }
        return toString;
    }
}
