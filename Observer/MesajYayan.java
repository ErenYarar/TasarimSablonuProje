import java.util.ArrayList;
import java.util.List;
 
public class MesajYayan implements Subject 
{
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void ekle(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void cikart(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void bildirUpdate(Mesaj m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}
