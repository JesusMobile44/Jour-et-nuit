import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    public static void main(String[] args) { launch(args); }

    public void start(Stage primaryStage){
        primaryStage.setWidth(800);
        primaryStage.setHeight(400);
        primaryStage.setTitle("I can be your ANGLE or your DEMON ;3");
        primaryStage.setResizable(false);

        Rectangle jour = new Rectangle(0,0,400,400);
        Rectangle nuit = new Rectangle(400,0,400,400);

        jour.setFill(Color.LIGHTGREY);
        nuit.setFill(Color.BLACK);

        Rectangle mur1 = new Rectangle(150,200,100,70);
        Polygon toit1 = new Polygon(140,200, 200,150, 260,200);
        Rectangle mur2 = new Rectangle(550,200,100,70);
        Polygon toit2 = new Polygon(540,200, 600,150, 660,200);

        DropShadow dropShadow = new DropShadow(20,-10,10,Color.GREY);
        mur1.setFill(Color.WHITE);
        mur1.setEffect(dropShadow);
        toit1.setFill(Color.BROWN);
        mur2.setFill(Color.WHITE);
        toit2.setFill(Color.BROWN);

        Group back = new Group(jour,nuit);
        Group maison = new Group(mur1,toit1,mur2,toit2);
        Group root = new Group(back,maison);

        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }
}
