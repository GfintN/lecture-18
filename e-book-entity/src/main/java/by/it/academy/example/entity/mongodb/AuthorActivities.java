package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter @Setter
public class AuthorActivities {
    @Column (nullable = false)
    public Date dateOfStart;
    @Column (nullable = false)
    public Date dateOfEnd;
    @Id
    @Column (nullable = false)
    public String authorName;
    @Column (nullable = false)
    public String address;
}
