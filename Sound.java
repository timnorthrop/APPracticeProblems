
/**
 * Write a description of class Sound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sound
{
    public int limitAmplitude(int limit){
        int numChanges = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > limit){
                samples[i] = limit;
                numChanges++;
            } else if (samples[i] < -limit){
                samples[i] = -limit;
                numChanges++;
            }
        }
        return numChanges;
    }
    
    public void trimSilenceFromBeginning(){
        int startIndex = 0;
        for (int i = 0; i < samples.length; i++){
            if(samples[i] == 0){
                startIndex = i;
            }else{
                break;
            }
        }
        int[] newSound = new int[samples.length - startIndex];
        for (int i = startIndex; i < samples.length; i++){
            newSound[i - startIndex] = samples[i];
        }
        samples = newSound;
    }
}
