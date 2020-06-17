public abstract class SpaceObject {
    int mass;
    int radius;
    String name;

    public SpaceObject(int mass, int radius, String name) {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Worksheet for " + this.name + " :" + "\n\t----------------------" +"\n\t Mass is : " + this.mass + "\n\t Radius is : " + this.radius;
    }
}
