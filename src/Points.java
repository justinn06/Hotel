public class Points {

    private String memberId;
    private int totalPoints;
    private int bonusPoints;
    private String statusNow;
    private String statusNextYear;
    private Visits[] allVisits = new Visits[366];

    int visits;

    public Points(String id) {
        this.memberId = id;
        bonusPoints = 0;
        visits = 0;
        statusNow = "Bronze";
    }

    public Points(String id, int bp) {
        this.memberId = id;
        bonusPoints = bp;
        visits = 0;
        statusNow = "Bronze";
    }

    public String getMemberId() {
        return this.memberId;
    }

    public int getTotalPoints() {
        return this.totalPoints;
    }

    public int getBonusPoints() {
        return this.bonusPoints;
    }

    public String getStatusNow() {
        return this.statusNow;
    }

    public String getStatusNextYear() {
        return this.statusNextYear;
    }

    public Visits getAllVisits(int v) {
        return this.allVisits[v];
    }

    public void addVisit(Visits v) {
        this.allVisits[visits] = v;
        visits = visits + 1;
    }

    public String isGold() {
        if (this.getStatusNow().equals("Gold"))
            return "Current status is gold.";
        else
            return "Current status is not gold.";
    }

    public int calculateTotalPoints(Visits v) {
        //use days to calculate total n of points
        int days = v.getDays();
        int TP = days*1000;
        return TP;
    }

    public String daysMissing(Points ID) {
        int points;
        int days;
        if (ID.getStatusNow().equals("Bronze"))
            points = 10000 - ID.getTotalPoints();
            days = points/100;
        else if (ID.getStatusNow().equals("Silver"))
            points = 50000 - ID.getTotalPoints();
            days = points/100;
        else if (ID.getStatusNow().equals("Gold"))
            points = 50000 - ID.getTotalPoints();
            days = points/100;
        else

        return "Customer needs to stay " + days + " days to keep their status.";
    }

}
