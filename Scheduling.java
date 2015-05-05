import java.util.ArrayList;
public class Scheduling extends Entities{
    public Scheduling(double num_rows, double num_cols){
        super(num_rows, num_cols);
    }
    /*
    def schedule_action(self, action, time):
            self.action_queue.insert(action, time)
    def unschedule_action(self, action):
            self.action_queue.remove(action)
    def update_on_time(self, ticks):
    tiles = []
    next = self.action_queue.head()
            while next and next.ord < ticks:
            self.action_queue.pop()
            tiles.extend(next.item(ticks))
    next = self.action_queue.head()
            return tiles
    */
}