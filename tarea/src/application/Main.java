package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(35);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(65);
        gridPane.getColumnConstraints().addAll(col1, col2);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(70);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(30);
        gridPane.getRowConstraints().addAll(row1, row2);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS); 
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); 

        VBox imageBox = new VBox();
        
        Image icono1 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono1.png");
        ImageView imageView1 = new ImageView(icono1);
        imageView1.setFitHeight(50); 
        imageView1.setFitWidth(50);
        Label label1 = new Label("JUAN PEPITO");
        VBox.setMargin(label1, new Insets(5));
        
        Image icono2 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono2.png");
        ImageView imageView2 = new ImageView(icono2);
        imageView2.setFitHeight(50); 
        imageView2.setFitWidth(50); 
        Label label2 = new Label("NICOLE ARMIJOS");
        VBox.setMargin(label2, new Insets(5));
        
        Image icono3 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono3.png");
        ImageView imageView3 = new ImageView(icono3);
        imageView3.setFitHeight(50); 
        imageView3.setFitWidth(50); 
        Label label3 = new Label("JAMILET BRAVO");
        VBox.setMargin(label3, new Insets(5));
        
        Image icono4 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono4.png");
        ImageView imageView4 = new ImageView(icono4);
        imageView4.setFitHeight(50); 
        imageView4.setFitWidth(50); 
        Label label4 = new Label("SIMBA CEMENTO");
        VBox.setMargin(label4, new Insets(5));
        
        Image icono5 = new Image("file:///C:/Users/kbasu/eclipse-workspace/tarea/src/application/icono5.png");
        ImageView imageView5 = new ImageView(icono5);
        imageView5.setFitHeight(50); 
        imageView5.setFitWidth(50); 
        Label label5 = new Label("KENY BASURTO");
        VBox.setMargin(label5, new Insets(5));

        label1.setAlignment(Pos.CENTER);
        label2.setAlignment(Pos.CENTER);
        label3.setAlignment(Pos.CENTER);
        label4.setAlignment(Pos.CENTER);
        label5.setAlignment(Pos.CENTER);

        Border border = new Border(new BorderStroke(
                Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));
        
        HBox hbox1 = new HBox(imageView1, label1);
        hbox1.setAlignment(Pos.CENTER_LEFT); 
        hbox1.setSpacing(10); 
        hbox1.setPadding(new Insets(5));
        hbox1.setBorder(border);
        HBox hbox2 = new HBox(imageView2, label2);
        hbox2.setAlignment(Pos.CENTER_LEFT); 
        hbox2.setSpacing(10); 
        hbox2.setPadding(new Insets(5)); 
        hbox2.setBorder(border);
        HBox hbox3 = new HBox(imageView3, label3);
        hbox3.setAlignment(Pos.CENTER_LEFT); 
        hbox3.setSpacing(10); 
        hbox3.setPadding(new Insets(5));
        hbox3.setBorder(border);
        HBox hbox4 = new HBox(imageView4, label4);
        hbox4.setAlignment(Pos.CENTER_LEFT); 
        hbox4.setSpacing(10); 
        hbox4.setPadding(new Insets(5)); 
        hbox4.setBorder(border);
        HBox hbox5 = new HBox(imageView5, label5);
        hbox5.setAlignment(Pos.CENTER_LEFT); 
        hbox5.setSpacing(10); 
        hbox5.setPadding(new Insets(5));
        hbox5.setBorder(border);
        
        imageBox.getChildren().add(hbox1);
        imageBox.getChildren().add(hbox2);
        imageBox.getChildren().add(hbox3);
        imageBox.getChildren().add(hbox4);
        imageBox.getChildren().add(hbox5);

        scrollPane.setContent(imageBox);

        gridPane.add(scrollPane, 0, 0, 1, 2);

        ListView<String> listView = new ListView<>();
 
        gridPane.add(listView, 1, 0, 1, 1);
        listView.setBorder(border);

        TextField textField = new TextField();
        textField.setText("");
        gridPane.add(textField, 1, 1, 1, 1);
        textField.setBorder(border);

        Scene scene = new Scene(gridPane, 800, 600);
        primaryStage.setTitle("Interface usando layouts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}