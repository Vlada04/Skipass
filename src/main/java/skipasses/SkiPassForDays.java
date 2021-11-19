package skipasses;

public class SkiPassForDays extends SkiPass{
    private boolean activated;
    private NumberOfDays NUMBER_OF_DAYS;

    public static SkiPassForDays thisSkiPassForDays = new SkiPassForDays();

    private SkiPassForDays(){
        super();
    }
    public static SkiPassForDays getSkiPassForDays() {
        return thisSkiPassForDays;
    }


    public enum NumberOfDays {
        ONE(1), TWO(2), FIVE(5);
        private int numOfDays;

        NumberOfDays(int numberOfDays) {
            this.numOfDays = numberOfDays;
        }
        public int getNumberOfDays(){
            return numOfDays;
        }
    }

    public SkiPassForDays(int skiPassId, Type type, int term, NumberOfDays numberOfDays) {
        super(skiPassId, type, term);
        this.NUMBER_OF_DAYS = numberOfDays;
    }

    public int getNumberOfDays() {
        return NUMBER_OF_DAYS.getNumberOfDays();
    }

    public boolean isActivated() {
        return activated;
    }

    private void setActivated() {
        this.activated = true;
    }

    private void setNUMBER_OF_DAYS(NumberOfDays NUMBER_OF_DAYS) {
        this.NUMBER_OF_DAYS = NUMBER_OF_DAYS;
    }

}
