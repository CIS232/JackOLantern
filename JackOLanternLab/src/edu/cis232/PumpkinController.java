package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class PumpkinController {

	Image pumpkinImage = new Image(getClass().getResource("PlainPumpkin.png").toString());
	
    @FXML
    private ImageView pumpkin;

    @FXML
    private Circle leftEye;

    @FXML
    private Circle rightEye;

    @FXML
    private Arc mouth;

    @FXML
    private Label text;
    
    private Paint litup = Color.YELLOW;
    
    public void initialize(){
    	pumpkin.setImage(pumpkinImage);
    }

    @FXML
    void lightUpListener(MouseEvent event) {
    	Shape shape = (Shape)event.getTarget();
    	shape.setFill(litup);
    	if(leftEye.getFill().equals(litup) && rightEye.getFill().equals(litup) && mouth.getFill().equals(litup)){
    		text.setVisible(true);
    	}
    	
    }

}
