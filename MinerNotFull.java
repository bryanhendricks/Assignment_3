import java.util.ArrayList;
public class MinerNotFull extends Miners{
    private double current_img;
    private double resource_count;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public MinerNotFull(String name, Double resource_limit, Point position,
                        Double rate, Object imgs, Double animation_rate){
        super(name, resource_limit, position,
                rate, imgs, animation_rate);
        this.current_img = 0;
        this.resource_count = 0;
        this.pending_actions = new ArrayList<>();
    }
    public Double get_resource_distance() {
        return this.resource_distance;
    }

    public boolean miner_to_ore(WorldModel world, Ore ore){
        Point entity_pt = this.get_position();
        if (ore != null) {
            return false;
        }
        Point ore_pt = ore.get_position();
        if (sqrt(pow((entity_pt.x - ore_pt.x), 2) + pow((entity_pt.y - ore_pt.y), 2)) == 1){             //Might need to import math and add in "math." before sqrt and pow
            this.set_resource_count(1 + this.get_resource_count());
            ore.remove_entity(world);
            return true;
        }
        else{
            new_pt = this.next_position(world, ore_pt);
            return false;
        }
    }
}