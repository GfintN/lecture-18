package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
public class SubAdminDeleteRequests {

    @Column
    public Long id;

    @Column
    public String causeDismissal;

    @Column
    public Date requestsDate;


}
