package cz.alexbotkova.exchange_rates;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class ExchangeRates {
    @Id
    private String shortName;
    private LocalDateTime validFrom;
    private String name;
    private String country;
    private double move;
    private int amount;
    private double valBuy;
    private double valSell;
    private double valMid;
    private double currBuy;
    private double currSell;
    private double currMid;
    private int version;
    private double cnbMid;
    private double ecbMid;
}
