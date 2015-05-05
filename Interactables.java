import java.util.ArrayList;
public class Interactables extends Entity {
    private double rate;
    private double resource_distance;
    public Interactables(String name, Double rate, Point position, Object imgs, Double resource_distance){
        super(name, imgs, position);
        this.rate = rate;
        this.resource_distance = resource_distance;
    }
    public Double get_rate(){
        return this.rate;
    }
    public Double get_resource_distance(){
        return this.resource_distance;
    }
    public String entity_string(){
        return "vein" + this.name + this.position.x +
                this.position.y + this.rate +
                this.resource_distance;
    }
}