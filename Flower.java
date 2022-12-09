public class Flower {
   private String flowerColor;
   private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        if (this.flowerColor == null|| this.flowerColor.isEmpty() ) {
            this.flowerColor = "Белый";
        }

        this.country = country;
        if (this.country == null|| this.country.isEmpty() ) {
            this.country = "Россия";
        }
        this.cost = cost;
        if (cost<=0) {
            this.cost = 1;
        }
        this.lifeSpan = 3;

    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

}
