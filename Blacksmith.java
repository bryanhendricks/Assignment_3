import java.util.ArrayList;
public class Blacksmith extends Interactables{
    private double resource_distance;
    private double current_img;
    private double resource_count;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public Blacksmith(String name, Point position, Object imgs, Double resource_limit,
                      Double rate, Double resource_distance){
        super(name, rate, position, imgs, resource_distance);
        this.resource_distance = 1;
        this.current_img = 0;
        this.resource_count = 0;
        this.pending_actions = new ArrayList<>();
    }
    public void set_resource_count(Double n) {
        this.resource_count = n;
    }
    public Double get_resource_count() {
        return this.resource_count;
    }
    public Double get_resource_limit() {
        return this.resource_limit;
    }
}