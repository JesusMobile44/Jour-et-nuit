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
        window1.setStroke(Color.LIGHTGREY);
        window2.setFill(Color.AQUA);
        window2.setStroke(Color.LIGHTGREY);
        barreveti.setStroke(Color.LIGHTGREY);
        barrevet2.setStroke(Color.LIGHTGREY);
        barrehor1.setStroke(Color.LIGHTGREY);
        barrehor2.setStroke(Color.LIGHTGREY);

        Rectangle porte1 = new Rectangle(170,245,20,35);
        Rectangle porte2 = new Rectangle(570,245,20,35);
        Circle knob1 = new Circle(185,260,4,Color.YELLOWGREEN);
        Circle knob2 = new Circle(585,260,4,Color.YELLOWGREEN);

        porte1.setFill(Color.SADDLEBROWN);
        porte2.setFill(Color.SADDLEBROWN);

        QuadCurve aileG1 = new QuadCurve(30,100,50,90,70,130);
        aileG1.setStrokeWidth(1);
        aileG1.setStroke(Color.BLACK);
        aileG1.setFill(Color.LIGHTGREY);

        QuadCurve aileD1 = new QuadCurve(70,130,90,90,110,100);
        aileD1.setStrokeWidth(1);
        aileD1.setStroke(Color.BLACK);
        aileD1.setFill(Color.LIGHTGREY);

        QuadCurve aileG2 = new QuadCurve(150,40,170,30,190,70);
        aileG2.setStrokeWidth(1);
        aileG2.setStroke(Color.BLACK);
        aileG2.setFill(Color.LIGHTGREY);

        QuadCurve aileD2 = new QuadCurve(190,70,210,30,230,40);
        aileD2.setStrokeWidth(1);
        aileD2.setStroke(Color.BLACK);
        aileD2.setFill(Color.LIGHTGREY);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        KeyValue aD1M = new KeyValue(aileD1.startYProperty(),120,Interpolator.LINEAR);
        KeyValue aG1M = new KeyValue(aileG1.endYProperty(),120,Interpolator.LINEAR);
        KeyValue aD1finY = new KeyValue(aileD1.endYProperty(),125,Interpolator.LINEAR);
        KeyValue aD1finX = new KeyValue(aileD1.endXProperty(),115,Interpolator.LINEAR);
        KeyValue aG1finY = new KeyValue(aileG1.startYProperty(),125,Interpolator.LINEAR);
        KeyValue aG1finX = new KeyValue(aileG1.startXProperty(),25,Interpolator.LINEAR);

        KeyValue aD2M = new KeyValue(aileD2.startYProperty(),60,Interpolator.LINEAR);
        KeyValue aG2M = new KeyValue(aileG2.endYProperty(),60,Interpolator.LINEAR);
        KeyValue aD2finY = new KeyValue(aileD2.endYProperty(),65,Interpolator.LINEAR);
        KeyValue aD2finX = new KeyValue(aileD2.endXProperty(),235,Interpolator.LINEAR);
        KeyValue aG2finY = new KeyValue(aileG2.startYProperty(),65,Interpolator.LINEAR);
        KeyValue aG2finX = new KeyValue(aileG2.startXProperty(),145,Interpolator.LINEAR);

        KeyFrame gfd = new KeyFrame(Duration.seconds(1),aD1M,aG1M,aD1finY,aG1finY,aD1finX,aG1finX,aD2M,aG2M,aD2finY,aD2finX,aG2finY,aG2finX);

        timeline.getKeyFrames().addAll(gfd);
        timeline.play();

        Group ailes = new Group(aileG1,aileD1,aileG2,aileD2);

        Polygon star1 = new Polygon(205.0,150.0, 217.0,186.0, 256.0,186.0,
                223.0,208.0, 233.0,244.0, 205.0,222.0, 177.0,244.0, 187.0,208.0,
                154.0,186.0, 193.0,186.0);
        star1.setScaleX(0.4);
        star1.setScaleY(0.4);
        star1.setTranslateX(420);
        star1.setTranslateY(-110);

        Polygon star2 = new Polygon(205.0,150.0, 217.0,186.0, 256.0,186.0,
                223.0,208.0, 233.0,244.0, 205.0,222.0, 177.0,244.0, 187.0,208.0,
                154.0,186.0, 193.0,186.0);
        star2.setScaleX(0.3);
        star2.setScaleY(0.3);
        star2.setTranslateX(350);
        star2.setTranslateY(-130);

        Polygon star3 = new Polygon(205.0,150.0, 217.0,186.0, 256.0,186.0,
                223.0,208.0, 233.0,244.0, 205.0,222.0, 177.0,244.0, 187.0,208.0,
                154.0,186.0, 193.0,186.0);
        star3.setScaleX(0.2);
        star3.setScaleY(0.2);
        star3.setTranslateX(300);
        star3.setTranslateY(-100);

        Polygon star4 = new Polygon(205.0,150.0, 217.0,186.0, 256.0,186.0,
                223.0,208.0, 233.0,244.0, 205.0,222.0, 177.0,244.0, 187.0,208.0,
                154.0,186.0, 193.0,186.0);
        star4.setScaleX(0.3);
        star4.setScaleY(0.3);
        star4.setTranslateX(260);
        star4.setTranslateY(-160);

        star1.setFill(Color.YELLOW);
        star2.setFill(Color.YELLOW);
        star3.setFill(Color.YELLOW);
        star4.setFill(Color.YELLOW);

        Group stars = new Group(star1,star2,star3,star4);

        FadeTransition transStar1 = new FadeTransition(
                Duration.seconds(2),star1
        );
        transStar1.setToValue(0);
        transStar1.setCycleCount(Timeline.INDEFINITE);
        transStar1.setAutoReverse(true);
        transStar1.play();

        FadeTransition transStar2 = new FadeTransition(
                Duration.seconds(1),star2
        );
        transStar2.setToValue(0);
        transStar2.setCycleCount(Timeline.INDEFINITE);
        transStar2.setAutoReverse(true);
        transStar2.play();

        FadeTransition transStar3 = new FadeTransition(
                Duration.seconds(4),star3
        );
        transStar3.setToValue(0);
        transStar3.setCycleCount(Timeline.INDEFINITE);
        transStar3.setAutoReverse(true);
        transStar3.play();

        FadeTransition transStar4 = new FadeTransition(
                Duration.seconds(3),star4
        );
        transStar4.setToValue(0);
        transStar4.setCycleCount(Timeline.INDEFINITE);
        transStar4.setAutoReverse(true);
        transStar4.play();

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


        Group root = new Group(back,maison,soleil,luneCercle,ailes,stars);

        primaryStage.setScene((new Scene(root)));
        primaryStage.show();
    }
}
