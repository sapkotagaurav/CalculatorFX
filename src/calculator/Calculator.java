/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       
        
      Parent root = FXMLLoader.load(getClass().getResource("calcfxml.fxml"));
        
        
        Scene scene = new Scene(root, 563, 625);
        
        primaryStage.setTitle("OBELUS CALCULATOR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
