package tavonatti.stefano.svgtopngresizer.settingsview;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

/**
 * Created by stefano on 23/03/16.
 */
public class MyChangeListener implements ChangeListener<String> {

    private TextField textField;

    public MyChangeListener(TextField textField){
        this.textField=textField;
    }

    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        if(!newValue.matches("[0-9]*")){
            textField.setText(oldValue);
        }else {

        }
    }
}
