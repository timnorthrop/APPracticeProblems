
/**
 * Write a description of class Gizmo here.
 *
 * @author Tim Northrop
 * @version 5/13/20
 */
public class APPracticeProblems
{
    public int countElectronicsByMaker(String maker){
        int count = 0;
        for(Gizmo g : purchases){
            if (purchases.get(i).getMaker() == maker){
                count++;
            }
        }
        return count;
    }
    
    public boolean hasAdjacentEqualPair(){
        if (purchases.size() < 2){
            return false;
        }
        for (int i = 1; i < purchases.size(); i++){
            if(purchases.get(i-1).equals(purchases.get(i))){
                return true;
            }
        }
        return false;
    }
    
    //maybe I'm missing something, but the instructions for the 
    //check digit problem are so convoluted that I don't even know
    //where to start
}
