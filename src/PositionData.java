import java.util.Date;

/**
 * Created by HOME on 12.11.2015.
 */
public class PositionData {
    Date startCurrentSessionTime;
    Date endPreviousSessionTime;

       @Override
    public String toString() {
        return "PositionData{" +
                "startCurrentSessionTime=" + startCurrentSessionTime.toString() +
                ", endPreviousSessionTime=" + endPreviousSessionTime.toString() +
                "}\n";
    }

}
