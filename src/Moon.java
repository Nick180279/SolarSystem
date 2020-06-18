public class Moon extends  SpaceObject{
    int moonRadius;

    public Moon(int mass, int radius, String name, int moonRadius) {
        super(mass, radius, name);
        this.moonRadius = moonRadius;
    }
}
