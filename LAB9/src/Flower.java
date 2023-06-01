public class Flower extends Plant {

    private boolean hasSmell;
    private boolean hasThorn;

    Flower (String name, String color, boolean hasSmell, boolean hasThorn) {

        super.setName(name);
        super.setColor(color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }

    public boolean getHasSmell() {

        return hasSmell;
    }

    public boolean getHasThorn() {

        return hasThorn;
    }

    public void setHasSmell(boolean hasSmell) {

        this.hasSmell = hasSmell;
    }

    public void setHasThorn(boolean hasThorn) {

        this.hasThorn = hasThorn;
    }

    public String toString() {

        if (hasSmell==true && hasThorn==true) {

            return super.toString() + ", and it has smell, and thorns";
        }
        else if (hasSmell==true && hasThorn==false) {

            return super.toString() + ", and it has smell, but no thorns";
        }
        else if (hasSmell==false && hasThorn==true) {

            return super.toString() + ", and it has no smell, but it does have thorns";
        }
        else {

            return super.toString() + ", and it has no smell and no thorns";
        }

    }

    
    
}
