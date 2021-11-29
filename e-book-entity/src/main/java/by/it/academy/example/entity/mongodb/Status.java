package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "status", column = @Column(name = "status"))
})
@Getter
public class Status {
    @Id
    @OneToOne
    @Column
    private String statusName;
}
