package tavonatti.stefano.svgtopngresizer.settingsview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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
        //TODO
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
}
