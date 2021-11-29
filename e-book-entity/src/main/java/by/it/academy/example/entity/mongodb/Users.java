package by.it.academy.example.entity.mongodb;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Users {
   @Id
   @Column
   public Long id;

   @Column(nullable = false)
   public String mail;

   @Column(nullable = false)
   public String username;

   @Column(nullable = false)
   public String password;

   @Column
   @Embedded
   public Status status;
}
