package tavonatti.stefano.svgtopngresizer.settingsview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

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

    private void setWidthFieldEnabled(boolean val){
        mdpiW.setDisable(!val);
        hdpiW.setDisable(!val);
        xhdpiW.setDisable(!val);
        xxhdpiW.setDisable(!val);
        xxxhdpiW.setDisable(!val);
    }

    private  void setHeightEnabled(boolean val){
        mdpiH.setDisable(!val);
        hdpiH.setDisable(!val);
        xhdpiH.setDisable(!val);
        xxhdpiH.setDisable(!val);
        xxxhdpiH.setDisable(!val);
    }
}
