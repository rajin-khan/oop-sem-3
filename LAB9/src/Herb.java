public class Herb extends Plant {

    private boolean isMedicinal;
    private String season;

    Herb(String name, String color, boolean isMedicinal, String season) {

        super.setName(name);
        super.setColor(color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }

    public boolean getIsMedicinal() {

        return isMedicinal;
    }

    public String getSeason() {

        return season;
    }

    public void setIsMedicinal(boolean isMedicinal) {

        this.isMedicinal = isMedicinal;
    }

    public void setSeason(String season) {

        this.season = season;
    }

    public String toString() {

        if (isMedicinal==true) {

            return super.toString() + ". It is medicinal, and is found in the "+getSeason()+" season.";
        }
        else {

            return super.toString() + ". It is not medicinal, and is found in the "+getSeason()+" season.";

        }

    }
    
}
