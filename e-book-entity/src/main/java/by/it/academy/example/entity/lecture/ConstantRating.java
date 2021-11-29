package by.it.academy.example.entity.lecture;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Immutable
@Getter
@Table(name = "constant_rating", schema = "lecture18")
public class ConstantRating {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
   @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
   @Column(unique = true, insertable = false, nullable = false, name = "rating")
   private Short rating;

   @OneToOne(mappedBy = "constant_rating")
   private TestConstantRating testConstantRating;
}
