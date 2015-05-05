import java.util.ArrayList;
public class BackgroundEnt extends Scheduling{
    private String name;
    private Object imgs;
    private double current_img;
    public BackgroundEnt(String name, Object imgs){
        super(num_rows, num_cols);
        this.name = name;
        this.imgs = imgs;
        this.current_img = 0;
    }
    public String get_name(){
        return this.name;
    }
    public Object get_images(){
        return this.images;
    }
}