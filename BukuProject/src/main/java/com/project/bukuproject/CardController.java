package com.project.bukuproject;

import com.project.bukuproject.Model.Buku;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Random;

public class CardController {

    @FXML
    private HBox box;

    @FXML
    private ImageView bookImage;

    @FXML
    private Label namaBuku;

    @FXML
    private Label namaPenulis;

    private String[] colors = {"B9E5FF", "BDB2FE", "FB9AA8", "FF5056"};

    public void setData(@NotNull Buku buku) {
        try {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(buku.getImgSrc())));
            bookImage.setImage(image);

            namaBuku.setText(buku.getNama());
            namaPenulis.setText(buku.getPenulis());
            setRandomBackgroundColor();
        } catch (NullPointerException | IllegalArgumentException e) {
            e.printStackTrace(); // Handle or log the exception based on your requirements.
        }
    }

    private void setRandomBackgroundColor() {
        String randomColor = getRandomColor();
        box.setStyle("-fx-background-color: #" + randomColor + "; " +
                "-fx-background-radius: 15; " +
                "-fx-effect: dropshadow(three-pass-box, rgba(0,0,0,0.1), 10, 0, 0, 10);");

    }

    private String getRandomColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
