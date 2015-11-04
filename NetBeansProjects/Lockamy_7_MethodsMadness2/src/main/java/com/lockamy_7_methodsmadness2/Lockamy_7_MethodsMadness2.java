package com.lockamy_7_methodsmadness2;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Lockamy_7_MethodsMadness2 extends Application {

   
    
    
    
    
    
    
    
    
    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane(new Label("Hello JavaFX World!"));

        Rectangle2D visualBounds = Screen.getPrimary().getVisualBounds();
        Scene scene = new Scene(root, visualBounds.getWidth(), visualBounds.getHeight());

        stage.getIcons().add(new Image(Lockamy_7_MethodsMadness2.class.getResourceAsStream("/icon.png")));

        stage.setScene(scene);
        stage.show();
    }

}
    public void tart(Stage primaryStage) {
     primaryStage.setTitle("drawing Operations Text");
       Group root = new Group();
       Canvas canvas = new Canvas(300, 250);
       GraphicsContext gc = canvas.getGraphicsContext2D();
       drawName(gc);
       drawHouse(gc);
       root.getChildren().add(canvas);
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
}

        private void drawName9Graphics Context gc) {
}        gc.setStroke(color.GREEN);
            gc.setLineWidth(5);
            gc.strokeLine(80, 70, 50, 70);
            
            
            
