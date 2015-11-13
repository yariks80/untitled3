import java.util.*;


public class Main {

    public static   PositionData random(){
        return new PositionData();
    }

    public static List<PositionData> getRandomSetWithLastSessionDateWithCalendar(Date lastSessionDate) {

//        ArrayList<Date> sessionIntervals = new ArrayList<>();
//        for (int i = 0; i < TrendConstants.NUMBER_OF_SESSIONS; i++) {
//          sessionIntervals.add(new Date(RandomUtils.randomBetween(lastSessionDate.getTime()-TrendConstants.MAX_SESSION_INTERVAL, lastSessionDate.getTime()-TrendConstants.MAX_SESSION_MIN)));
//
//        }


        List<PositionData> result = new ArrayList();
        for (int i = 0; i < TrendConstants.NUMBER_OF_SESSIONS; i++) {
            PositionData data = random();
            data.startCurrentSessionTime =lastSessionDate;
            lastSessionDate = new Date(lastSessionDate.getTime()-RandomUtils.randomBetween( TrendConstants.MAX_SESSION_INTERVAL, TrendConstants.MAX_SESSION_MIN));
            data.endPreviousSessionTime = lastSessionDate;
            lastSessionDate=new Date(lastSessionDate.getTime()-120*60*60*1000);
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
