package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.model.ATM;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
        ATM atm = new ATM(primaryStage);

        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//        Parent root = FXMLLoader.load(getClass().getResource("view/changeLanguage.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root));
//       primaryStage.show();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
       // primaryStage.setScene(new Scene(root, 300, 275));
        //primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
