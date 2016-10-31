package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class PumpkinController {

	Image pumpkin = new Image(getClass().getResource("pumpkin.jpg").toString());
	
	@FXML
	private ImageView pumpkinBG;
	
    @FXML
    private Circle leftEye;

    @FXML
    private Arc mouth;

    @FXML
    private Circle rightEye;

    @FXML
    private Label txtHappyHalloween;
    
    public void initialize(){
    	pumpkinBG.setImage(pumpkin);
    }
    
    boolean leftLit = false;
    boolean rightLit = false;
    boolean mouthLit = false;
    Paint litPaint = Color.LIGHTYELLOW;

    @FXML
    void leftEyeClickedListener() {
    	leftLit = true;
    	leftEye.setFill(litPaint);
    	showMessage();
    }

    @FXML
    void mouthClickedListener() {
    	mouthLit = true;
    	mouth.setFill(litPaint);
    	showMessage();
    }

    @FXML
    void rightEyeClickedListener() {
    	rightLit = true;
    	rightEye.setFill(litPaint);
    	showMessage();
    }
    
    void showMessage(){
    	if(leftLit && rightLit && mouthLit){
    		txtHappyHalloween.setVisible(true);
    	}
    }

}
