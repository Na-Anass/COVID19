package ma.ac.usmba.fpt.sim.covid19stats;

public class Advice {
    private static final int NO_IMAGE_PROVIDED = -1 ;
    /** Image resource ID for the advice */
    private int imageResourceId = NO_IMAGE_PROVIDED;
    /** the sentence of advice */
    private String adviceWords;

    public Advice(int imageResourceId, String adviceWords) {
        this.imageResourceId = imageResourceId;
        this.adviceWords = adviceWords;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getAdviceWords() {
        return adviceWords;
    }

    public void setAdviceWords(String adviceWords) {
        this.adviceWords = adviceWords;
    }
}
