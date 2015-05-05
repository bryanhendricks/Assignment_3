import java.util.ArrayList;
public class Miners extends Entity{
    private double resource_limit;
    private double rate;
    private double animation_rate;
    public Miners(String name, Double resource_limit, Point position, Double rate,
                  Object imgs, Double animation_rate) {
        super(name, imgs, position);
        this.resource_limit = resource_limit;
        this.rate = rate;
        this.animation_rate = animation_rate;
    }
    public Double get_rate(){
        return this.rate;
    }
    public Double get_resource_limit(){
        return this.resource_limit;
    }
    public Double set_resource_count(Double n){
        this.resource_count = n;
    }
    public Double get_resource_count(){
        return this.resource_count;
    }
    public Double get_animation_rate(){
        return this.animation_rate;
    }
    public String entity_string(){
        return "miner" + this.name + this.position.x +
                this.position.y + this.resource_limit +
                this.rate + this.animation_rate;
    }

    public Point next_position(WorldModel world, Point dest_pt){
        Point entity_pt = this.get_position();
        Double horiz = dest_pt.x - entity_pt.x;
        Point new_pt = new Point(entity_pt.x + horiz, entity_pt.y);
        if (horiz == 0 || world.is_occupied(new_pt)){
            Double vert = dest_pt.y - entity_pt.y;
            new_pt = point.Point(entity_pt.x, entity_pt.y + vert);
            if (vert == 0 || world.is_occupied(new_pt)){
                new_pt = point.Point(entity_pt.x, entity_pt.y);
            }
        }
        return new_pt;
    }
}