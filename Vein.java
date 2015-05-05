import java.util.ArrayList;
public class Vein extends Interactables{
    private double resource_distance;
    private double current_img;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public Vein(String name, Double rate, Point position, Object imgs, Double resource_distance) {
        super(name, rate, position, imgs, resource_distance);
        this.resource_distance = 1;
        this.current_img = 0;
        this.pending_actions = new ArrayList<>();
    }
}