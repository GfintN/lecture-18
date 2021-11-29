package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@Getter @Setter
public class BookPublicationRequest {

    @Column
    public Long userId;

    @Column
    public String authorName;

    @Column
    public String bookName;

    @Column
    public ArrayList<String> txtFile;

    @Column
    public String idReviewer;
}
