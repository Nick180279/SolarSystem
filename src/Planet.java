public class Planet extends  SpaceObject{
    int planetRadius;

    public Planet(int mass, int radius, String name, int planetRadius) {
        super(mass, radius, name);
        this.planetRadius = planetRadius;
    }

    @Override
    public String toString(){
        return super.toString() + "\n\tOrbit radius : " + this.planetRadius;
    }


}
