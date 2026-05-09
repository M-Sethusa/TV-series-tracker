public class Series {

    // Declaration
    public String seriesID, seriesName, seriesNumOfEps, seriesAge;

    // Constructor
    public Series(String seriesID, String seriesName, String seriesNumOfEps, String seriesAge) {
        this.seriesID = seriesID;
        this.seriesName = seriesName;
        this.seriesNumOfEps = seriesNumOfEps;
        this.seriesAge = seriesAge;
    }

    // Setters
    public void setSeriesID(String seriesID) {
        this.seriesID = seriesID;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public void setSeriesNumOfEps(String seriesNumOfEps) {
        this.seriesNumOfEps = seriesNumOfEps;
    }

    public void setSeriesAge(String seriesAge) {
        this.seriesAge = seriesAge;
    }

    // Getters
    public String getSeriesID() {
        return seriesID;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public String getSeriesNumOfEps() {
        return seriesNumOfEps;
    }

    public String getSeriesAge() {
        return seriesAge;
    }
}
