package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

@Entity
@Getter @Setter
public class SubAdminInfo {
    @Id
    @Column
    public Long id;

    @Column
    public Long userIdInMongo;

    @Column
    public String workingMail;

    @Transient
    public String firstName;

    @Transient
    public String surName;

    @Transient
    public String patronymic;

    @Column
    @Formula(value = "fx + sx + p")
    public String fullName;

    @Column
    public String macAddress;

    @Column
    public Short deleteSubAdminStatus; // 1 or 0
}
