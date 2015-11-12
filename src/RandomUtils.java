/**
 * Created by HOME on 12.11.2015.
 */
public class RandomUtils {
    public static Long randomBetween(Long start, Long end) {
        return start + Math.round(Math.random() * (end - start));
    }
}
