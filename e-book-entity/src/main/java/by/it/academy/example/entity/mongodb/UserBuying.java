package by.it.academy.example.entity.mongodb;

import javax.persistence.Column;
import java.util.ArrayList;


public class UserBuying {
    @Column
    public Long userId;

    @Column
    public ArrayList<String> idBuyList;
}
