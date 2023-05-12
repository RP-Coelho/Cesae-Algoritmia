package bikeStore;

public class Bicycle {
    private int id, numberOfGears;
    private String mainColor;
    private float weelSize, bikeLength, price;
    private boolean adjustableSeatPost;

    public Bicycle(int id, int numberOfGears, String mainColor, float weelSize, float bikeLength, float price, boolean adjustableSeatPost) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.weelSize = weelSize;
        this.bikeLength = bikeLength;
        this.price = price;
        this.adjustableSeatPost = adjustableSeatPost;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public float getWeelSize() {
        return weelSize;
    }

    public void setWeelSize(float weelSize) {
        this.weelSize = weelSize;
    }

    public float getBikeLength() {
        return bikeLength;
    }

    public void setBikeLength(float bikeLength) {
        this.bikeLength = bikeLength;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAdjustableSeatPost() {
        return adjustableSeatPost;
    }

    public void setAdjustableSeatPost(boolean adjustableSeatPost) {
        this.adjustableSeatPost = adjustableSeatPost;
    }
}
