package Bike;

public class Surveyer {
    private final Issue[] TOPICS;
    private final int[][] RESPONSES = new int[5][10];
    public Issue[] getTopics() {
        return TOPICS ;
    }

    public Surveyer(){
        TOPICS = new Issue[10];
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
