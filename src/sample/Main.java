package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.event.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
public class Main extends Application {
    static int flag=1;
    String s=new String();
    int count = 1,i=0,j=0,l=0,k=0;
    boolean status=false;

    private void test(){
       // System.out.println("this is a test");
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Canvas cv = new Canvas(400, 400);
        GraphicsContext gc = cv.getGraphicsContext2D();
        gc.strokeLine(100.0, 0.0, 100, 300.0);
        gc.strokeLine(0.0, 100.0, 300, 100.0);
        gc.strokeLine(0.0, 200.0, 300, 200.0);
        gc.strokeLine(200.0, 0.0, 200, 300.0);
        Pane root=new Pane();


        String a[][] = new String[][]{{null,null,null},{null,null,null},{null,null,null}};
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        cv.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
                                 @Override
                                 public void handle(javafx.scene.input.MouseEvent event) {
                                     Canvas c = (Canvas) event.getSource();
                                     GraphicsContext g = c.getGraphicsContext2D();
                                     double x = event.getSceneX();
                                     double y = event.getSceneY();
                                     System.out.println("start new");
                                     if (x > 0 && x <= 100) {
                                         if (y > 0 && y <= 100) {

                                             if (hm.get(1) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(1, "X");
                                                         g.fillText("X", 50.0, 50.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(1, "O");
                                                         g.fillText("O", 50.0, 50.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }
                                         if (y > 100 && y <= 200) {
                                             s = hm.get(4);
                                             System.out.println(s + " at 4" + flag);
                                             if (s == null)

                                             {
                                                 System.out.println("test" + flag);
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(4, "X");
                                                         g.fillText("X", 50.0, 150.0);
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(4, "O");
                                                         g.fillText("O", 50.0, 150.0);
                                                         flag = 1;
                                                         break;

                                                 }

                                             }
                                         }

                                         if (y > 200 && y <= 300) {
                                             if (hm.get(7) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(7, "X");
                                                         g.fillText("X", 50.0, 250.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(7, "O");
                                                         g.fillText("O", 50.0, 250.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }

                                         }

                                     }
                                     if (x > 100 && x <= 200) {
                                         if (y > 0 && y <= 100) {
                                             if (hm.get(2) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(2, "X");
                                                         g.fillText("X", 150.0, 50.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(2, "O");
                                                         g.fillText("O", 150.0, 50.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }

                                         if (y > 100 && y <= 200) {
                                             if (hm.get(5) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(5, "X");
                                                         g.fillText("X", 150.0, 150.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(5, "O");
                                                         g.fillText("O", 150.0, 150.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }

                                         if (y > 200 && y <= 300) {
                                             if (hm.get(8) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(8, "X");
                                                         g.fillText("X", 150.0, 250.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(8, "O");
                                                         g.fillText("O", 150.0, 250.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }

                                     }
                                     if (x > 200 && x <= 300) {
                                         if (y > 0 && y <= 100) {
                                             if (hm.get(3) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(3, "X");
                                                         g.fillText("X", 250.0, 50.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(3, "O");
                                                         g.fillText("O", 250.0, 50.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }
                                         if (y > 100 && y <= 200) {
                                             if (hm.get(6) == null) {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(6, "X");
                                                         g.fillText("X", 250.0, 150.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(6, "O");
                                                         g.fillText("O", 250.0, 150.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }
                                         if (y > 200 && y <= 300)

                                         {
                                             if (hm.get(9) == null)
                                             {
                                                 System.out.println("test");
                                                 switch (flag) {
                                                     case 1:
                                                         hm.put(9, "X");
                                                         g.fillText("X", 250.0, 250.0);
                                                         System.out.println(hm.get(1));
                                                         flag = 0;
                                                         break;
                                                     case 0:
                                                         hm.put(9, "O");
                                                         g.fillText("O", 250.0, 250.0);
                                                         flag = 1;
                                                         break;

                                                 }
                                             }
                                         }

                                     }

                                     test();
                                   System.out.println("size is"+hm.size());
                                     if(hm.size()==9)
                                     {
                                         System.out.println("hashmap filled");

                                         for (i = 0; i < 3; i++) {
                                             for (j = 0; j < 3; j++) {
                                                 a[i][j] = hm.get(count);
                                                 count++;
                                                 System.out.println("Elements are"+ a[i][j]);
                                                 if (count == 10)
                                                     break;
                                             }
                                         }
                                        for( k=0;k<3;k++) {
                                            if (a[k][l].equals(a[k][l + 1]) && a[k][l + 1].equals(a[k][l + 2])) {
                                                status=true;
                                                if (a[k][l].equals("X"))
                                                    g.fillText("Player 1 Wins", 50.0, 350.0);
                                                else if (a[k][l].equals("O"))
                                                    g.fillText("Player 2 Wins", 50.0, 350.0);
                                            }
                                        }

                                        k=0;
                                        System.out.println("K is "+k+"l is"+l);
                                        for(l=0;l<3;l++)
                                        {
                                            if(a[k][l].equals(a[k+1][l]) && a[k+1][l].equals(a[k+2][l]))
                                            {
                                                status=true;
                                                if (a[k][l].equals("X"))
                                                    g.fillText("Player 1 Wins", 50.0, 350.0);
                                                else if (a[k][l].equals("O"))
                                                    g.fillText("Player 2 Wins", 50.0, 350.0);
                                        }
                                        }
                                        k=0;l=0;
                                        if(a[k][l].equals(a[k+1][l+1]) && a[k+1][l+1].equals(a[k+2][l+2]))
                                        {
                                            status=true;
                                            if (a[k][l].equals("X"))
                                                g.fillText("Player 1 Wins", 50.0, 350.0);
                                            else if (a[k][l].equals("O"))
                                                g.fillText("Player 2 Wins", 50.0, 350.0);
                                        }
                                         if(a[k+2][l].equals(a[k+1][l+1]) && a[k+1][l+1].equals(a[k][l+2]))
                                         {
                                             status=true;
                                             if (a[k+1][l+1].equals("X"))
                                                 g.fillText("Player 1 Wins", 50.0, 350.0);
                                             else if (a[k+1][l+1].equals("O"))
                                                 g.fillText("Player 2 Wins", 50.0, 350.0);
                                         }
                                         if(status==false)
                                             g.fillText("It is a draw",50.0,350.0);

                                     }


                                     }




                             }
        );
        Button b=new Button("Play Again");
       root.getChildren().add(cv);
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {

        launch(args);
    }
}
