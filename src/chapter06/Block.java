package chapter06;

/**
 * Simple class to illustrate passing objects to methods.
 */
public class Block {
    private int width;
    private int height;
    private int depth;
    private int volume;

    public Block(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        volume = width * height * depth;
    }
    // methods take a Block object as input and compare this Block's properties to the input Block's:
    public boolean isSameBlock(Block input) {
        return input.width == width & input.height == height & input.depth == depth;
    }
    public boolean hasSameVolume(Block input) {
        return input.volume == volume;
    }
    // if one of the dimensions of the Block changes, its volume must change accordingly.
    private void resetVolume() {
        volume = width * height * depth;
    }
    // getters
    public int getVolume() { return volume; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getDepth() { return depth; }
    // setters
    public void setWidth(int newWidth) {
        width = newWidth;
        resetVolume();
    }
    public void setHeight(int newHeight) {
        height = newHeight;
        resetVolume();
    }
    public void setDepth(int newDepth) {
        depth = newDepth;
        resetVolume();
    }

}
