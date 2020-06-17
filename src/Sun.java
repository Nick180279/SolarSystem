public class Sun extends SpaceObject{
    String type;
    double psyRadiation;

    public Sun(int mass, int radius, String name, String type, double psyRadiation) {
        super(mass, radius, name);
        this.type = type;
        this.psyRadiation = psyRadiation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPsyRadiation() {
        return psyRadiation;
    }

    public void setPsyRadiation(double psyRadiation) {
        this.psyRadiation = psyRadiation;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t Type is : " + this.type + "\n\t Psy radiation is : " + this.psyRadiation;
    }
}
