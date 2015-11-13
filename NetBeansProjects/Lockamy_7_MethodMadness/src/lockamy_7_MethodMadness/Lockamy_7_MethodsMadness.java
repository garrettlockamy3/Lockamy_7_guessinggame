package lockamy_7_MethodMadness;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Lockamy_7_MethodsMadness extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Yoshi's Egg");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 350);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawBody(gc);
        drawFeet(gc);
        drawDot(gc);
        drawStem(gc);
        drawGarrettL(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawBody(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.setStroke(Color.BLACK);
        gc.fillOval(80, 90, 180, 235);
        gc.strokeOval(80, 90, 180, 235);
     
    }
    
    private void drawFeet(GraphicsContext gc) {
       gc.setFill(Color.GREEN);
       gc.setStroke(Color.YELLOW);
       gc.strokeOval(100, 110, 70, 90);
       gc.fillOval(100, 110, 70, 90);
    }
    
    private void drawStem(GraphicsContext gc) {
       gc.setFill(Color.GREEN);
       gc.setStroke(Color.YELLOW);
       gc.strokeOval(173, 115, 75, 100);
       gc.fillOval(173, 115, 75, 100);

}
private void drawDot(GraphicsContext gc) {
       gc.setFill(Color.GREEN);
       gc.setStroke(Color.YELLOW);
       gc.strokeOval(105, 225, 130, 100);
       gc.fillOval(105, 225, 130, 100);
}

private void drawGarrettL(GraphicsContext gc) {
    gc.setStroke(Color.BLACK);
    gc.strokeText("Garrett Lockamy", 10, 25, 125);
    
}
}