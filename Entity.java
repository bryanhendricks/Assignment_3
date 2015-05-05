import java.util.ArrayList;
public class Entity{
    private String name;
    private Object imgs;
    private Point point;
    public Entity(String name, Object imgs, Point point){
        this.name = name;
        this.imgs = imgs;
        this.point = point;
    }

    Double BLOB_RATE_SCALE = 4;
    Double BLOB_ANIMATION_RATE_SCALE = 50;
    Double BLOB_ANIMATION_MIN = 1;
    Double BLOB_ANIMATION_MAX = 3;

    Double ORE_CORRUPT_MIN = 20000;
    Double ORE_CORRUPT_MAX = 30000;

    Double QUAKE_STEPS = 10;
    Double QUAKE_DURATION = 1100;
    Double QUAKE_ANIMATION_RATE = 100;

    Double VEIN_SPAWN_DELAY = 500;
    Double VEIN_RATE_MIN = 8000;
    Double VEIN_RATE_MAX = 17000;

    public void set_position(Point point){
        this.position = point;
    }
    public Point get_position(){
        return this.position;
    }
    public String get_name(){
        return this.name;
    }
    public Object get_images(){
        return this.images;
    }
}