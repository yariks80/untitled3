import java.util.*;


public class Main {

    public static   PositionData random(){
        return new PositionData();
    }

    public static List<PositionData> getRandomSetWithLastSessionDateWithCalendar(Date lastSessionDate) {

        List<Date> sessionIntervals = new ArrayList();
        for (int i = 0; i < TrendConstants.NUMBER_OF_SESSIONS; i++) {
          sessionIntervals.add(new Date(RandomUtils.randomBetween(TrendConstants.MAX_SESSION_MIN,TrendConstants.MAX_SESSION_INTERVAL)));

        }


        List<PositionData> result = new ArrayList();
        for (Date interval : sessionIntervals) {
            PositionData data = random();
            data.startCurrentSessionTime =lastSessionDate;
            lastSessionDate = new Date(lastSessionDate.getTime() - interval.getTime());
            data.endPreviousSessionTime = lastSessionDate;
            result.add(data);
        }
        return result;
    }



    public static void main(String[] args) {


        Date a = new Date();
        System.out.println(a);
        Date lastSessionDate = new Date(new Date().getTime()-TrendConstants.MIN_SESSION);
        List<PositionData> result=   Main.getRandomSetWithLastSessionDateWithCalendar(lastSessionDate);
        System.out.println(result);
    }
}
