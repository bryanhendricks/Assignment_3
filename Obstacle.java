import java.util.ArrayList;
public class Obstacle extends Entity{
    private double current_img;
    public Obstacle(String name, Point position, Object imgs){
        super(name, imgs, position);
        this.current_img = 0;
    }

    public String entity_string() {
        return "obstacle" + this.name + this.position.x + this.position.y;
    }
}