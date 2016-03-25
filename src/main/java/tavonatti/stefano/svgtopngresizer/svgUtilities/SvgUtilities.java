package tavonatti.stefano.svgtopngresizer.svgUtilities;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by stefano on 08/03/16.
 */
public class SvgUtilities {
    private boolean heightLocked;
    private boolean widthLocked;
    private int mdpiW=DEFAULT_MDPI;
    private int mdpiH=DEFAULT_MDPI;
    private int hdpiW=DEFAULT_HDPI;
    private int hdpiH=DEFAULT_HDPI;
    private int xhdpiW=DEFAULT_XHDPI;
    private int xhdpiH=DEFAULT_XHDPI;
    private int xxhdpiW=DEFAULT_XXHDPI;
    private int xxhdpiH=DEFAULT_XXHDPI;
    private int xxxhdpiW=DEFAULT_XXXHDPI;
    private int xxxhdpiH=DEFAULT_XXXHDPI;

    private String outputName=DRAWABLE;

    public static final int DEFAULT_MDPI=48;
    public static final int DEFAULT_HDPI=72;
    public static final int DEFAULT_XHDPI=96;
    public static final int DEFAULT_XXHDPI=144;
    public static final int DEFAULT_XXXHDPI=192;
    public static final String DRAWABLE="drawable";
    public static final String MIPMAP="mipmap";

    public static void SvgToPNG(File inputFile,File outputFile) throws IOException, TranscoderException {

        PNGTranscoder pngTranscoder=new PNGTranscoder();

        // Create the transcoder input.
        FileInputStream fis=new FileInputStream(inputFile);
        TranscoderInput input = new TranscoderInput(fis);

        // Create the transcoder output.
        OutputStream ostream = new FileOutputStream(outputFile);
        TranscoderOutput output = new TranscoderOutput(ostream);

        //pngTranscoder.addTranscodingHint( PNGTranscoder.KEY_WIDTH, new Float( 50 ) );
        //pngTranscoder.addTranscodingHint( PNGTranscoder.KEY_HEIGHT, new Float( 50 ) );

        // Save the image.
        pngTranscoder.transcode(input, output);

        // Flush and close the stream.
        ostream.flush();
        ostream.close();

        System.out.println("Conversion complete");
    }

    public static void SvgToPNG(File inputFile,File outputFile,int width,int height) throws IOException, TranscoderException {

        PNGTranscoder pngTranscoder=new PNGTranscoder();

        // Create the transcoder input.
        FileInputStream fis=new FileInputStream(inputFile);
        TranscoderInput input = new TranscoderInput(fis);

        // Create the transcoder output.
        OutputStream ostream = new FileOutputStream(outputFile);
        TranscoderOutput output = new TranscoderOutput(ostream);

        pngTranscoder.addTranscodingHint( PNGTranscoder.KEY_WIDTH, new Float( width ) );
        pngTranscoder.addTranscodingHint( PNGTranscoder.KEY_HEIGHT, new Float( height ) );

        // Save the image.
        pngTranscoder.transcode(input, output);

        // Flush and close the stream.
        ostream.flush();
        ostream.close();

        System.out.println("Conversion complete");
    }

    public boolean transcodeAll(File outputDir){

        if(!outputDir.exists())
            return false;

        if(!outputDir.isDirectory()){
            return false;
        }

        ArrayList<File> folders=new ArrayList<File>();

        File outputMdpi=new File(outputDir.getAbsolutePath()+"/"+outputName+"-mdpi");
        folders.add(outputMdpi);

        File outputHdpi=new File(outputDir.getAbsolutePath()+"/"+outputName+"-hdpi");
        folders.add(outputHdpi);

        File outputXhdpi=new File(outputDir.getAbsolutePath()+"/"+outputName+"-xhdpi");
        folders.add(outputXhdpi);

        File outputXxhdpi=new File(outputDir.getAbsolutePath()+"/"+outputName+"-xxhdpi");
        folders.add(outputXxhdpi);

        File outputXxxhdpi=new File(outputDir.getAbsolutePath()+"/"+outputName+"-xxxhdpi");
        folders.add(outputXxxhdpi);

        Iterator<File> iterator=folders.iterator();

        while (iterator.hasNext()){
            File temp=iterator.next();

            if(!temp.exists()){
                boolean result=temp.mkdirs();
                if (!result)
                    return false;
            }else {
                if(temp.isFile())
                    return false;
            }
        }

        return true;
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

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }
}
