package by.it.academy.example.entity.lecture;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "name"))
})
@Getter @Setter
@Table(name = "book", schema = "lecture18")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
    @Column
    public Long id;

    @Column(nullable = false)
    public String name;

    @OneToOne(mappedBy = "book")
    @MapsId
    private Review review;
}
