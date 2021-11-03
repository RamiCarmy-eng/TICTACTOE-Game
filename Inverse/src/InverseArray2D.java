import java.awt.*;

public class InverseArray2D {
    /**
     * InverseArray2D class of the Java program.
     *
     */

    public static void main(String[] args) {
        //the Image.loadImage() function in just for initializing the 2D pixels array.
        char[][]  pixels = Image.loadImage();

        //write you answer here to "inverse" the picture
        for(int row=0; row<pixels.length; row++){
            for(int col=0; col<pixels[row].length; col++){
                if (pixels[row][col] == '-'){
                    pixels[row][col] = '*';
                }else if(pixels[row][col] == '*'){
                    pixels[row][col] = '-';
                }else{
                    continue;
                }
            }
        }

            //this function get the 2D-array and print it to the screen.
            // pay attention, if you run the code without any changes,
            // the image will printe to screen with "black" background
            Image.printImage(pixels);
        }
    }

}
