package com.lockamy_7_method_madness;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Lockamy_7_method_madness extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hello JavaFX World!"));

        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());

        stage.getIcons().add(new Image(Lockamy_7_method_madness.class.getResourceAsStream("/icon.png")));

        stage.setScene(scene);
        stage.show();
    }

}
