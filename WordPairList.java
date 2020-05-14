
/**
 * Write a description of class WordPairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPairList
{
    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length-1; i++){
            for (int j = i+1; j < words.length; j++){
                WordPair pair = new WordPair(words[i],words[j]);
                allPairs.add(pair);
            }
        }
    }

    public int numMatches()
    {
        int matches = 0;
        for (int i = 0;i < allPairs.size();i++)
        {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())){
                count++;
            }
        }
        return matches;
    }
}
