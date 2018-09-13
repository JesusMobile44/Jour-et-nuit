import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


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

        Rectangle mur1 = new Rectangle(150,220,100,60);
        Polygon toit1 = new Polygon(140,220, 200,170, 260,220);
        Rectangle mur2 = new Rectangle(550,220,100,60);
        Polygon toit2 = new Polygon(540,220, 600,170, 660,220);
        Text jourText = new Text("Jour");
        Text nuitText = new Text("Nuit");

        DropShadow dropShadow = new DropShadow(20,-10,10,Color.GREY);
        mur1.setFill(Color.WHITE);
        mur1.setEffect(dropShadow);
        toit1.setFill(Color.BROWN);
        toit1.setEffect(dropShadow);
        mur2.setFill(Color.WHITE);
        toit2.setFill(Color.BROWN);
        jourText.setTranslateX(180);
        jourText.setTranslateY(320);
        jourText.setScaleX(4);
        jourText.setScaleY(4);
        nuitText.setTranslateX(580);
        nuitText.setTranslateY(320);
        nuitText.setScaleX(4);
        nuitText.setScaleY(4);
        nuitText.setFill(Color.WHITE);

        Rectangle window1 = new Rectangle(200,230,34,20);
        Rectangle window2 = new Rectangle(600,230,34,20);
        Line barreveti = new Line(217,230,217,250);
        Line barrevet2 = new Line(617,230,617,250);
        Line barrehor1 = new Line(200,240,234,240);
        Line barrehor2 = new Line(600,240,634,240);

        window1.setFill(Color.AQUA);
        window1.setStroke(Color.BROWN);
        window2.setFill(Color.AQUA);
        window2.setStroke(Color.BROWN);
        barreveti.setStroke(Color.BROWN);
        barrevet2.setStroke(Color.BROWN);
        barrehor1.setStroke(Color.BROWN);
        barrehor2.setStroke(Color.BROWN);

        Rectangle porte1 = new Rectangle(170,245,20,35);
        Rectangle porte2 = new Rectangle(570,245,20,35);
        Circle knob1 = new Circle(185,260,4,Color.YELLOWGREEN);
        Circle knob2 = new Circle(585,260,4,Color.YELLOWGREEN);

        porte1.setFill(Color.SADDLEBROWN);
        porte2.setFill(Color.SADDLEBROWN);

        QuadCurve aileG1 = new QuadCurve(30,120,50,80,70,130);
        aileG1.setStrokeWidth(2);
        aileG1.setStroke(Color.BLACK);
        aileG1.setFill(Color.WHITE);
        QuadCurve aileD1 = new QuadCurve(70,130,90,80,110,120);
        aileD1.setStrokeWidth(2);
        aileD1.setStroke(Color.BLACK);
        aileD1.setFill(Color.WHITE);
        QuadCurve aileG2 = new QuadCurve(150,60,170,20,190,70);
        aileG2.setStrokeWidth(2);
        aileG2.setStroke(Color.BLACK);
        aileG2.setFill(Color.WHITE);
        QuadCurve aileD2 = new QuadCurve(190,70,210,20,230,60);
        aileD2.setStrokeWidth(2);
        aileD2.setStroke(Color.BLACK);
        aileD2.setFill(Color.WHITE);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        KeyValue dsf = new KeyValue(aileD1.startXProperty(),54,Interpolator.LINEAR);
        KeyValue dsdgh = new KeyValue(aileD1.startXProperty(),55,Interpolator.LINEAR);
        KeyFrame gfd = new KeyFrame(Duration.seconds(1),dsf,dsdgh);

        timeline.getKeyFrames().addAll(gfd);
        timeline.play();

        Group ailes = new Group(aileG1,aileD1,aileG2,aileD2);

        Circle luneCercle = new Circle(725,75,30,Color.LIGHTGRAY);

        Stop[] stop = new Stop[]{
                new Stop(0,Color.LIGHTGRAY),
                new Stop(1,Color.BLACK)
        };
        LinearGradient gradient = new LinearGradient(
                0,0,
                1,1,
                true,
                CycleMethod.NO_CYCLE,
                stop);
        luneCercle.setFill(gradient);

        Circle soleilCercle = new Circle(325,75,30,Color.YELLOW);
        Line rayon1 = new Line(260,75,390,75);
        rayon1.setStroke(Color.YELLOW);
        Line rayon2 = new Line(325,10,325,140);
        rayon2.setStroke(Color.YELLOW);
        Line rayon3 = new Line(275,25,375,125);
        rayon3.setStroke(Color.YELLOW);
        Line rayon4 = new Line(275,125,375,25);
        rayon4.setStroke(Color.YELLOW);
        soleilCercle.setStroke(Color.LIGHTGREY);
        soleilCercle.setStrokeWidth(5);

        FillTransition transSoleil = new FillTransition(
                Duration.seconds(2),soleilCercle
        );
        transSoleil.setToValue(Color.ORANGE);
        transSoleil.setCycleCount(Timeline.INDEFINITE);
        transSoleil.setAutoReverse(true);
        transSoleil.play();

        Group soleil = new Group(rayon1,rayon2,rayon3,rayon4,soleilCercle);

        RotateTransition rotateSoleil = new RotateTransition(
                Duration.seconds(5),soleil
        );
        rotateSoleil.setInterpolator(Interpolator.LINEAR);
        rotateSoleil.setByAngle(360);
        rotateSoleil.setCycleCount(Timeline.INDEFINITE);
        rotateSoleil.setAutoReverse(false);
        rotateSoleil.play();

        Group back = new Group(jour,nuit,jourText,nuitText);
        Group window = new Group(window1,window2,barreveti,barrevet2,barrehor1,barrehor2);
        Group porte = new Group(porte1,porte2,knob1,knob2);
        Group maison = new Group(toit1,mur1,mur2,toit2,window,porte);

        Group root = new Group(back,maison,soleil,luneCercle,ailes);

        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }
}
