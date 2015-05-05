import java.util.ArrayList;
public class MinerFull extends Miners{
    private double current_img;
    private double resource_count;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public MinerFull(String name, Double resource_limit, Point position,
                     Double rate, Object imgs, Double animation_rate){
        super(name, resource_limit, position,
                rate, imgs, animation_rate);
        this.current_img = 0;
        this.resource_count = 0;
        this.pending_actions = new ArrayList<>();
    }

    public Entity try_transform_miner_full(WorldModel world) {
        Entity new_entity = entities.MinerNotFull(
                this.get_name(), this.get_resource_limit(),
                this.get_position(), this.get_rate(),
                this.get_images(), this.get_animation_rate());
        return new_entity;
    }

    public boolean miner_to_smith(WorldModel world, Blacksmith smith) {
        Point entity_pt = this.get_position();
        if (smith != null){
            return false;
        }
        Point smith_pt = smith.get_position();
        //if (actions.adjacent(entity_pt, smith_pt)) {
        if (sqrt(pow((entity_pt.x - smith_pt.x), 2) + pow((entity_pt.y - smith_pt.y), 2)) == 1){             //Might need to import math and add in "math." before sqrt and pow
            smith.set_resource_count(smith.get_resource_count() +
                    this.get_resource_count());
            this.set_resource_count(0);
            return true;
        }
        else {
            Point new_pt = this.next_position(world, smith_pt);
            return false;
        }
    }
}