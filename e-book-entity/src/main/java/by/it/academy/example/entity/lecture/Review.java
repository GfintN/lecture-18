package by.it.academy.example.entity.lecture;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Embeddable
@AttributeOverrides({
        @AttributeOverride(name = "massage", column = @Column(name = "massage")),
        @AttributeOverride(name = "rating", column = @Column(name = "rating"))
})
@Getter @Setter
@Table(name = "review", schema = "lecture18")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
    @Column
    public Long id;

    @Column(updatable = false)
    public String massage;

    @Column(nullable = false)
   // @Enumerated(EnumType.STRING) or this
    @Convert(converter = Converter.class)
    private Rating rating;

    @Column(name = "book_id", nullable = false)
    public Long bookId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    public Book book;

}
