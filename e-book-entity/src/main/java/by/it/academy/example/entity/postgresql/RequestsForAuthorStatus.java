package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@Getter @Setter
public class RequestsForAuthorStatus {

    @Column
    public Long userId;

    @Column
    public String userName;

    @Column
    public String dataMassage;

    @Column
    public ArrayList<String> firstOrTestBookTxt;

    @Column
    public String idReviewer;
}
