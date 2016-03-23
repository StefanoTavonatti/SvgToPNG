package tavonatti.stefano.svgtopngresizer.settingsview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tavonatti.stefano.svgtopngresizer.svgUtilities.SvgUtilities;

/**
 * Created by stefano on 12/03/16.
 */
public class SettingController {
    @FXML private CheckBox lockWidth;
    @FXML private CheckBox lockHeight;
    @FXML private TextField mdpiW,mdpiH;
    @FXML private TextField hdpiW,hdpiH;
    @FXML private TextField xhdpiW,xhdpiH;
    @FXML private TextField xxhdpiW,xxhdpiH;
    @FXML private TextField xxxhdpiW,xxxhdpiH;
    private SvgUtilities svgUtilities=new SvgUtilities();

    public SettingController(){

    }

    @FXML public void handleLockWidthClick(ActionEvent actionEvent){
        lockHeight.setSelected(false);
        setWidthFieldEnabled(!lockWidth.isSelected());
        setHeightEnabled(!lockHeight.isSelected());
    }

    @FXML public void handleLockHeightClick(ActionEvent actionEvent){
        lockWidth.setSelected(false);
        setHeightEnabled(!lockHeight.isSelected());
        setWidthFieldEnabled(!lockWidth.isSelected());
    }

    @FXML public void handleOKClick(ActionEvent actionEvent){
        boolean error=false;

        try {
            svgUtilities.setMdpiW(Integer.parseInt(mdpiW.getText()));
            svgUtilities.setMdpiH(Integer.parseInt(mdpiH.getText()));
            svgUtilities.setHdpiW(Integer.parseInt(hdpiW.getText()));
            svgUtilities.setHdpiH(Integer.parseInt(hdpiH.getText()));
            svgUtilities.setXhdpiW(Integer.parseInt(xhdpiW.getText()));
            svgUtilities.setXhdpiH(Integer.parseInt(xhdpiH.getText()));
            svgUtilities.setXxhdpiW(Integer.parseInt(xxhdpiW.getText()));
            svgUtilities.setXxhdpiH(Integer.parseInt(xxhdpiH.getText()));
            svgUtilities.setXxxhdpiW(Integer.parseInt(xxxhdpiW.getText()));
            svgUtilities.setXxxhdpiH(Integer.parseInt(xxxhdpiH.getText()));
        }catch (Exception e){
            error=true;
            showErrorAlert("Integer parse error");
        }

        if(!error){
            Button button= (Button) actionEvent.getSource();
            ((Stage)button.getScene().getWindow()).close();
        }

    }

    @FXML public void handleCancelClick(ActionEvent actionEvent){
        Button button= (Button) actionEvent.getSource();
        ((Stage)button.getScene().getWindow()).close();
    }

    private void setWidthFieldEnabled(boolean val){
        mdpiW.setDisable(!val);
        hdpiW.setDisable(!val);
        xhdpiW.setDisable(!val);
        xxhdpiW.setDisable(!val);
        xxxhdpiW.setDisable(!val);
        svgUtilities.setWidthLocked(!val);
    }

    private  void setHeightEnabled(boolean val){
        mdpiH.setDisable(!val);
        hdpiH.setDisable(!val);
        xhdpiH.setDisable(!val);
        xxhdpiH.setDisable(!val);
        xxxhdpiH.setDisable(!val);
        svgUtilities.setHeightLocked(!val);
    }

    public SvgUtilities getSvgUtilities() {
        return svgUtilities;
    }

    public void setSvgUtilities(SvgUtilities svgUtilities) {
        this.svgUtilities = svgUtilities;
    }

    private void showErrorAlert(String error) {
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle(error);
        alert.setContentText(error);
        alert.show();
    }

    public void configure(){
        mdpiW.textProperty().addListener(new MyChangeListener(mdpiW));
        mdpiH.textProperty().addListener(new MyChangeListener(mdpiH));
        hdpiW.textProperty().addListener(new MyChangeListener(hdpiW));
        hdpiH.textProperty().addListener(new MyChangeListener(hdpiH));
        xhdpiW.textProperty().addListener(new MyChangeListener(xhdpiW));
        xhdpiH.textProperty().addListener(new MyChangeListener(xhdpiH));
        xxhdpiW.textProperty().addListener(new MyChangeListener(xxhdpiW));
        xxhdpiH.textProperty().addListener(new MyChangeListener(xxhdpiH));
        xxxhdpiW.textProperty().addListener(new MyChangeListener(xxxhdpiW));
        xxxhdpiH.textProperty().addListener(new MyChangeListener(xxxhdpiH));

        loadDefaultValue();
    }

    private void loadDefaultValue(){
        mdpiW.setText(""+SvgUtilities.DEFAULT_MDPI);
        mdpiH.setText(""+SvgUtilities.DEFAULT_MDPI);
        hdpiW.setText(""+SvgUtilities.DEFAULT_HDPI);
        hdpiH.setText(""+SvgUtilities.DEFAULT_HDPI);
        xhdpiW.setText(""+SvgUtilities.DEFAULT_XHDPI);
        xhdpiH.setText(""+SvgUtilities.DEFAULT_XHDPI);
        xxhdpiW.setText(""+SvgUtilities.DEFAULT_XXHDPI);
        xxhdpiH.setText(""+SvgUtilities.DEFAULT_XXHDPI);
        xxxhdpiW.setText(""+SvgUtilities.DEFAULT_XXXHDPI);
        xxxhdpiH.setText(""+SvgUtilities.DEFAULT_XXXHDPI);
    }

}
