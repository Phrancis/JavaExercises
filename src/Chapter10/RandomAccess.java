package chapter10;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * The data in a file can also be accessed in random order, along with sequentially (advancing one character at a time).
 */
public class RandomAccess {
    private String filePath;

    public RandomAccess(String filePath) {
        this.filePath = filePath;
    }
    public String getFilePath() { return filePath; }
    public void setFilePath(String newFilePath) { this.filePath = newFilePath; }
    /**
     * Write an array of doubles to the file.
     * @param doubles the array to write to the file
     */
    public void writeDoubles(double[] doubles) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            for(double val : doubles) {
                randomAccessFile.writeDouble(val);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Read a double from the file at the specified index (every 8 bytes).
     * @param index the index of the double to read
     * @return the double that is read
     */
    public double readDoubleAt(long index) {
        double result = -1;
        long byteToRead = index * 8;
        try(RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw")) {
            randomAccessFile.seek(byteToRead);
            result = randomAccessFile.readDouble();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    // DEMO
    public static void main(String[] args) {
        String filePath = "/Users/francisveilleux-gaboury/Documents/random.txt";
        double[] nums = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
        RandomAccess ra = new RandomAccess(filePath);
        ra.writeDoubles(nums);
        for(int i = 0; i < 6; i++) {
            System.out.println(ra.readDoubleAt(i));
        }
    }
}
