package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter @Getter
public class Books {
    @Column(nullable = false)
    public String bookName;
    @Immutable
    @Column
    public Date dateOfCreate;
    @Id
    @Column
    public String addressInSite;
    @Column(insertable = false)
    public Short averageRating;
}
