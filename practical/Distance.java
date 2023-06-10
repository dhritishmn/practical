public class Distance {
    private int feet;
    private int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void displayDistance() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    public void addDistance(Distance distance) {
        this.feet += distance.feet;
        this.inches += distance.inches;

        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(5, 10);
        Distance d2 = new Distance(3, 8);

        d1.displayDistance();
        d2.displayDistance();

        d1.addDistance(d2);
        d1.displayDistance();
    }
}

