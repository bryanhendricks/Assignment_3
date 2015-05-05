import java.util.ArrayList;
public class Grid {
    private double width;
    private double height;
    private ArrayList<Double> cells = new ArrayList<Double>();                              //Type?
    public Grid(double width, double height, int occupancy_value) {
        this.width = width;
        this.height = height;
        this.cells = new ArrayList<>();
        int row = 0;
        int col = 0;
        while(row < this.height){
            this.cells.add(new ArrayList<>());
            while(col < this.width){
                this.cells[row].add(occupancy_value);
                col++;
            }
            row++;
        }
    }



    public void set_cell(Grid grid, Point point, double value) {                //Is value a Double?
        grid.cells[point.y][point.x] = value;
    }
    public double get_cell(Grid grid, Point point) {                            //Is value a double?
        return grid.cells[point.y][point.x];
    }
    int EMPTY=0;
    int GATHERER=1;
    int GENERATOR=2;
    int RESOURCE=3;
}