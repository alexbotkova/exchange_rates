package cz.alexbotkova.exchange_rates;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Service
public class ExchangeRatesService {
    private static final String EXCHANGE_RATES_URL = "https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e";
    private final RestTemplate restTemplate;
    private final ExchangeRatesRepository exchangeRatesRepository;

    public List<ExchangeRates> getRates(boolean useDb) {
        if (useDb) {
            return (List<ExchangeRates>) exchangeRatesRepository.findAll();
        } else {
            ExchangeRates[] ratesArray = restTemplate.getForObject(EXCHANGE_RATES_URL, ExchangeRates[].class);
            if (ratesArray == null) {
                return new ArrayList<>();
            }
            List<ExchangeRates> ratesList = Arrays.asList(ratesArray);
            exchangeRatesRepository.saveAll(ratesList);
            return ratesList;
        }
    }
}