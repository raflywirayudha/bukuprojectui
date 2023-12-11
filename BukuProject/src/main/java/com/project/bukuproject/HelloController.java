package com.project.bukuproject;

import com.project.bukuproject.Model.Buku;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Controller untuk tampilan utama.
 */
public class HelloController implements Initializable {

    @FXML
    private HBox cardLayout;

    @FXML
    private GridPane bookContainer;

    private List<Buku> recentlyAdded;
    private List<Buku> recommended;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        recentlyAdded = recentlyAdded();
        recommended = new ArrayList<>(books());

        loadCardLayout();
        loadBookContainer();
    }

    /**
     * Memuat tata letak kartu ke dalam cardLayout.
     */
    private void loadCardLayout() {
        try {
            for (Buku buku : recentlyAdded) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("card.fxml"));
                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(buku);
                cardLayout.getChildren().add(cardBox);
            }
        } catch (IOException e) {
            handleLoadError(e);
        }
    }

    /**
     * Memuat tata letak buku ke dalam bookContainer.
     */
    private void loadBookContainer() {
        int column = 0;
        int row = 1;

        try {
            for (Buku buku : recommended) {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("book.fxml"));
                VBox bookBox = fxmlLoader.load();
                BookController bookController = fxmlLoader.getController();
                bookController.setData(buku);

                if (column == 6) {
                    column = 0;
                    ++row;
                }

                bookContainer.add(bookBox, column++, row);
                GridPane.setMargin(bookBox, new Insets(10));
            }
        } catch (IOException e) {
            handleLoadError(e);
        }
    }

    /**
     * Menangani kesalahan saat memuat tata letak.
     *
     * @param e Exception yang ditangkap
     */
    private void handleLoadError(IOException e) {
        e.printStackTrace();
        // Lakukan penanganan kesalahan yang sesuai, seperti menampilkan pesan kesalahan kepada pengguna
    }

    /**
     * Menghasilkan daftar buku yang baru-baru ini ditambahkan.
     *
     * @return List of recently added books
     */
    private List<Buku> recentlyAdded() {
        // Implementasi logika untuk mendapatkan buku yang baru-baru ini ditambahkan
        List<Buku> ls = new ArrayList<>();
        Buku buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);
        return ls;
    }

    /**
     * Menghasilkan daftar buku yang direkomendasikan.
     *
     * @return List of recommended books
     */
    private List<Buku> books() {
        // Implementasi logika untuk mendapatkan buku yang direkomendasikan
        List<Buku> ls = new ArrayList<>();
        Buku buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("PANTASKAH OJK\nDIBUBARKAN?");
        buku.setImgSrc("/img/buku1.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Dr. Hadi Utomo");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("50 PRAYERS FROM\nTHE HOLY QUR'AN");
        buku.setImgSrc("/img/buku2.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("A.K");
        ls.add(buku);

        buku = new Buku();
        buku.setNama("SHERLOCK");
        buku.setImgSrc("/img/buku3.jpg"); // Pastikan path relatif sesuai dengan struktur proyek Anda
        buku.setPenulis("Hartswood Films");
        ls.add(buku);
        return ls;
    }
}
