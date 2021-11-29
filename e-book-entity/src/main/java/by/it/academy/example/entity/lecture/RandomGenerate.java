package by.it.academy.example.entity.lecture;

import by.it.academy.example.generate.IdGenerate;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter @Setter
@Table(name = "random_generate", schema = "lecture18")
public class RandomGenerate {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @SequenceGenerator(name = "seq", sequenceName = "serial", allocationSize = 1)
    @Column(name = "random_id_sequence", unique = true, updatable = false)
    public Long sequenceId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom")
    @GenericGenerator(name = "custom", strategy = "by.it.academy.example.generate.IdGenerate.java",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = IdGenerate.VALUE_PREFIX_PARAMETER, value = "Id_"),
                    @org.hibernate.annotations.Parameter(name = IdGenerate.NUMBER_FORMAT_PARAMETER, value = "%02d")})
    @Column(name = "random_id_custom", unique = true, updatable = false)
    private String customId;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "random_name_uuid", unique = true, updatable = false)
    public UUID uuId;

    @Transient
    @Formula(value = "random_id_custom" + "random_name_uuid")
    public String idOneAndTwo;

}

