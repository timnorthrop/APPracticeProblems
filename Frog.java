
/**
 * Write a description of class Frog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Frog
{
    public boolean simulate(){
        boolean sim = false;
        int traveled = 0;
        for(int x = 0; x < maxHops; x++){
            traveled += hopDistance();
        }
        if(traveled >= goalDistance){
            sim = true;
        }
        return sim;
    }
    
    public double runSimulations(int num){
        int trues = 0;
        for (int x = 0; x < num; x++){
            if(simulate()){
                trues++;
            }
        }
        return trues/num;
    }
}
