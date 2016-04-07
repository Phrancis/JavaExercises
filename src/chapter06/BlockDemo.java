package chapter06;

/**
 * Demonstrate the use of Block and passing objects to methods.
 */
public class BlockDemo {
    public static void main(String[] args) {
        Block block1 = new Block(3,4,5);
        System.out.printf("block1 volume: %d%n", block1.getVolume());
        Block block2 = new Block(4,5,3);
        System.out.printf("block2 volume: %d%n", block2.getVolume());
        System.out.println("block1 is same as block2? " + block1.isSameBlock(block2));
        System.out.println("block1 has same volume as block2? " + block1.hasSameVolume(block2));
        //
        block1.setWidth(4);
        block1.setHeight(2);
        block1.setDepth(6);
        System.out.printf("block1 new width %d, new height %d, new depth %d and new volume is %d%n",
                block1.getWidth(), block1.getHeight(), block1.getDepth(), block1.getVolume());
        System.out.println("block1 is same as block2? " + block1.isSameBlock(block2));
        System.out.println("block1 has same volume as block2? " + block1.hasSameVolume(block2));
        Block block3 = new Block(4, 2, 6);
        System.out.println("block1 is same as block3? " + block1.isSameBlock(block3));
        System.out.println("block1 has same volume as block3? " + block1.hasSameVolume(block3));
    }
}
