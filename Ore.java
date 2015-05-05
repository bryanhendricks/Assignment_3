import java.util.ArrayList;
public class Ore extends Entity{
    private double rate;
    private double current_img;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public Ore(String name, Point position, Object imgs, Double rate){
        super(name, imgs, position);
        this.rate = 5000;
        this.current_img = 0;
        this.pending_actions = new ArrayList<>();
    }
    public Double get_rate() {
        return this.rate;
    }
    public String entity_string() {
        return "ore" + this.name + this.position.x +
                this.position.y + this.rate;
    }
}