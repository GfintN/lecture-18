package by.it.academy.example.entity.lecture;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "book_and_review", schema = "lecture18")
public class BookAndReview {
    @Embedded
    private Book book;
    @Embedded
    private Review review;

}
