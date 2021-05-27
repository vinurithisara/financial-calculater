package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.*;


public class calculator extends Application {

    public static void main(String[] args) {
        launch();
    }


    public void start (Stage primaryStage) throws Exception {
        Button button1 = new Button("Home");     //Main tabs
        button1.setPrefSize(110, 40);
        button1.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        Button button2 = new Button("Mortgage");
        button2.setPrefSize(110, 40);
        button2.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        Button button6 = new Button("Fixed Deposit");
        button6.setPrefSize(110, 40);
        button6.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        Button button3 = new Button("Comp.Savings");
        button3.setPrefSize(110, 40);
        button3.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        Button button4 = new Button("Loan");
        button4.setPrefSize(110, 40);
        button4.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        Button button5 = new Button("History");
        button5.setPrefSize(110, 40);
        button5.setStyle("-fx-background-color: #8395a7;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: white;");

        HBox hBox = new HBox();
        hBox.setSpacing(4);
        hBox.getChildren().addAll(button1, button2,button6, button3, button4, button5);
        //----Menu bar---//

        Button btn1=new Button("Help");     //Home page button
        btn1.setLayoutX(610);
        btn1.setLayoutY(30);
        btn1.setStyle("-fx-background-color:#ffd32a;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");

        btn1.setPrefSize(100,40);

        Image image=new Image("coin.jpg");   //Home page picture
        ImageView imageview=new ImageView();
        imageview.setImage(image);
        imageview.setFitHeight(480); //home page picture set height and width
        imageview.setFitWidth(500);

        Label h1=new Label("WELCOME!!!");//Home page welcome note
       h1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,30));
        Label h2=new Label("(Enjoy our");
        h2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,30));
        Label h3=new Label("service)");
        h3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.ITALIC,30));

        VBox homevbox=new VBox();
        homevbox.getChildren().addAll(h1,h2,h3);
        homevbox.setSpacing(30);
        homevbox.setLayoutY(100);
        homevbox.setLayoutX(570);

        final String WORDS =
                "There are four calculators in this App,\n" +
                        "                        ,\n" +
                        "          01.Mortgage,\n" +
                        "          02.Fixed Deposit,\n" +
                        "          03.Compound Savings ,\n" +
                        "          04.Loan\n" +
                        "                        ,\n" +
                        "*You can use only one calculator at a time.\n" +
                        "*You have to choose the button what you want to find  \n" +
                        "*You can use keyboard to give values to the textfields\n" +
                        "*After giving values then press Calculate button,\n" +
                      "                         ,\n"+
                        "---You can get your answer!!!---";


        btn1.setOnAction(event -> {  //Instructions wondow
            Label newlabel1 = new Label(WORDS);
            newlabel1.setFont(Font.font(15));

            newlabel1.setLayoutY(30);
            newlabel1.setLayoutX(60);
            Pane pane = new Pane();
            pane.getChildren().add(newlabel1);
            Stage stage = new Stage();
            stage.setScene(new Scene(pane,600, 400));
            stage.showAndWait();

        });

        Pane pane1 = new Pane();//Home page pane
        pane1.setStyle("-fx-background-color:#d2dae2");
        pane1.getChildren().addAll(btn1,imageview,homevbox);

//-------------------------------------------------------------------------------------------------------------
        //Mortgage Calculater


        Button mortgage1=new Button("PMT");//Mortgage cal leftside pane
        mortgage1.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        mortgage1.setPrefSize(90,30);
        mortgage1.setLayoutX(10);
        mortgage1.setLayoutY(70);
        Button mortgage2=new Button("Period");//Mortgage cal left side buttons
        mortgage2.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        mortgage2.setPrefSize(90,30);
        mortgage2.setLayoutX(10);
        mortgage2.setLayoutY(110);

        Button mortgage3=new Button("Home price");//Mortgage cal left side buttons
        mortgage3.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        mortgage3.setPrefSize(90,30);
        mortgage3.setLayoutX(10);
        mortgage3.setLayoutY(150);
        Pane morgage11=new Pane();
        morgage11.setStyle("-fx-background-color: rgb(200, 214, 229)");
        morgage11.getChildren().addAll(mortgage1,mortgage2,mortgage3);
                //-------------------------------------------------------//
        //When click PMT button
        Label PMT1 = new Label("Home Price:");   ///mortgage cl labels
        Label PMT2 = new Label("Period(Months):");   ///mortgage cl labels
        Label PMT3 = new Label("Interest rate(Annual):");  ///mortgage cl labels
        Label PMT4 = new Label("Monthly Payment(PMT):");    ///mortgage cl labels
        PMT4.setLayoutX(60);
        PMT4.setLayoutY(300);
        Label Pmt= new Label();//Financial cal labels
        Pmt.setLayoutX(200);
        Pmt.setLayoutY(300);

        TextField PMT11=new TextField();  //mortgage cal textfields
        TextField PMT22=new TextField();     //mortgage cal textfields
        TextField PMT33=new TextField();     //mortgage cal textfields

        Button bPMT=new Button("Calculate");//Mortgage cal calcuate button
        bPMT.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bPMT.setPrefSize(100,20);
        bPMT.setLayoutY(240);
        bPMT.setLayoutX(110);

        VBox vBoxPMT1 = new VBox();//Entering labels in mortgage cal(PMT) to a VBox
        vBoxPMT1.getChildren().addAll(PMT1,PMT2,PMT3);
        vBoxPMT1.setSpacing(35);
        vBoxPMT1.setLayoutX(60);
        vBoxPMT1.setLayoutY(60);
        VBox vBoxPMT2 = new VBox();
        vBoxPMT2.getChildren().addAll(PMT11,PMT22,PMT33);//Entering text fields in mortgage cal(PMT) to a VBox
        vBoxPMT2.setSpacing(30);
        vBoxPMT2.setLayoutX(200);
        vBoxPMT2.setLayoutY(60);

        bPMT.setOnAction(new EventHandler<ActionEvent>() {    //To find PMT in mortgage
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double PMT_P1 = Double.parseDouble(PMT11.getText());
                    Double PMT_T1 = Double.parseDouble(PMT22.getText());
                    Double PMT_R1 = Double.parseDouble(PMT33.getText());

                    Double mortgage_PMT = (PMT_P1 * PMT_R1 / 1200) * (Math.pow(1 + (PMT_R1 / 1200), PMT_T1)) / (Math.pow(1 + (PMT_R1 / 1200), PMT_T1) - 1);
                    String.valueOf(mortgage_PMT);
                    Pmt.setText(String.valueOf(mortgage_PMT));
                    save1(PMT11,PMT22,PMT33,Pmt,"Home price","Period","Interest Rate","PMT");
                } catch (NumberFormatException e) {
                    Alert a1 = new Alert(Alert.AlertType.ERROR);
                    a1.setContentText("Please enter valid inputs!!!");
                    a1.setTitle("Error message");
                    a1.showAndWait();
                }
            }
        });

        Pane pane2 = new Pane();
        pane2.getChildren().addAll(vBoxPMT1, vBoxPMT2,bPMT,PMT4,Pmt);
        pane2.setStyle("-fx-background-color:rgb(200, 214, 229)");

        //Mortgage cal(when click T)
        Label PMT5 = new Label("Home price:");   ///mortgage cl labels
        Label PMT6 = new Label("Interest rate(Annual):");   ///mortgage cl labels
        Label PMT7 = new Label("Monthly payment(PMT):");  ///mortgage cl labels
        Label PMT8 = new Label("Period(Months):");    ///mortgage cl labels
        PMT8.setLayoutX(60);
        PMT8.setLayoutY(300);
        Label PmtT= new Label();//output value in mortgage(T) cal
        PmtT.setLayoutX(150);
        PmtT.setLayoutY(300);

        TextField PMT44=new TextField();  //mortgage cal(T) textfields
        TextField PMT55=new TextField();     //mortgage cal(T) textfields
        TextField PMT66=new TextField();     //mortgage cal(T)  textfields

        Button B1PMT=new Button("Calculate");
        B1PMT.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        B1PMT.setPrefSize(100,20);
        B1PMT.setLayoutY(240);
        B1PMT.setLayoutX(110);

        VBox vBoxPMT3 = new VBox();
        vBoxPMT3.getChildren().addAll(PMT5,PMT6,PMT7);//Add labels in mortgage cal(T) to a VBox
        vBoxPMT3.setSpacing(35);
        vBoxPMT3.setLayoutX(60);
        vBoxPMT3.setLayoutY(60);
        VBox vBoxPMT4 = new VBox();
        vBoxPMT4.getChildren().addAll(PMT44,PMT55,PMT66);//Add textfield in mortgage cal(T) to a VBox
        vBoxPMT4.setSpacing(30);
        vBoxPMT4.setLayoutX(200);
        vBoxPMT4.setLayoutY(60);

        B1PMT.setOnAction(new EventHandler<ActionEvent>() {   //To calculate period in mortgage cal(T)
            @Override
        public void handle(ActionEvent event ) {
            try {
                    Double T_P = Double.parseDouble(PMT44.getText());
                    Double T_IR = Double.parseDouble(PMT55.getText());//Get interest rate
                    Double T_PMT = Double.parseDouble(PMT66.getText());//Get PMT

                    Double mortgage_T =Math.log(1200*T_PMT/(1200* T_PMT-T_P * T_IR ))/Math.log(1+ T_IR/1200);
                    String.valueOf(mortgage_T);
                    PmtT.setText(String.valueOf(mortgage_T));
                    save1(PMT44,PMT55,PMT66,PmtT,"Home price","Interest Rate","PMT","Period");
                }
                catch(NumberFormatException e){   //TO give an error message
                    Alert a2=new Alert(Alert.AlertType.ERROR);
                    a2.setContentText("Please enter valid inputs!!!");
                    a2.setTitle("Error message");
                    a2.showAndWait();
                }
            }
        });
        Pane mortgage22= new Pane();
        mortgage22.setStyle("-fx-background-color:rgb(200, 214, 229)");
        mortgage22.getChildren().addAll(vBoxPMT3,vBoxPMT4,B1PMT,PmtT,PMT8);


        //To find home principal in mortgage cal
        Label mortageP1 = new Label("Monthly Payment(PMT):");   ///mortgage cl(P) labels
        Label mortageP2= new Label("Period(Months):");   ///mortgage cl(P) labels
        Label mortageP3 = new Label("Interest rate(Annual):");  ///mortgage cl(P) labels
        Label mortageP4 = new Label("Home price:");    ///mortgage cl(P) labels
        mortageP4.setLayoutX(60);
        mortageP4.setLayoutY(300);
        Label homep= new Label();//To get a out put
        homep.setLayoutX(200);
        homep.setLayoutY(300);

        TextField mortgageP5=new TextField();  //mortgage cal(P) textfields
        TextField mortgageP6=new TextField();     //mortgage cal(P) textfields
        TextField mortgageP7=new TextField();     //mortgage cal(P) textfields

        Button pmorgage=new Button("Calculate");//Mortgage cal(p) calculate button
        pmorgage.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        pmorgage.setPrefSize(100,20);
        pmorgage.setLayoutY(240);
        pmorgage.setLayoutX(110);

        VBox vBoxP1 = new VBox();
        vBoxP1 .getChildren().addAll(mortageP1 , mortageP2 ,mortageP3);//TO add mortgage cal(T)labels to a vbox
        vBoxP1 .setSpacing(35);
        vBoxP1 .setLayoutX(60);
        vBoxP1.setLayoutY(60);
        VBox vBoxP2 = new VBox();
        vBoxP2.getChildren().addAll(mortgageP5, mortgageP6, mortgageP7);//TO add mortgage cal(T)labels to a vbox
        vBoxP2.setSpacing(30);
        vBoxP2.setLayoutX(200);
        vBoxP2.setLayoutY(60);

        pmorgage.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {
                try {
                    Double P_PMT = Double.parseDouble(mortgageP5.getText());//get monthly payment
                    Double P_T = Double.parseDouble(mortgageP6.getText());//get period
                    Double P_R = Double.parseDouble(mortgageP7.getText());//interest rate

                    Double mortgage_P =(P_PMT*1200/P_R)*(1-1/Math.pow(1+P_R/1200,P_T))  ;
                    String.valueOf(mortgage_P);
                    homep.setText(String.valueOf(mortgage_P));
                    save1(mortgageP5,mortgageP6,mortgageP7,homep,"PMT","Period","Interest Rate","Home price");
                } catch (NumberFormatException e) {
                    Alert a3 = new Alert(Alert.AlertType.ERROR);
                    a3.setContentText("Please enter valid inputs!!!");
                    a3.setTitle("Error message");
                    a3.showAndWait();
                }
            }
        });

        Pane mortgage_p_pane = new Pane();
        mortgage_p_pane.setStyle("-fx-background-color:rgb(200, 214, 229)");
        mortgage_p_pane.getChildren().addAll( vBoxP1,  vBoxP2,mortageP4, homep, pmorgage);



//------------------------------------------------------------------------------------------------------------------------------------------------
        //Fixed deposit Calculater
        Button fdb1=new Button("Future Value");//Leftside bar
        fdb1.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fdb1.setPrefSize(130,30);
        fdb1.setLayoutX(10);
        fdb1.setLayoutY(40);
        Button fdb2=new Button("Interest Rate");
        fdb2.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fdb2.setPrefSize(130,30);
        fdb2.setLayoutX(10);
        fdb2.setLayoutY(90);
        Button fdb3=new Button("Period");
        fdb3.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fdb3.setPrefSize(130,30);
        fdb3.setLayoutX(10);
        fdb3.setLayoutY(140);
        Button fdb4=new Button("Start Principal");
        fdb4.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fdb4.setPrefSize(130,30);
        fdb4.setLayoutX(10);
        fdb4.setLayoutY(190);
        Pane fdleft=new Pane();
        fdleft.setStyle("-fx-background-color:rgb(200, 214, 229)");
        fdleft.getChildren().addAll(fdb1,fdb2,fdb3,fdb4);
///-----------------------------------------------------------//
        //find future value(Simple Saving)
        Label lbfd1 = new Label("Start Principal:");    //Simple Savings cal(FV) labels
        Label lbfd2 = new Label("period:");    //Simple Savings cal(FV) labels
        Label lbfd3= new Label("Interest Rate:");//Simple Savings cal(FV) labels

        Label lbfd4 = new Label("Future Value:");//Simple Savings cal(FV) labels
        lbfd4.setLayoutX(60);
        lbfd4.setLayoutY(300);
        Label lbfd5= new Label();////Simple Savings cal(FV) output label
        lbfd5.setLayoutX(150);
        lbfd5.setLayoutY(300);

        TextField tftfd1=new TextField();   //Simple Savings cal(FV) txtfields
        TextField tftfd2=new TextField();  //Simple Savings cal(FV) txtfields
        TextField tftfd3=new TextField(); //Simple Savings cal(FV) txtfields

        Button fd_out1=new Button("Calculate");////Simple Savings cal(FV) calculate button
        fd_out1.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fd_out1.setPrefSize(100,20);
        fd_out1.setLayoutY(230);
        fd_out1.setLayoutX(90);

        VBox vBox_fd1 = new VBox();
        vBox_fd1.getChildren().addAll(lbfd1,lbfd2,lbfd3);//to add labels in simple Savings(FV) to a VBox
        vBox_fd1.setSpacing(35);
        vBox_fd1.setLayoutX(60);
        vBox_fd1.setLayoutY(60);
        VBox vBox_fd2 = new VBox();
        vBox_fd2.getChildren().addAll(tftfd1,tftfd2,tftfd3);//to add textfields in simple Savings(FV) to a VBox
        vBox_fd2.setSpacing(30);
        vBox_fd2.setLayoutX(200);
        vBox_fd2.setLayoutY(60);

        fd_out1.setOnAction(new EventHandler<ActionEvent>() {//to calculate Fv in simple Savings cal
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double.parseDouble(tftfd1.getText());
                    Double.parseDouble(tftfd2.getText());
                    Double.parseDouble(tftfd3.getText());

                    Double FV = Double.parseDouble(tftfd1.getText()) * Math.pow(1 + (Double.parseDouble(tftfd3.getText()) / (12 * 100)), 12 * Double.parseDouble(tftfd2.getText()));
                    String.valueOf(FV);
                    lbfd5.setText(String.valueOf(FV));
                    save1(tftfd1,tftfd2,tftfd3,lbfd5,"Start principal","Period","Interest rate","Future value");
                } catch (NumberFormatException e) {
                    Alert a4 = new Alert(Alert.AlertType.ERROR);
                    a4.setContentText("Please enter valid inputs!!!");
                    a4.setTitle("Error message");
                    a4.showAndWait();
                }
            }
        });

        Pane fd_pane1 = new Pane();
        fd_pane1.setStyle("-fx-background-color:rgb(200, 214, 229)");
        fd_pane1.getChildren().addAll(vBox_fd1,vBox_fd2,lbfd4,lbfd5,fd_out1);

        //To find Interest rate(Simple Savings)
        Label lbfd6 = new Label("Start Principal:");   //Labels in simple Savings cal(R)
        Label lbfd7 = new Label("period:");     //Labels in simple Savings cal(R)
        Label lbfd8= new Label("Future Value:");//Labels in simple Savings cal(R)

        Label lbfd9 = new Label("Interest Rate:");///to add labels in simple Savings(FV) to a VBox
        lbfd9.setLayoutX(60);
        lbfd9.setLayoutY(300);
        Label lbfd10= new Label();//Get output(T) in simple savings cal
        lbfd10.setLayoutX(150);
        lbfd10.setLayoutY(300);

        TextField tftfd4=new TextField();  //Text Field in simple Savings cal(R)
        TextField tftfd5=new TextField();  //Text Field in simple Savings cal(R)
        TextField tftfd6=new TextField(); //Text Field in simple Savings cal(R)

        Button  fd_out2=new Button("Calculate");//to calculate period in savings cal
        fd_out2.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fd_out2.setPrefSize(100,20);
        fd_out2.setLayoutY(230);
        fd_out2.setLayoutX(90);

        VBox vBox_fd3 = new VBox();
        vBox_fd3.getChildren().addAll(lbfd6,lbfd7,lbfd8); //to add labels in simple Savings(FV) to a VBox
        vBox_fd3.setSpacing(35);
        vBox_fd3.setLayoutX(60);
        vBox_fd3.setLayoutY(60);
        VBox  vBox_fd4  = new VBox();
        vBox_fd4.getChildren().addAll(tftfd4,tftfd5,tftfd6); //to add labels in simple Savings(FV) to a VBox
        vBox_fd4.setSpacing(30);
        vBox_fd4.setLayoutX(200);
        vBox_fd4.setLayoutY(60);

        fd_out2.setOnAction(new EventHandler<ActionEvent>() {   //TO calculate simple savings(FV)
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double P1 = Double.parseDouble(tftfd4.getText());//Get principal amount
                    Double T1 = Double.parseDouble(tftfd5.getText());//Get period Period
                    Double FV1 = Double.parseDouble(tftfd6.getText());//Get period Future value

                    Double Interest_Rate = 1200 * Math.pow(FV1 / P1, 1 / (12 * T1)) - 1200;
                    String.valueOf(Interest_Rate);
                    lbfd10.setText(String.valueOf(Interest_Rate));
                    save1(tftfd4,tftfd5,tftfd6,lbfd10,"Start Principal","Period","Future value","Interest rate");//call save1 method
                }  catch(NumberFormatException e){
                    Alert a6=new Alert(Alert.AlertType.ERROR);
                    a6.setContentText("Please enter valid inputs!!!");
                    a6.setTitle("Error message");
                    a6.showAndWait();
                }
            }
        });
        Pane fd_pane2 = new Pane();
        fd_pane2.setStyle("-fx-background-color:rgb(200, 214, 229)");
        fd_pane2.getChildren().addAll(vBox_fd3,vBox_fd4, fd_out2,lbfd9,lbfd10);

        //To find Period(Simple Savings)
        Label lbfd11 = new Label("Future Value:");   //Fix deposit cal(T) labels
        Label lbfd12 = new Label("Interest Rate");  //Fix deposit cal(T) labels
        Label lbfd13= new Label("Start principal");//Fix deposit cal(T) labels

        Label lbfd14 = new Label("Period:");//Fix deposit cal labels
        lbfd14.setLayoutX(60);
        lbfd14.setLayoutY(300);
        Label lbfd15= new Label();//Financial cal labels
        lbfd15.setLayoutX(150);
        lbfd15.setLayoutY(300);

        TextField tftfd7=new TextField();   //Fix deposit cal(T) txtfields
        TextField tftfd8=new TextField();  // Fix deposit cal(T) txtfields
        TextField tftfd9=new TextField();  // Fix deposit cal(T) txtfields

        Button fd_out3=new Button("Calculate");//To Caculate period in simple savings
        fd_out3.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fd_out3.setPrefSize(100,20);
        fd_out3.setLayoutY(230);
        fd_out3.setLayoutX(90);
        VBox vBox_fd5 = new VBox();
        vBox_fd5.getChildren().addAll( lbfd11, lbfd12, lbfd13);// add labels to simple savings(T) to vbox
        vBox_fd5.setSpacing(35);
        vBox_fd5.setLayoutX(60);
        vBox_fd5.setLayoutY(60);
        VBox vBox_fd6  = new VBox();
        vBox_fd6.getChildren().addAll(tftfd7,tftfd8,tftfd9);// add labels to simple savings(T) to vbox
        vBox_fd6.setSpacing(30);
        vBox_fd6.setLayoutX(200);
        vBox_fd6.setLayoutY(60);

        fd_out3.setOnAction(new EventHandler<ActionEvent>() {//To calculate simple savings(T) to vbox
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double FV2 = Double.parseDouble(tftfd7.getText());
                    Double IR2 = Double.parseDouble(tftfd8.getText());
                    Double SP2 = Double.parseDouble(tftfd9.getText());

                    Double Period = Math.log10(FV2 / SP2) / 12 * (Math.log(1 + (IR2 / 1200)));
                    String.valueOf(Period);
                    lbfd15.setText(String.valueOf(Period));
                    save1(tftfd7,tftfd8,tftfd9,lbfd15,"Future value","Interest rate","Start principal","Period");
                } catch (NumberFormatException e) {
                    Alert a7 = new Alert(Alert.AlertType.ERROR);
                    a7.setContentText("Please enter valid inputs!!!");
                    a7.setTitle("Error message");
                    a7.showAndWait();
                }
            }
        });

        Pane fd_pane3 = new Pane();
        fd_pane3.setStyle("-fx-background-color:rgb(200, 214, 229)");
        fd_pane3.getChildren().addAll(vBox_fd5,vBox_fd6,fd_out3,lbfd14,lbfd15);

     //Find Start principal(Simple savings)
        Label lbfd16 = new Label("Period:");    //Simple savings cal labels
        Label lbfd17 = new Label("Interest Rate:");     //Simple savings(P) cal labels
        Label lbfd18= new Label("Future Value:");//Simple savings(P) labels

        Label lbfd19 = new Label("Start Principal:");//Simple savings(P)cal labels
        lbfd19.setLayoutX(60);
        lbfd19.setLayoutY(300);
        Label lbfd20= new Label();//Simple savings(P)cal output label
        lbfd20.setLayoutX(150);
        lbfd20.setLayoutY(300);

        TextField tftfd10=new TextField();   //Simple savings(P)cal Textfields
        TextField tftfd11=new TextField();   //Simple savings(P)cal Textfields
        TextField tftfd12=new TextField();   //Simple savings(P)cal Textfields

        Button fd_out4=new Button("Calculate");
        fd_out4.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        fd_out4.setPrefSize(100,20);
        fd_out4.setLayoutY(230);
        fd_out4.setLayoutX(90);

        VBox vBox_fd7 = new VBox();
        vBox_fd7.getChildren().addAll(lbfd16,lbfd17,lbfd18);//To add labels in simple savings(P) to a vbox
        vBox_fd7.setSpacing(35);
        vBox_fd7.setLayoutX(60);
        vBox_fd7.setLayoutY(60);
        VBox vBox_fd8  = new VBox();
        vBox_fd8.getChildren().addAll(tftfd10,tftfd11,tftfd12);//To addTextfields in simple savings(P) to a vbox
        vBox_fd8.setSpacing(30);
        vBox_fd8.setLayoutX(200);
        vBox_fd8.setLayoutY(60);

        fd_out4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double FV3 = Double.parseDouble(tftfd12.getText());
                    Double IR3 = Double.parseDouble(tftfd11.getText());
                    Double T3 = Double.parseDouble(tftfd10.getText());

                    Double SP = FV3 / Math.pow(1 + (IR3 / 1200), 12 * T3);
                    String.valueOf(SP );
                    lbfd20.setText(String.valueOf(SP ));
                    save1(tftfd10,tftfd11,tftfd12,lbfd20,"Period","Interest rate","Future value","Start principal");
                } catch (NumberFormatException e) {
                    Alert a8 = new Alert(Alert.AlertType.ERROR);
                    a8.setContentText("Please enter valid inputs!!!");
                    a8.setTitle("Error message");
                    a8.showAndWait();
                }
            }
        });

        Pane fd_pane4 = new Pane();
        fd_pane4.setStyle("-fx-background-color:rgb(200, 214, 229)");
        fd_pane4.getChildren().addAll(vBox_fd7,vBox_fd8,fd_out4,lbfd19,lbfd20);

//---------------------------------------------------------------------------//
        //Compound Savings Calculater
        Button bt1=new Button("Future Value");   //Leftside buttons
        bt1.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bt1.setPrefSize(110,10);
        bt1.setLayoutX(10);
        bt1.setLayoutY(40);
        Button bt3=new Button("Period");
        bt3.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bt3.setPrefSize(110,10);
        bt3.setLayoutX(10);
        bt3.setLayoutY(120);
        Button bt4=new Button("Start Principal");
        bt4.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bt4.setPrefSize(110,10);
        bt4.setLayoutX(10);
        bt4.setLayoutY(160);
        Button bt5=new Button("Monthly Addition");
        bt5.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bt5.setPrefSize(110,10);
        bt5.setLayoutX(10);
        bt5.setLayoutY(80);
        Pane paneleft=new Pane();
        paneleft.setStyle("-fx-background-color:rgb(200, 214, 229)");
        paneleft.getChildren().addAll(bt1,bt3,bt4,bt5);


        //To find future value(Compound savings)
        Label lbl5 = new Label("Start Principal:");    //Compound savings(FV) cal labels
        Label lbl6 = new Label("period:");     //Compound savings(FV) cal labels
        Label lbl7 = new Label("Interest Rate:");//Compound savings(FV) cal labels
        Label ladd= new Label("Monthly Addition");
        Label lbl8 = new Label("Future Value:");//Compound savings(FV) cal labels
        lbl8.setLayoutX(60);
        lbl8.setLayoutY(330);
        Label output1= new Label();//Compound savings(FV) output label
        output1.setLayoutX(150);
        output1.setLayoutY(330);

        TextField tft5=new TextField();   //Compound savings(FV) cal txtfields
        TextField tft6=new TextField(); //Compound savings(FV) cal txtfields
        TextField tft7=new TextField();  //Compound savings(FV) cal txtfields
        TextField tfadd=new TextField();

        Button c1=new Button("Calculate");///Compound savings(FV) cal output button
        c1.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        c1.setPrefSize(100,20);
        c1.setLayoutY(280);
        c1.setLayoutX(100);

        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(lbl5,lbl6,lbl7,ladd);//To add labels in Compound savings(FV) to vbox
        vBox3.setSpacing(35);
        vBox3.setLayoutX(60);
        vBox3.setLayoutY(60);
        VBox vBox4 = new VBox();
        vBox4.getChildren().addAll(tft5,tft6,tft7,tfadd);//To add textfields in Compound savings(FV) to vbox
        vBox4.setSpacing(30);
        vBox4.setLayoutX(200);
        vBox4.setLayoutY(60);

        c1.setOnAction(new EventHandler<ActionEvent>() {    //To calculate fv in compound savings
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double c1P = Double.parseDouble(tft5.getText());//get principal amount
                    Double c1T = Double.parseDouble(tft6.getText());//get prtiod
                    Double c1IR = Double.parseDouble(tft7.getText());//get interest rate
                    Double c1add = Double.parseDouble(tfadd.getText());//get monthly addition

                    Double c1FV = c1P * Math.pow(1 + (c1IR / 1200), 12 * c1T) + c1add * (1200) / c1IR * (Math.pow(1 + (c1IR / 1200), 12 * c1T) - 1);
                    String.valueOf(c1FV);
                    output1.setText(String.valueOf(c1FV));
                    save(tft5,tft6,tft7,tfadd,output1,"Pincipal","Period","Interest Rate","Monthly addition","Future Value");
                } catch (NumberFormatException e) {
                    Alert a9 = new Alert(Alert.AlertType.ERROR);
                    a9.setContentText("Please enter valid inputs!!!");
                    a9.setTitle("Error message");
                    a9.showAndWait();
                }
            }
        });

        Pane pane3 = new Pane();
        pane3.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane3.getChildren().addAll(vBox3,vBox4,lbl8,c1,output1,hBox);



        //To find Start Principal(Compound savings)
        Label lbl13 = new Label("Future Value:");   //compound savings cal(P) labels
        Label lbl14 = new Label("Interest Rate:");    //compound savings cal(P) labels
        Label lbl15= new Label("period:");//compound savings cal labels
        Label labelpmt=new Label("Monthly Payment:");//compound savings cal(P) labels

        Label lbl16 = new Label("Start principal:");//compound savings cal(P) labels
        lbl16.setLayoutX(60);
        lbl16.setLayoutY(340);
        Label output3= new Label();//compound savings cal(P) output
        output3.setLayoutX(150);
        output3.setLayoutY(340);

        TextField tft11=new TextField();   // compound savings cal(P) txtfields
        TextField tft12=new TextField();  // compound savings cal(P) txtfields
        TextField tft13=new TextField();// compound savings cal(P) txtfields
        TextField textpmt=new TextField();// compound savings cal(P) txtfields

        Button c3=new Button("Calculate");
        c3.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        c3.setPrefSize(100,20);
        c3.setLayoutY(280);
        c3.setLayoutX(90);
        VBox vBox7 = new VBox();
        vBox7.getChildren().addAll(lbl13,lbl14,lbl15,labelpmt);//add compound savings cal(P) labels to vbox
        vBox7.setSpacing(35);
        vBox7.setLayoutX(60);
        vBox7.setLayoutY(60);
        VBox vBox8  = new VBox();
        vBox8.getChildren().addAll(tft11,tft12,tft13,textpmt);//add compound savings cal(P) text fields to vbox
        vBox8.setSpacing(30);
        vBox8.setLayoutX(200);
        vBox8.setLayoutY(60);

        c3.setOnAction(new EventHandler<ActionEvent>() {   //To get compound savings cal(P)
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double c3FV = Double.parseDouble(tft11.getText());//get future value
                    Double c3IR = Double.parseDouble(tft12.getText());///get interest rate
                    Double c3T = Double.parseDouble(tft13.getText());//get period in years
                    Double c3pmt = Double.parseDouble(textpmt.getText());//get monthly addition

                    Double c3Start_principal = (c3FV - (c3pmt * (1200 / c3IR) * (Math.pow(1 + c3IR / 1200, 12 * c3T) - 1))) / Math.pow(1 + c3IR / 1200, 12 * c3T);
                    String.valueOf(c3Start_principal);
                    output3.setText(String.valueOf(c3Start_principal));
                    save(tft11,tft12,tft13,textpmt,output3,"Future value","Interest Rate","Period","Monthly payment","Start Principal");
                } catch (NumberFormatException e) {  //Error alert
                    Alert a10 = new Alert(Alert.AlertType.ERROR);
                    a10.setContentText("Please enter valid inputs!!!");
                    a10.setTitle("Error message");
                    a10.showAndWait();
                }
            }
        });

        Pane pane5 = new Pane();
        pane5.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane5.getChildren().addAll(vBox7,vBox8,c3,lbl16,output3);

        //Find period(COmpound savings)
        Label lbl17 = new Label("Start Principal:");    //compound savings cal(t) labels
        Label lbl18 = new Label("Interest Rate:)");     //compound savings cal(t) labels
        Label lbl19= new Label("Future Value:");  //compound savings cal(t) labels
        Label mnadd=new Label("Monthly Addition");   //compound savings cal(t) labels

        Label lbl20 = new Label("Period:");///compound savings cal(t)  labels
        lbl20.setLayoutX(60);
        lbl20.setLayoutY(340);
        Label output4= new Label();//compound savings cal(t) output label
        output4.setLayoutX(150);
        output4.setLayoutY(340);

        TextField tft14=new TextField();   // compound savings cal(t) txtfields
        TextField tft15=new TextField();  // compound savings cal(t) txtfields
        TextField tft16=new TextField();//compound savings cal(t) txtfields
        TextField txtmn=new TextField();
        Button c4=new Button("Calculate");  //compound savings(t) calculation button
        c4.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        c4.setPrefSize(100,20);
        c4.setLayoutY(280);
        c4.setLayoutX(90);

        VBox vBox9 = new VBox();
        vBox9.getChildren().addAll(lbl17,lbl18,lbl19,mnadd);//to add compound savings cal(t) labels to vbox
        vBox9.setSpacing(35);
        vBox9.setLayoutX(60);
        vBox9.setLayoutY(60);
        VBox vBox10  = new VBox();
        vBox10.getChildren().addAll(tft14,tft15,tft16,txtmn);//to add compound savings cal(t)txtfields to vbox
        vBox10.setSpacing(30);
        vBox10.setLayoutX(200);
        vBox10.setLayoutY(60);

        c4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double c4p = Double.parseDouble(tft14.getText());//get principal amount
                    Double c4IR = Double.parseDouble(tft15.getText());//get interest rate
                    Double c4FV = Double.parseDouble(tft16.getText());//get future value
                    Double c4PMT = Double.parseDouble(txtmn.getText());//get monthly addition

                    Double cperiod =Math.log((c4FV*c4IR/1200)+c4PMT/(c4p*c4IR/1200)+c4PMT)/12*Math.log(1+c4IR/1200);
                    String.valueOf( cperiod);
                    output4.setText(String.valueOf( cperiod));
                    save(tft14,tft15,tft16,txtmn,output4,"Principal Amount","Interest Rate","Future value","Monthly payment","Period");
                } catch (NumberFormatException e) {
                    Alert aMa = new Alert(Alert.AlertType.ERROR);
                    aMa.setContentText("Please enter valid inputs!!!");
                    aMa.setTitle("Error message");
                    aMa.showAndWait();
                }
            }
        });

        Pane pane6 = new Pane();
        pane6.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane6.getChildren().addAll(vBox9,vBox10,c4,lbl20,output4);

       //to find Monthly addition(Compound savings)
        Label lbl25 = new Label("Future Value:");  //compound savings cal(MA) labels
        Label lbl26 = new Label("Interest rate(annual):");    //compound savings cal(MA) labels
        Label lbl27= new Label("Period(years):");//compound savings cal(MA) labels
        Label lprincipal=new Label("Principal Amount:");//compound savings cal(MA) labels
        Label lbl28 = new Label("Monthly Addition:");//compound savings cal(MA) labels
        lbl28.setLayoutX(90);
        lbl28.setLayoutY(340);
        Label output5= new Label();///compound savings cal(MA) output label
        output5.setLayoutX(200);
        output5.setLayoutY(340);

        TextField tft21=new TextField();  //compound savings cal(MA) txtfields
        TextField tft22=new TextField();   //compound savings cal(MA) txtfields
        TextField tft23=new TextField();   //compound savings cal(MA) txtfields
        TextField txtprincipal=new TextField();
        Button c5=new Button("Calculate");
        c5.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        c5.setPrefSize(100,20);
        c5.setLayoutY(280);
        c5.setLayoutX(90);

        VBox vBox14 = new VBox();
        vBox14.getChildren().addAll(lbl25,lprincipal,lbl26,lbl27);//add compound savings cal(MA) labels to a vbox
        vBox14.setSpacing(35);
        vBox14.setLayoutX(60);
        vBox14.setLayoutY(60);
        VBox vBox13  = new VBox();
        vBox13.getChildren().addAll(tft21,txtprincipal,tft22,tft23);//add compound savings cal(MA) textfields to a vbox
        vBox13.setSpacing(30);
        vBox13.setLayoutX(200);
        vBox13.setLayoutY(60);

        c5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double c5FV = Double.parseDouble(tft21.getText());//get future value
                    Double c5IR = Double.parseDouble(tft22.getText());//get interest rate
                    Double c5T = Double.parseDouble(tft23.getText());//get period
                    Double c5P = Double.parseDouble(txtprincipal.getText());//get principal amount

                    Double c5Monthly = (c5IR / 1200 * (c5FV - c5P * Math.pow(1 + c5IR / 1200, 12 * c5T))) / (Math.pow(1 + c5IR / 1200, 12 * c5T) - 1);
                    String.valueOf(c5Monthly);
                    output5.setText(String.valueOf(c5Monthly));
                    save(tft21,tft22,tft23,txtprincipal,output5,"Future Value","Interest Rate","Period","Principal Amount","Monthly Addition");
                } catch (NumberFormatException e) {
                    Alert a11 = new Alert(Alert.AlertType.ERROR);
                    a11.setContentText("Please enter valid inputs!!!");
                    a11.setTitle("Error message");
                    a11.showAndWait();
                }
            }
        });
        Pane pane10 = new Pane();
        pane10.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane10.getChildren().addAll(vBox13,vBox14,c5,lbl28,output5);
//--------------------------------------------------------------------------//
        //Auto Loan cal
        Button bmonthly=new Button("PMT");//Left side pane
        bmonthly.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bmonthly.setPrefSize(110,30);
        bmonthly.setLayoutX(10);
        bmonthly.setLayoutY(70);
        Button bterm=new Button("Loan term");
        bterm.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        bterm.setPrefSize(110,30);
        bterm.setLayoutX(10);
        bterm.setLayoutY(110);
        Button  btAuto=new Button("Loan Price:");
        btAuto.setStyle("-fx-background-color:#70a1ff;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        btAuto.setPrefSize(110,30);
        btAuto.setLayoutX(10);
        btAuto.setLayoutY(150);

        Pane loanpane=new Pane();
        loanpane.setStyle("-fx-background-color:rgb(200, 214, 229)");
        loanpane.getChildren().addAll( bmonthly,btAuto,bterm);//Auto loan side pane

        //To find pmt in loan cal

        Label lbl21 = new Label("Loan price:");    //Auto loan cal(PMT) labels
        Label lbl22 = new Label("Loan term(Months):");    //Auto loan cal(PMT) labels
        Label lbl23 = new Label("Interest rate(Annual):");    //Auto loan cal(PMT) labels
        Label lbl24 = new Label("Monthly payments:");    //Auto loan cal(PMT) labels
        lbl24.setLayoutX(60);
        lbl24.setLayoutY(300);
        Label lblout=new Label();
        lblout.setLayoutY(300);
        lblout.setLayoutX(180);
        TextField tft17=new TextField();   // Auto loan cal(PMT) txtfields
        TextField tft18=new TextField();   // Auto loan cal(PMT) txtfieldsfields
        TextField tft19=new TextField();  // Auto loan cal(PMT) txtfields

        Button btn4=new Button("Calculate");    // Auto loan(PMT) calculation button
        btn4.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        btn4.setPrefSize(100,20);
        btn4.setLayoutY(230);
        btn4.setLayoutX(90);
        VBox vBox11 = new VBox();
        vBox11.getChildren().addAll(lbl21,lbl22,lbl23);//add to labels to a vbox
        vBox11.setSpacing(35);
        vBox11.setLayoutX(60);
        vBox11.setLayoutY(60);
        VBox vBox12 = new VBox();
        vBox12.getChildren().addAll(tft17,tft18,tft19);//add to textfields to a vbox
        vBox12.setSpacing(30);
        vBox12.setLayoutX(200);
        vBox12.setLayoutY(60);

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double Auto_P1 = Double.parseDouble(tft17.getText());//get auto loan price
                    Double Auto_T1 = Double.parseDouble(tft18.getText());//get period
                    Double Auto_R1 = Double.parseDouble(tft19.getText());//get interest rate

                    Double Auto_PMT = ( Auto_P1 * Auto_R1 / 1200) * (Math.pow(1 + (Auto_R1 / 1200), Auto_T1 )) / (Math.pow(1 + (Auto_R1 / 1200),  Auto_T1 ) - 1);
                    String.valueOf(Auto_PMT);
                    lblout.setText(String.valueOf(Auto_PMT));
                    save1(tft17,tft18,tft19,lblout,"Auto price","Period","Interest Rate","PMT");
                } catch (NumberFormatException e) {
                    Alert a12 = new Alert(Alert.AlertType.ERROR);
                    a12.setContentText("Please enter valid inputs!!!");
                    a12.setTitle("Error message");
                    a12.showAndWait();
                }
            }
        });
        Pane pane7 = new Pane();
        pane7.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane7.getChildren().addAll(vBox11,vBox12,btn4,lblout,lbl24);//add elements to a pane

        //To find loan term in loan cal

        Label t1label1 = new Label("Loan price:");    //Auto loan cal(T) labels
        Label t1label2 = new Label("Monthly payments:");    //Auto loan cal(T) labels
        Label t1label3 = new Label("Interest rate:");    //Auto loan cal(T) labels
        Label t1label4 = new Label("Loan term:");    //Auto loan cal(T) labels
        t1label4.setLayoutX(60);
        t1label4.setLayoutY(300);
        Label t1label5=new Label();
        t1label5.setLayoutY(300);
        t1label5.setLayoutX(130);
        TextField t1txt1=new TextField();   // Auto loan cal(T) txtfields
        TextField t1txt2=new TextField();   // Auto loan cal(T) txtfieldsfields
        TextField t1txt3=new TextField();  // Auto loan cal(T) txtfields

        Button buttont1=new Button("Calculate");    // Auto loan cal(T) calculate button
        buttont1.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        buttont1.setPrefSize(100,20);
        buttont1.setLayoutY(230);
        buttont1.setLayoutX(90);
        VBox vBoxt1 = new VBox();
        vBoxt1.getChildren().addAll(t1label1 ,t1label2,t1label3);//add Auto loan cal(T) labels to a vbox
        vBoxt1.setSpacing(35);
        vBoxt1.setLayoutX(60);
        vBoxt1.setLayoutY(60);
        VBox vBoxt2 = new VBox();
        vBoxt2.getChildren().addAll(t1txt1,t1txt2,t1txt3);//add Auto loan cal(T)txtfields to a vbox
        vBoxt2.setSpacing(30);
        vBoxt2.setLayoutX(200);
        vBoxt2.setLayoutY(60);

        buttont1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double Auto_P1 = Double.parseDouble(t1txt1.getText());//get auto loan price
                    Double Auto_PMT = Double.parseDouble(t1txt2.getText());//get period
                    Double Auto_R1 = Double.parseDouble(t1txt3.getText());//get interest rate

                    Double Auto_term = Math.log(1200*Auto_PMT/(1200* Auto_PMT-Auto_P1 * Auto_R1))/Math.log(1+ Auto_R1/1200) ;
                    String.valueOf( Auto_term);
                    t1label5.setText(String.valueOf( Auto_term));
                    save1(t1txt1,t1txt2,t1txt3,t1label5,"Auto price","PMT","Interest Rate","Period");
                } catch (NumberFormatException e) {
                    Alert a_Autot = new Alert(Alert.AlertType.ERROR);
                    a_Autot.setContentText("Please enter valid inputs!!!");
                    a_Autot.setTitle("Error message");
                    a_Autot.showAndWait();
                }
            }
        });

        Pane loan_T = new Pane();
        loan_T.setStyle("-fx-background-color:rgb(200, 214, 229)");
        loan_T .getChildren().addAll(vBoxt1,vBoxt2, buttont1, t1label4, t1label5);

        //To find auto loan price
        Label p1label1 = new Label("Monthly payments:");    //Auto loan(P) cal labels
        Label p1label2 = new Label("Period(Months):");    //Auto loan cal(P) labels
        Label p1label3 = new Label("Interest rate(Annual):");    //Auto loan(P) cal labels
        Label p1label4 = new Label("Loan price:");    //Auto loan(P) cal labels
        p1label4.setLayoutX(60);
        p1label4.setLayoutY(300);
        Label p1label5=new Label();
        p1label5.setLayoutY(300);
        p1label5.setLayoutX(130);
        TextField p1txt1=new TextField();   // Auto loan cal(P) txtfields
        TextField p1txt2=new TextField();   // Auto loan cal(P) txtfieldsfields
        TextField p1txt3=new TextField();  // Auto loan cal(P) txtfields

        Button buttonp1=new Button("Calculate");    // Auto loan cal(P) calculate button
        buttonp1.setStyle("-fx-background-color:#00d8d6;-fx-font-size:1.2em;-fx-background-radius: 20; -fx-text-fill: black;");
        buttonp1.setPrefSize(100,20);
        buttonp1.setLayoutY(230);
        buttonp1.setLayoutX(90);
        VBox vBoxp1 = new VBox();
        vBoxp1.getChildren().addAll(p1label1 ,p1label2,p1label3);//add to //Auto loan(P) cal labels to vbox
        vBoxp1.setSpacing(35);
        vBoxp1.setLayoutX(60);
        vBoxp1.setLayoutY(60);
        VBox vBoxp2 = new VBox();
        vBoxp2.getChildren().addAll(p1txt1,p1txt2,p1txt3);
        vBoxp2.setSpacing(30);
        vBoxp2.setLayoutX(200);
        vBoxp2.setLayoutY(60);

        buttonp1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Double Auto_PMT3 = Double.parseDouble(p1txt1.getText());//get PMT
                    Double Auto_T3 = Double.parseDouble(p1txt2.getText());//get period
                    Double Auto_R3 = Double.parseDouble(p1txt3.getText());//get interest rate

                    Double Auto_P = (Auto_PMT3*1200/Auto_R3)*(1-1/Math.pow(1+Auto_R3/1200,Auto_T3))  ;
                    String.valueOf(Auto_P);
                    p1label5.setText(String.valueOf(Auto_P));
                    save1(p1txt1,p1txt2,p1txt3,p1label5,"Principal amount","Period","Interest Rate","Principal amount");
                }
                catch(NumberFormatException e){
                    Alert a12 = new Alert(Alert.AlertType.ERROR);
                    a12.setContentText("Please enter valid inputs!!!");
                    a12.setTitle("Error message");
                    a12.showAndWait();
                }
            }
        });

        Pane loan_P = new Pane();
        loan_P.setStyle("-fx-background-color:rgb(200, 214, 229)");
        loan_P .getChildren().addAll( vBoxp1,vBoxp2, buttonp1, p1label4, p1label5);

//------------------------------------------------------------------------------------
        Label label5 = new Label("");//History button label
        label5.setLayoutX(50);
        label5.setLayoutY(40);
        Pane pane8 = new Pane();
        pane8.setStyle("-fx-background-color:rgb(200, 214, 229)");
        pane8.getChildren().addAll(label5);

        BorderPane borderPane = new BorderPane();//Structure of a interface
        borderPane.setTop(hBox);
        borderPane.setCenter(pane1);
        borderPane.setRight(null);

        Scene scene = new Scene(borderPane, 800, 500);//create a scene
        primaryStage.setTitle("Calculater");
        primaryStage.setScene(scene);
        primaryStage.show();
//-------------------------------------------------------------------------------------------------------//
        Pane pane9=new Pane();//key board
        pane9.setStyle("-fx-background-color:rgb(200, 214, 229)");
        Button bn1=new Button("1"); //keyboard button 1
        bn1.setPrefSize(60,60);
        bn1.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");

        bn1.setFocusTraversable(false);
        bn1.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"1");
        });

        Button bn2=new Button("2"); //keyboard button 2
        bn2.setPrefSize(60,60);
        bn2.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn2.setFocusTraversable(false);
        bn2.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"2");
        });
        Button bn3=new Button("3");// keyboard button 3
        bn3.setPrefSize(60,60);
        bn3.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn3.setFocusTraversable(false);
        bn3.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"3");
        });
        HBox hBox7=new HBox();
        hBox7.setSpacing(8);
        hBox7.getChildren().addAll(bn1,bn2,bn3);
        hBox7.setLayoutX(100);
        hBox7.setLayoutY(50);

        Button bn4=new Button("4"); //keyboard button 4
        bn4.setPrefSize(60,60);
        bn4.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn4.setFocusTraversable(false);
        bn4.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"4");
        });
        Button bn5=new Button("5"); //keyboard button 5
        bn5.setPrefSize(60,60);
        bn5.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn5.setFocusTraversable(false);
        bn5.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"5");
        });
        Button bn6=new Button("6"); //keyboard button 6
        bn6.setPrefSize(60,60);
        bn6.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn6.setFocusTraversable(false);
        bn6.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"6");
        });
        HBox hBox8=new HBox();
        hBox8.setSpacing(8);
        hBox8.getChildren().addAll(bn4,bn5,bn6);
        hBox8.setLayoutX(100);
        hBox8.setLayoutY(110);

        Button bn7=new Button("7"); //keyboard button 7
        bn7.setPrefSize(60,60);
        bn7.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn7.setFocusTraversable(false);
        bn7.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"7");
        });
        Button bn8=new Button("8"); //keyboard button 8
        bn8.setPrefSize(60,60);
        bn8.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn8.setFocusTraversable(false);
        bn8.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"8");
        });
        Button bn9=new Button("9"); //keyboard button 9
        bn9.setPrefSize(60,60);
        bn9.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn9.setFocusTraversable(false);
        bn9.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"9");
        });
        HBox hBox9=new HBox();
        hBox9.setSpacing(8);
        hBox9.getChildren().addAll(bn7,bn8,bn9);
        hBox9.setLayoutX(100);
        hBox9.setLayoutY(170);

        Button bn10=new Button("0"); //keyboard button 9
        bn10.setPrefSize(60,60);
        bn10.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn10.setFocusTraversable(false);
        bn10.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+"0");
        });
        Button bn11=new Button(".");
        bn11.setPrefSize(60,60);
        bn11.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");
        bn11.setFocusTraversable(false);
        bn11.setOnAction(event -> {
            TextField txt=(TextField)scene.getFocusOwner();
            txt.setText(txt.getText()+".");
        });
        Button bn12=new Button("C");
        bn12.setPrefSize(60,60);
        bn12.setStyle("-fx-background-color:#2f3542;-fx-font-size:2em;-fx-background-radius: 20; -fx-text-fill: white;");

        HBox hBox10=new HBox();

        hBox10.getChildren().addAll(bn10,bn11,bn12);
        hBox10.setSpacing(8);
        hBox10.setLayoutX(100);
        hBox10.setLayoutY(230);
        pane9.getChildren().addAll(hBox7,hBox8,hBox9,hBox10);

//-----------------------------------------------------------------------------------------------------------//
        //main Buttons on actions
        button1.setOnAction(event -> {//Home button
            borderPane.setCenter(pane1);
           borderPane.setRight(null);
            borderPane.setLeft(null);
        });

        button2.setOnAction(event -> {//Mortgage button
            borderPane.setCenter(pane2);
            borderPane.setRight(pane9);
            borderPane.setLeft(morgage11);
        });

                mortgage1.setOnAction(event -> {//To find PMTT
                    borderPane.setCenter(pane2);
                });
                mortgage2.setOnAction(event -> {  //To find T
                    borderPane.setCenter(mortgage22);
                });
                mortgage3.setOnAction(event -> {  //To find P
                    borderPane.setCenter(mortgage_p_pane);
                });

        button3.setOnAction(event -> { //Compound savings  button
            borderPane.setCenter(pane3);
            borderPane.setRight(pane9);
            borderPane.setLeft( paneleft);
        });

                bt1.setOnAction(event -> {  //To find future value
                    borderPane.setCenter(pane3);
                    borderPane.setRight(pane9);
                });

                bt3.setOnAction(event -> {
                    borderPane.setCenter(pane6);
                });
                bt4.setOnAction(event -> {    //To find period
                    borderPane.setCenter(pane5);
                });
                bt5.setOnAction(event -> {   //To find start principa
                    borderPane.setCenter(pane10);
                });

        button4.setOnAction(event -> {//Loan button
            borderPane.setCenter(pane7);
            borderPane.setRight(pane9);
            borderPane.setLeft(loanpane);
        });
                bmonthly.setOnAction(event -> {
                    borderPane.setCenter(pane7);//to find PMT
                });

                bterm.setOnAction(event -> {//To find period
                    borderPane.setCenter(loan_T);
                });

                btAuto.setOnAction(event -> {  //to find auto loan price
                    borderPane.setCenter(loan_P);
                });

        button5.setOnAction(event -> {   //History button
            read(label5);
            borderPane.setCenter(pane8);
            borderPane.setRight(null);
            borderPane.setLeft(null);
    });

        button6.setOnAction(event -> {  //Fixed deposit
            borderPane.setCenter(fd_pane1);
            borderPane.setLeft(fdleft);
            borderPane.setRight(pane9);
        });
                fdb1.setOnAction(event -> {  //Find future value
                    borderPane.setCenter(fd_pane1);
                });
                fdb2.setOnAction(event -> {
                    borderPane.setCenter(fd_pane2);   //Find interest rate
                });
                fdb3.setOnAction(event -> {
                    borderPane.setCenter(fd_pane3);    //to find period
                });
                fdb4.setOnAction(event -> {    //to find start principal
                    borderPane.setCenter(fd_pane4);
                });

    }
    //-------------------------------------------------------------------------------------------//
    public void save(TextField txt1, TextField txt2, TextField txt3, TextField txt4,Label lb,String st1, String st2, String st3, String st4,String st5) {
        File file = new File("corsework.txt");//To write a file-store data in a file
        FileWriter fwriter;
        PrintWriter pWriter;

        try {
            fwriter = new FileWriter(file, true);
            pWriter = new PrintWriter(fwriter, true);

            pWriter.println(st1 + "=" + txt1.getText());
            pWriter.println(st2 + "=" + txt2.getText());
            pWriter.println(st3 + "=" + txt3.getText());
            pWriter.println(st4 + "=" + txt4.getText());
            pWriter.println(st5 + "=" + lb.getText());
            pWriter.println("***********************");
            pWriter.close();

        } catch (IOException e) {
            System.out.println("Somrthing went wrong!!!");
        }
    }
        public void save1(TextField tt1, TextField tt2, TextField tt3,Label lbl,String st5, String st6, String st7, String st8) {
            File file = new File("corsework.txt");
            FileWriter fwriter;
            PrintWriter pWriter;

            try{
                fwriter = new FileWriter(file, true);
                pWriter = new PrintWriter(fwriter, true);

                pWriter.println(st5 + "=" + tt1.getText());
                pWriter.println(st6 + "=" + tt2.getText());
                pWriter.println(st7 + "=" + tt3.getText());
                pWriter.println(st8 + "=" + lbl.getText());

                pWriter.close();

            } catch (IOException e) {
                System.out.println("Something went wrong!!!");
            }

        }
    public void read(Label La1){
        try {
            FileReader fReader=new FileReader("corsework.txt");//To read stored data
            BufferedReader breader=new BufferedReader(fReader);
            String string;
            while((string=breader.readLine())!=null){
                String get=La1.getText();
                La1.setText(get+string+"\n");
            }
            breader.close();
        }catch (IOException e){
            System.out.println("File is not found");
        }
    }

}












