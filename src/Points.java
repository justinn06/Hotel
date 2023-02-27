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

    public int calculateTotalPoints() {
        //use days to calculate total n of points
    }

    /*public int daysMissing() {
        if (this.getStatusNow().equals("Bronze"))
            if (10000 - this.getTotalPoints())

    }*/

}
