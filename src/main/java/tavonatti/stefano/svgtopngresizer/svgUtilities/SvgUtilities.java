package tavonatti.stefano.svgtopngresizer.svgUtilities;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;

import java.io.*;

/**
 * Created by stefano on 08/03/16.
 */
public class SvgUtilities {
    private boolean heightLocked;
    private boolean widthLocked;
    private int mdpiW;
    private int mdpiH;
    private int hdpiW;
    private int hdpiH;
    private int xhdpiW;
    private int xhdpiH;
    private int xxhdpiW;
    private int xxhdpiH;
    private int xxxhdpiW;
    private int xxxhdpiH;

    public static final int DEFAULT_MDPI=48;
    public static final int DEFAULT_HDPI=72;
    public static final int DEFAULT_XHDPI=96;
    public static final int DEFAULT_XXHDPI=144;
    public static final int DEFAULT_XXXHDPI=192;

    public static void SvgToPNG(File inputFile,File outputFile) throws IOException, TranscoderException {

        PNGTranscoder pngTranscoder=new PNGTranscoder();

        // Create the transcoder input.
        FileInputStream fis=new FileInputStream(inputFile);
        TranscoderInput input = new TranscoderInput(fis);

        // Create the transcoder output.
        OutputStream ostream = new FileOutputStream(outputFile);
        TranscoderOutput output = new TranscoderOutput(ostream);

        // Save the image.
        pngTranscoder.transcode(input, output);

        // Flush and close the stream.
        ostream.flush();
        ostream.close();
    }

    public boolean isHeightLocked() {
        return heightLocked;
    }

    public void setHeightLocked(boolean heightLocked) {
        this.heightLocked = heightLocked;
    }

    public boolean isWidthLocked() {
        return widthLocked;
    }

    public void setWidthLocked(boolean widthLocked) {
        this.widthLocked = widthLocked;
    }

    public int getMdpiW() {
        return mdpiW;
    }

    public void setMdpiW(int mdpiW) {
        this.mdpiW = mdpiW;
    }

    public int getMdpiH() {
        return mdpiH;
    }

    public void setMdpiH(int mdpiH) {
        this.mdpiH = mdpiH;
    }

    public int getHdpiW() {
        return hdpiW;
    }

    public void setHdpiW(int hdpiW) {
        this.hdpiW = hdpiW;
    }

    public int getHdpiH() {
        return hdpiH;
    }

    public void setHdpiH(int hdpiH) {
        this.hdpiH = hdpiH;
    }

    public int getXhdpiW() {
        return xhdpiW;
    }

    public void setXhdpiW(int xhdpiW) {
        this.xhdpiW = xhdpiW;
    }

    public int getXhdpiH() {
        return xhdpiH;
    }

    public void setXhdpiH(int xhdpiH) {
        this.xhdpiH = xhdpiH;
    }

    public int getXxhdpiW() {
        return xxhdpiW;
    }

    public void setXxhdpiW(int xxhdpiW) {
        this.xxhdpiW = xxhdpiW;
    }

    public int getXxhdpiH() {
        return xxhdpiH;
    }

    public void setXxhdpiH(int xxhdpiH) {
        this.xxhdpiH = xxhdpiH;
    }

    public int getXxxhdpiW() {
        return xxxhdpiW;
    }

    public void setXxxhdpiW(int xxxhdpiW) {
        this.xxxhdpiW = xxxhdpiW;
    }

    public int getXxxhdpiH() {
        return xxxhdpiH;
    }

    public void setXxxhdpiH(int xxxhdpiH) {
        this.xxxhdpiH = xxxhdpiH;
    }
}
