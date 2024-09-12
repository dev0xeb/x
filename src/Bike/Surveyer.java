package Bike;

public class Surveyer {
    private final String[] TOPICS = {"Education", "Paternity Fraud", "Marternity issues", "Miracle", "Mystery"};
    private final int[][] RESPONSES = new int[5][10];
    public String[] getTopics() {
        return TOPICS ;
    }

    public int[][] getResponses() {
        return RESPONSES;
    }
    public void RateIssue(int issue, int rating){
        issue = issue - 1;
        int[] issueToRate = RESPONSES[issue];
        rating = rating - 1;
        issueToRate[rating] = issueToRate[rating]+1;
    }
}
