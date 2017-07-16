package sample;

import javafx.fxml.FXML;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private MediaView playerView;
    private MediaPlayer player;
    private Media videoFile;

    private static Stage stage;

    public void openFile(){
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(stage);
        if(file != null){
            videoFile = new Media(file.toURI().toString());
            player = new MediaPlayer(videoFile);
            player.setAutoPlay(true);
            playerView.setMediaPlayer(player);
        }
    }

    public static void setStage(Stage stage) {
        Controller.stage = stage;
    }

    public void magarac(){
        System.out.printf("dsasdasda");
    }

    public void pause(){
        player.pause();
    }

    public void play(){
        player.play();
    }
}
