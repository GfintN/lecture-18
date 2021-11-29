package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class BookAndAuthor {
    @Id
    @Column
    public String authorMail;

    @Column(nullable = false)
    public String bookName;

    @Immutable
    @Column
    public Date dateOfCreateBook;
}
