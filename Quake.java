import java.util.ArrayList;
public class Quake extends Entity{
    private double current_img;
    private double animation_rate;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public Quake(String name, Point position, Object imgs, double animation_rate){
        super(name, imgs, position);
        this.current_img = 0;
        this.animation_rate = animation_rate;
        this.pending_actions = new ArrayList<>();
    }

    public double get_rate() {
        return this.rate;
    }
    public double get_animation_rate() {
        return this.animation_rate;
    }
}