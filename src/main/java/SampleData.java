public class SampleData {

      private String dateFormatted;
      private int temperatureC;
      private String summary;
      private int temperatureF;

    public SampleData(String dateFormatted, int temperatureC, String summary, int temperatureF) {
        this.dateFormatted = dateFormatted;
        this.temperatureC = temperatureC;
        this.summary = summary;
        this.temperatureF = temperatureF;
    }

    public String getDateFormatted() {
        return dateFormatted;
    }

    public void setDateFormatted(String dateFormatted) {
        this.dateFormatted = dateFormatted;
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getTemperatureF() {
        return temperatureF;
    }

    public void setTemperatureF(int temperatureF) {
        this.temperatureF = temperatureF;
    }

    @Override
    public String toString() {
        return "SampleData{" +
                "dateFormatted='" + dateFormatted + '\'' +
                ", temperatureC=" + temperatureC +
                ", summary='" + summary + '\'' +
                ", temperatureF=" + temperatureF +
                '}';
    }
}
