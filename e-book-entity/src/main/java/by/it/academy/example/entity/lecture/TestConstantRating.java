package by.it.academy.example.entity.lecture;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table (name = "test_constant_rating", schema = "lecture18")
public class TestConstantRating {

    @Column (updatable = false)
    public Short rating;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rating", referencedColumnName = "rating")
    public ConstantRating constantRating;
}
