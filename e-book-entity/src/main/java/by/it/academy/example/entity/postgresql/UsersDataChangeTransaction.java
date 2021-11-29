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
public class UsersDataChangeTransaction {
    @Id
    @Immutable
    @Column
    public Long userId;

    @Column (nullable = false)
    public Date date;

    @Column
    public String beforePassword;

    @Column
    public String newPassword;

    @Column
    public String beforeMail;

    @Column
    public String newMail;

    @Column
    public String beforeUsername;

    @Column
    public String newUsername;

    @Column
    public Date hiringDate;

}
