
/**
 * Write a description of class ScoreReport here.
 *
 * @author Tim Northrop
 * @version 05.11.20
 */
public class ScoreReport
{
    public boolean record(int score){
        boolean found = false;
        for(ScoreInfo a : scoreList){
            if(score == a.getScore){
                found = true;
                a.increment();
                return false;
            }
        }
        if (!found){
            ScoreInfo newScore = new ScoreInfo(score);
            scoreList.add(newScore);
            return true;
        }
        return false;
    }
    
    public void recordScores(int[] stuScores){
        for(int i : stuScores){
            record(i);
        }
    }
}
