import java.util.ArrayList;
public class Entities extends Locations{
    public Entities(double num_rows, double num_cols){
        super(num_rows, num_cols);
    }

    public void add_entity(Entity entity) {
        Point pt = entity.get_position();
        if (this.within_bounds(pt)) {
            Entity old_entity = occ_grid.get_cell(this.occupancy, pt);
            if (old_entity != null) {
                old_entity.clear_pending_actions();
            }
            set_cell(this.occupancy, pt, entity);
            this.entities.add(entity);
        }
    }
    /*
    def move_entity(self, entity, pt):
    tiles = []
            if self.within_bounds(pt):
    old_pt = entity.get_position()
            occ_grid.set_cell(self.occupancy, old_pt, None)
            tiles.append(old_pt)
            occ_grid.set_cell(self.occupancy, pt, entity)
            tiles.append(pt)
            entity.set_position(pt)
            return tiles
    */
    public void remove_entity(Entity entity) {
        this.remove_entity_at(entity.get_position());
    }
    public void remove_entity_at(Point pt) {
        if (this.within_bounds(pt) && get_cell(this.occupancy, pt) != null) {
            Entity entity = get_cell(this.occupancy, pt);
            entity.set_position(new Point(-1, -1));
            this.entities.remove(entity);
            set_cell(this.occupancy, pt, null);
        }
    }
}