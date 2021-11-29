package by.it.academy.example.entity.postgresql;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
public class BookBuyTransaction {

    @Column
    public Date timeStartTransaction;

    @Column
    public Long userId;

    @Column
    public Long boolOutMoney;

    @Column
    public Long boolInpMoney;

    @Column
    public Date timeEndTransaction;

    @Column
    public String idBuy;

}
