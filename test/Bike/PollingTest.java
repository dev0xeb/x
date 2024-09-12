package Bike;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {
    private final Surveyer surveyer = new Surveyer();

    @Test
    public void testThatPolingAppExists() {
        assertNotNull(surveyer);
    }
    @Test
    public void testThatSurveyHasFiveIssues(){
        String[] topics = surveyer.getTopics();
        assertEquals(5, topics.length);
    }
    @Test
    public void testThatTHeSurveyIssuesExist(){
        String[] topics = surveyer.getTopics();
        for(String topic : topics){
            assertNotNull(topic);
//            assertEquals(topic.getClass(), String.class);
        }
    }

    @Test
    @DisplayName("POLLING RESULT")
    public void testTatPollingApplicationHas5By10Table() {
        int[][] responses = surveyer.getResponses();
        assertEquals(5, responses.length);
        for (int [] response : responses) {
            assertEquals(10, response.length);
        }
    }
    @Test
    public void testThatSurveyCanStorePollingRatings(){
        surveyer.RateIssue(5, 8);
        surveyer.RateIssue(3, 2);
        surveyer.RateIssue(4, 1);
        int[][] responses = surveyer.getResponses();
        int fifthIssueResponse= responses[4][7];
        assertEquals(1, fifthIssueResponse);
        int thirdIssueResponse= responses[2][1];
        assertEquals(1, thirdIssueResponse);
        int fourthIssueResponse= responses[3][0];
        assertEquals(1, fourthIssueResponse);
    }
}
