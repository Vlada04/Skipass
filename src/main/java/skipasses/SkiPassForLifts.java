package skipasses;

public class SkiPassForLifts extends SkiPass{

    public static SkiPassForLifts thisSkiPassForLifts = new SkiPassForLifts();
    private SkiPassForLifts(){
        super();
    }
    public static SkiPassForLifts getSkiPassForLifts() {
        return thisSkiPassForLifts;
    }

    private boolean activated;
    private NumberOfLifts NUMBER_OF_LIFTS;

    public enum NumberOfLifts {
        TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100);
        private int numOfLifts;

        NumberOfLifts(int numberOfLifts) {
            this.numOfLifts = numberOfLifts;
        }
        public int getNumberOfLifts(){
            return numOfLifts;
        }
    }

    public SkiPassForLifts(int SkiPassId, Type type, int term, NumberOfLifts numberOfLifts) {
        super(SkiPassId, type, term);
        this.NUMBER_OF_LIFTS = numberOfLifts;
    }

    public int getNumberOfDays() {
        return NUMBER_OF_LIFTS.getNumberOfLifts();
    }

    public boolean isActivated() {
        return activated;
    }

    private void setActivated() {
        this.activated = true;
    }
}
