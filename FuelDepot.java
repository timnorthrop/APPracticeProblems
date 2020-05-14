
/**
 * Write a description of class FuelDepot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FuelDepot
{
    public int nextTankToFill(int threshold){
        boolean none = true;
        int smallest = 100;
        for(int i = 0; i < tanks.size(); i++){
            if(tank.get(i).getFuelLevel() <= threshold){
                none = false;
            }
            if (tanks.get(i).getFuelLevel() <= smallest){
                smallest = i;
            }
        }
        if (none){
            return filler.getCurrentIndex();
        } else {
            return smallest;
        }
    }
    public void moveToLocation(int locIndex){
        if(filler.getCurrentIndex() == locIndex){
            
        } else if (filler.getCurrentIndex() < locIndex){
            if(!filler.isFacingRight()){
                filler.changeDirection();
            }
            filler.moveForward(locIndex-filler.getCurrentIndex());
        } else if (filler.getCurrentIndex() > locIndex){
            if(filler.isFacingRight()){
                filler.changeDirection();
            }
            filler.moveForward(filler.getCurrentIndex()-locIndex);
        }
    }
}
