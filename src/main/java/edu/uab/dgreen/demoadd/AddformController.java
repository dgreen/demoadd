

package edu.uab.dgreen.demoadd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author David Green <DGreen@uab.edu>
 */
public class AddformController implements Initializable {

	@FXML private TextField aTextField;
	@FXML private TextField bTextField;
	@FXML private TextField cTextField;

  /** Initializes the controller class. */
  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }

	@FXML public void addButtonClick() {

		int a = Integer.valueOf(aTextField.getText());
		int b = Integer.valueOf(bTextField.getText());

		cTextField.setText("" + (a + b));

	}
}
