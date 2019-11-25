public class Choice {
    private String choice;

    public Choice(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "choice='" + choice + '\'' +
                '}';
    }
}
