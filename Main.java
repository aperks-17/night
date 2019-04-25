package application;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 500, 500);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);

			Rectangle night = new Rectangle(0, 0, 500, 500);
			night.setFill(Color.BLACK);
			root.getChildren().add(night);

			Circle moon = new Circle();
			moon.setCenterX(100.0f);
			moon.setCenterY(100.0f);
			moon.setRadius(50.0f);
			moon.setFill(Color.WHITE);
			root.getChildren().add(moon);

			for (int i = 0; i <= 1000; i++) {
				
				double upper = 500;
				double lower = 0;
				Random ran= new Random();
				ran.nextDouble();
				double r= lower + (upper - lower)* ran.nextDouble();
				System.out.println(r);
				Circle stars = new Circle(3);
				stars.setCenterX((int)r);
				stars.setCenterY((int)r);
//				stars.setRadius((1 / 2) * r);
				stars.setFill(Color.GHOSTWHITE);
				root.getChildren().add(stars);
			}

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
