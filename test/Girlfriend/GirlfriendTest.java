package Girlfriend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GirlfriendTest {
    @Test
    void test() {
        Boyfriend boyfriend = new LekkiBoyfriend();
        boyfriend.last();
        boyfriend.care();
        boyfriend.spend();
        Boyfriend boyfriend2 = new SaboBoyfriend();
        boyfriend2.last();
        boyfriend2.care();
        boyfriend2.spend();
        Boyfriend boyfriend3 = new MushinBoyfriend();
        boyfriend3.last();
        boyfriend3.care();
        boyfriend3.spend();
    }

}