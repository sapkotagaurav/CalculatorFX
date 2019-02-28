/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author root
 */
public class fxmlcontrol implements Initializable {

    @FXML
    private JFXButton five;
    @FXML
    private JFXButton seven;
    @FXML
    private JFXButton four;
    @FXML
    private JFXButton nine;
    @FXML
    private JFXButton eight;
    @FXML
    private JFXButton zerozero;
    @FXML
    private JFXButton zero;
    @FXML
    private JFXButton three;
    @FXML
    private JFXButton two;
    @FXML
    private JFXButton one;
    @FXML
    private JFXButton six;
    @FXML
    private JFXButton clear;
    @FXML
    private JFXButton equal;
    @FXML
    private JFXButton plus;
    @FXML
    private JFXButton minus;
    @FXML
    private JFXButton multi;
    @FXML
    private JFXButton divide;
    @FXML
    private Label prom;
    @FXML
    private JFXTextField input;
    
    private long fnumber;
    private long snumber;
    private String operation;

   public void point(){
       String oldValue = input.getText();
       String set = ".";
       input.setText( oldValue + set);
   }

         public void zero(){
          String oldValue = input.getText();
       String set = "0";
       input.setText( oldValue + set);

   }
           public void zerozero(){
          String oldValue = input.getText();
       String set = "00";
       input.setText( oldValue + set);

   }
            public void one(){
          String oldValue = input.getText();
       String set = "1";
       input.setText( oldValue + set);

   } 
            public void two(){
          String oldValue = input.getText();
       String set = "2";
       input.setText( oldValue + set);

   } 
            public void three(){
          String oldValue = input.getText();
       String set = "3";
       input.setText( oldValue + set);

   } 
            public void four(){
          String oldValue = input.getText();
       String set = "4";
       input.setText( oldValue + set);

   }  
    public void five(){
          String oldValue = input.getText();
       String set = "5";
       input.setText( oldValue + set);

   }
      public void six(){
          String oldValue = input.getText();
       String set = "6";
       input.setText( oldValue + set);

   }
         public void seven(){
          String oldValue = input.getText();
       String set = "7";
       input.setText( oldValue + set);

   }
            public void eight(){
          String oldValue = input.getText();
       String set = "8";
       input.setText( oldValue + set);

   }
               public void nine(){
          String oldValue = input.getText();
       String set = "9";
       input.setText( oldValue + set);

   }
                  public void plus(){
          String value = input.getText();
          long valuenumber = Integer.parseInt(value);
          this.fnumber = valuenumber;
          input.setText("");
          prom.setText(Long.toString(valuenumber));
          operation = "+";


   }
                     public void minus(){
       String value = input.getText();
          long valuenumber = Integer.parseInt(value);
          this.fnumber = valuenumber;
          input.setText("");
          prom.setText(Long.toString(valuenumber));
operation = "-";
   }
                 public void multi(){
       String value = input.getText();
          long valuenumber = Integer.parseInt(value);
          this.fnumber = valuenumber;
          input.setText("");
          prom.setText(Long.toString(valuenumber));
operation = "X";

   }
                        public void divide(){
        String value = input.getText();
          long valuenumber = Integer.parseInt(value);
          this.fnumber = valuenumber;
          input.setText("");
          prom.setText(Long.toString(valuenumber));
          operation = "/";


   }  
                        public void clear(){
       input.setText("");
       prom.setText("");
       this.snumber = 0;
       this.fnumber = 0;
   }   
   public void equals(){
       
       switch(operation){
           case "+":
               String value = input.getText();
               this.snumber = Integer.parseInt(value);
               long sysnum = this.fnumber +this.snumber;
               input.setText(String.valueOf(sysnum));
              String oldprom = prom.getText();
              prom.setText( oldprom + "+"+value);
               break;
               
                  case "-":
                 String valueminus = input.getText();
               this.snumber = Integer.parseInt(valueminus);
               long sysnumminus = this.fnumber  - this.snumber;
               input.setText(String.valueOf(sysnumminus));
              String oldpromminus = prom.getText();
              prom.setText( oldpromminus + "-"+valueminus);
               break;
               
                  case "X":
                 String valueX = input.getText();
               this.snumber = Integer.parseInt(valueX);
               long sysnumX = this.fnumber *this.snumber;
               input.setText(String.valueOf(sysnumX));
              String oldpromX = prom.getText();
              prom.setText( oldpromX + "X"+valueX);
               break;
               
                  case "/":
                 String valueD = input.getText();
               this.snumber = Integer.parseInt(valueD);
               long sysnumD = this.fnumber /this.snumber;
               input.setText(String.valueOf(sysnumD));
              String oldpromD = prom.getText();
              prom.setText( oldpromD + "÷"+valueD);
               break;
       }
   }
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
