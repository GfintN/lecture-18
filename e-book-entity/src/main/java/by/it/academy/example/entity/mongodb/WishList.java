package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Getter @Setter
public class WishList {

    @Immutable
    @Column
    public Long userId;

    @Column(nullable = false)
    public String bookName;

}
