package cz.alexbotkova.exchange_rates;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class ExchangeRatesController {
    private final ExchangeRatesService exchangeRatesService;
    @GetMapping
    public List<ExchangeRates> getExchangeRates(@RequestParam boolean useDb) {
        return exchangeRatesService.getRates(useDb);
    }
}
