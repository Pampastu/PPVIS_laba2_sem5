package sample.model;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

public class MoneyTransfer  extends  Transaction{
    private  int recipient;
    private int validity;
    private double sum;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button backButton;

    @FXML
    private Button executeButton;

    @Override
    public void execute() {
        super.execute();
    }

    @Override
    public boolean finishTransaction(Transaction transaction) {
        return super.finishTransaction(transaction);
    }

    @Override
    public boolean checkSolvency() {
        return super.checkSolvency();
    }

    @FXML
    void initialize() {
        backButton.setOnAction(actionEvent -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("view/payments.fxml"));
                Stage stage = (Stage) backButton.getScene().getWindow();

                stage.setScene(new Scene(root, 700, 500));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        executeButton.setOnAction(actionEvent -> {

        });

    }




    public Transaction createTransaction(){
        return new Transaction();
    }
}
