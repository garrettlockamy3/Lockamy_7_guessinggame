package com.lockamy_7_guessinggame;

import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Lockamy_7_GuessingGame extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hello JavaFX World!"));

        
        
        
        
public static void main(String[] args) {     
     Scanner name = new Scanner(System.in);
     Scanner guess = new Scanner(System.in);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());

        stage.getIcons().add(new Image(Lockamy_7_GuessingGame.class.getResourceAsStream("/icon.png")));

        stage.setScene(scene);
        stage.show();
    }

    private void Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
