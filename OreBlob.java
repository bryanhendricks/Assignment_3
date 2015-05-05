import java.util.ArrayList;
public class OreBlob extends Entity{
    private double rate;
    private double current_img;
    private double animation_rate;
    private ArrayList<Object> pending_actions = new ArrayList<Object>();
    public OreBlob(String name, Point position, Double rate, Object imgs, Double animation_rate){
        super(name, imgs, position);
        this.rate = rate;
        this.current_img = 0;
        this.animation_rate = animation_rate;
        this.pending_actions = new ArrayList<>();
    }
    public Double get_rate() {
        return this.rate;
    }
    public Double get_animation_rate() {
        return this.animation_rate;
    }
    public boolean blob_to_vein(WorldModel world, Vein vein) {
        Point entity_pt = this.get_position();
        if (vein != null){                                                                       //How would I write this?
            return false;
        }
        Point vein_pt = vein.get_position();
        //if (actions.adjacent(entity_pt, vein_pt)) {
        if (sqrt(pow((entity_pt.x - vein_pt.x), 2) + pow((entity_pt.y - vein_pt.y), 2)) == 1){             //Might need to import math and add in "math." before sqrt and pow
            vein.remove_entity(world);
            return true;
        }
        else {
            Point new_pt = this.blob_next_position(world, vein_pt);
            Entity old_entity = world.get_tile_occupant(new_pt);
            if (old_entity instanceof Ore) {
                old_entity.remove_entity(world);
            }
            return false;
        }
    }

    public Point blob_next_position(WorldModel world, Point dest_pt) {
        Point entity_pt = this.get_position();
        Double horiz = dest_pt.x - entity_pt.x;
        Point new_pt = new Point(entity_pt.x + horiz, entity_pt.y);
        if (horiz == 0 || (world.is_occupied(new_pt) &&
                !(world.get_tile_occupant(new_pt) instanceof entities.Ore))){
            Double vert = dest_pt.y - entity_pt.y;
            new_pt = new Point(entity_pt.x, entity_pt.y + vert);
            if (vert == 0 || (world.is_occupied(new_pt) &&
                    !(world.get_tile_occupant(new_pt) instanceof entities.Ore))){
                new_pt = new Point(entity_pt.x, entity_pt.y);
            }
        }
        return new_pt;
    }
}