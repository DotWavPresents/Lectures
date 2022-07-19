package Examples.ProgrammingParadigms.CakeExample;

public class Mold {
    private String mixture;
    private boolean isHot;

    public String getMixture() {
        return mixture;
    }

    public void setMixture(String mixture) {
        this.mixture = mixture;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    @Override
    public String toString() {
        return "(" +
                "mixture='" + mixture + '\'' +
                ", isHot=" + isHot +
                ')';
    }
}
