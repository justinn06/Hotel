public class Main {
    public static void main(String[] args) {

        Points[] allPoints = new Points[10000]; //declared globally

        allPoints[0] = new Points("M100");
        allPoints[1] = new Points("M101", 5000);
        allPoints[2] = new Points("M102", 2000);

        Visits v1 = new Visits("H003", 3);
        Visits v2 = new Visits("H013", 1);
        Visits v3 = new Visits("H003", 2);
        Visits v4 = new Visits("H005", 6);

        allPoints[0].addVisit(v1);
        allPoints[0].addVisit(v2);
        allPoints[0].addVisit(v3);
        allPoints[0].addVisit(v4);
        allPoints[1].addVisit(v1);
        allPoints[1].addVisit(new Visits("H004", 6));

        System.out.println(allPoints[2].getMemberId());
        System.out.println(allPoints[0].getBonusPoints());
        System.out.println(allPoints[1].getAllVisits(1));
    }
}
