package com.project.bukuproject;

import com.project.bukuproject.Model.Buku;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BookController {
    @FXML
    private ImageView bookImage;

    @FXML
    private Label namaBuku;

    @FXML
    private Label namaPenulis;

    public void setData(@NotNull Buku buku) {
        try {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(buku.getImgSrc())));
            bookImage.setImage(image);

            namaBuku.setText(buku.getNama());
            namaPenulis.setText(buku.getPenulis());
        } catch (NullPointerException | IllegalArgumentException e) {
            e.printStackTrace(); // Handle or log the exception based on your requirements.
        }
    }
}
