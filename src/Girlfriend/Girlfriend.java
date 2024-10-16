package Girlfriend;

public class Girlfriend {
    private final Boyfriend boyfriend;

    public Girlfriend(Boyfriend boyfriend) {
        this.boyfriend = boyfriend;
    }

        public void care() {
            boyfriend.care();
        }

        public void spend() {
            boyfriend.spend();
        }

        public void last() {
            boyfriend.last();
        }

}
