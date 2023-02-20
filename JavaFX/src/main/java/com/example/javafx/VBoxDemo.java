package com.example.javafx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class VBoxDemo extends Application {
    public void start(Stage stage) throws FileNotFoundException {
        //
        Image image = new Image(new FileInputStream("download.png"));

        //starting image view object
        ImageView imageView = new ImageView(image);

        //create object label
        Label label = new Label("Jaime Rodriguez");

        //creating font object w requested arguments
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20);

        // setting the font to the label
        label.setFont(font);

        //vbox object create
        VBox vbox = new VBox();

        //setup padding for vbox
        vbox.setPadding(new Insets(10,10,10,50));

        //add label and image to the vbox
        vbox.getChildren().addAll(imageView,label);

        //setup scene 400 by 400 dim
        Scene scene = new Scene(vbox, 400, 400);

        //add the title
        stage.setTitle("Supreme Logo By Jaime Rodriguez");

        //setting the scene
        stage.setScene(scene);

        //display
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
