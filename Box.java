public class Box {
    private float width;

    public Box(float width) {
        this.width = width;
    }
    //getter
    public float getWidth() {
        return width;
    }
    //setter
    public void setWidth(float width) {
        this.width = width;
    }

    public static void main(String[] args) {
        // Create a new instance of the Box class
        Box box = new Box(8.0f);

        // Get the initial width 
        float initialWidth = box.getWidth();
        System.out.println("Initial Width: " + initialWidth);

        // Update the width to a new value
        box.setWidth(10.5f);

        // Get the updated width 
        float updatedWidth = box.getWidth();
        System.out.println("Updated Width: " + updatedWidth);
    }
}

