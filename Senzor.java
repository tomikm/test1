
import java.awt.Color;
import net.useobjects.draw.drawable.CircleView;
import net.useobjects.draw.drawable.GroupView;
import net.useobjects.geom.Position;
import net.useobjects.timer.SimpleTimer;


public class Senzor {
    private CircleView senzor;
    boolean aktiv = false;
    
    
    public Senzor(GroupView group,int x, int y){
        
           CircleView senzor = new CircleView(group,x,y,5,Color.BLACK,true);
           this.senzor = senzor;
    }
         
public Position dajPoziciu(){
    return senzor.getPosition();
}
 public void aktivujSenzor(){
     aktiv = true;
     senzor.setColor(Color.red);
      
     
 }
 public void deaktivujSenzor(){
     aktiv = false;
     senzor.setColor(Color.BLACK);
 }

}
