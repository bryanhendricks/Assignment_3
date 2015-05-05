import java.util.ArrayList;
public class Locations{
    private double num_rows;
    private double num_cols;
    public ArrayList<Entity> entities = new ArrayList<Entity>();
    public Grid occupancy = new Grid(num_cols, num_rows, 0);             //0 Should be None
    public Locations(double num_rows, double num_cols){
        this.entities = new ArrayList<>();
        this.num_rows = num_rows;
        this.num_cols = num_cols;
        this.occupancy = new Grid(num_cols, num_rows, 0);             //0 Should be None
    }
    public boolean within_bounds(Point pt) {
        return (pt.x >= 0 && pt.x < this.num_cols && pt.y >= 0 && pt.y < this.num_rows);
    }
    public boolean is_occupied(Point pt) {
        return (this.within_bounds(pt) && get_cell(this.occupancy, pt) != null);
    }
    /*
    public Entity find_nearest(Point pt, Entity type) {
        Entity oftype = [(e, distance_sq(pt, e.get_position()))
            for (Entity e : self.entities) if (e instanceof type)];
        return nearest_entity(oftype);
    }
    */
    public Entity find_nearest(Point pt, Entity type) {
        ArrayList<Entity> entList = new ArrayList<Entity>();
        ArrayList<Double> distList = new ArrayList<Double>();
        for (Entity e : this.entities){
            if (e instanceof type) {
                entList.add(e);
                distList.add(distance_sq(pt, e.get_position()));
            }
        }
        return nearest_entity(entList, distList);
    }


    public Entity nearest_entity(ArrayList<Entity> entList, ArrayList<Double> distList) {
        Entity nearest = null;
        int i = 0;
        int nearestI = 0;
        if (entList.size() > 0) {
            while (i < entList.size()){
                if(distList[i] < distList[nearestI]){
                    nearestI = i;
                }
                i++;
            }
        }
        /*
        if (entity_dists.size() > 0) {
            ArrayList<> pair = entity_dists[0]  //pair = [entity, distance]
            for (ArrayList<> other : entity_dists) {    //other == [entity, distance] stepping through the input list
                if (other[1] < pair[1]) {        //if the new distance is < old dist, set old dist to new dist
                    pair = other;
                }
                nearest = pair[0];           //nearest = [nearEntity, nearDistance]
            }
        }
        */
        else {
            nearestI = None;
        }
        return entList[nearestI];
    }
    public double distance_sq(Point p1, Point p2) {
        return (pow((p1.x - p2.x), 2) + pow((p1.y - p2.y), 2));
    }
}