package Main;

import Controller.ModeratorController;
import Moodel.Moderator;
import Persistance.ModeratorRepo;
import Service.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainRun extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("LoginMod.fxml"));
        Parent root = loader.load();
        ModeratorController ctr = loader.getController();
        ModeratorRepo ModRepo = new ModeratorRepo();
        for (Moderator M : ModRepo.findAll())
            System.out.println(M.getUsername());
        Service serv = new Service();
        serv.setModRepository(ModRepo);
        ctr.setService(serv);


        Scene scene = new Scene(root);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
