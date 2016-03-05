package tavonatti.stefano.svgtopngresizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

/**
 * Created by stefano on 04/03/16.
 */
public class SvgToPNGController {

    @FXML private TextField inputFileField;
    @FXML private TextField outputDirField;


    @FXML public void handleLoadFileButton(ActionEvent actionEvent) {
        FileChooser fileChooser =new FileChooser();
        fileChooser.setTitle("SVG Input file");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));

        FileChooser.ExtensionFilter extensionFilter=new FileChooser.ExtensionFilter("SVG file (*svg)", "*.svg");
        fileChooser.getExtensionFilters().add(extensionFilter);

        File file=fileChooser.showOpenDialog(new Stage());

        if(file!=null) {
            System.out.println("File: " + file.getAbsolutePath());
            inputFileField.setText(file.getAbsolutePath());
        }
        else
            System.out.println("null file");



        
    }

    @FXML public void handleOutputDirButton(ActionEvent actionEvent) {
        DirectoryChooser directoryChooser=new DirectoryChooser();
        directoryChooser.setTitle("Otput directory");
        directoryChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File outputDirectory=directoryChooser.showDialog(new Stage());

        if(outputDirectory!=null){
            outputDirField.setText(outputDirectory.getAbsolutePath());
        }
    }

    @FXML public void handleSetting(ActionEvent actionEvent) {
    }

    @FXML public void handleConvert(ActionEvent actionEvent) {
        File inputFile=new File(inputFileField.getText());

        if(inputFile!=null){
            if(inputFile.exists()){
                if(inputFile.isFile()){
                    //TODO 
                }
            }
        }

    }
}
