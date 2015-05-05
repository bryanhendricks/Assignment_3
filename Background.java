import java.util.ArrayList;
public class Background extends Scheduling{
    private Grid background = new Grid(num_cols, num_rows, background);                 //Recursive?
    public Background(double num_rows, double num_cols, Grid background){
        super(num_rows, num_cols);
        this.background = new Grid(num_cols, num_rows, background);
    }
    public Object get_background_image(Point pt) {
        if (this.within_bounds(pt)) {
            return get_cell(this.background, pt).get_image();
        }
    }
    public Entity get_background(Point pt) {
        if (this.within_bounds(pt)) {
            return get_cell(this.background, pt);
        }
    }
    public void set_background(Point pt, Background bgnd) {
        if (this.within_bounds(pt)) {
            set_cell(this.background, pt, bgnd);
        }
    }
    public Entity get_tile_occupant(Point pt) {
        if (this.within_bounds(pt)) {
            return get_cell(this.occupancy, pt);
        }
    }
    public ArrayList<Entity> get_entities() {
        return this.entities;
    }
}