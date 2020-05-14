
/**
 * Write a description of class Delimiters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Delimiters
{
    public ArrayList<String> getDelimitersList(String[] tokens){
        ArrayList<String> delims;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == openDel || tokens[i] == closeDel) {
                delims.add(tokens[i]);
            }
        }
        return delims;
    }
    
    public boolean isBalanced(ArrayList<String> delimiters){
        int opens;
        int closes;
        if(!(delimiters.get(0) == openDel)){
            return false;
        }
        for (int i = 0; i < delimiters.size(); i++){
            if (delimiters.get(i) == openDel){
                opens++;
            } else if (delimiters.get(i) == closeDel){
                closes++;
            }
            if (closes > opens){
                return false;
            }
        }
        if(opens == closes){
            return true;
        } else {
            return false;
        }
    }
}
