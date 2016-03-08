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
}
