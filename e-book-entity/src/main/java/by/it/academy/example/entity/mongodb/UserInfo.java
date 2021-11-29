package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Getter @Setter
public class UserInfo {
    @Column
    public String firstName;

    @Column
    public String surName;

    @Column
    public Date dateOfBirth;

    @Column
    public String gender;

    @Id
    @Immutable
    @Column
    public Long idRegistration;

    @Transient
    @Formula(value = "fx + sx")
    public String fullName;

}
