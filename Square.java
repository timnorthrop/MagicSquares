
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
    
    public void magicSquare(int order){
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
        //for int
        for(int i = 0; i < order; i++){
            data[0][i] = d1[i];
        }
    }
    
    public String toString(){
        String toString = "";
        for(int i = 0; i < dimension; i++){
            
        }
        return toString;
    }
}
