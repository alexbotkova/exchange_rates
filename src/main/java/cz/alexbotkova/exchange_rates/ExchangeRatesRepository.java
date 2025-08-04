package cz.alexbotkova.exchange_rates;

import org.springframework.data.repository.CrudRepository;

public interface ExchangeRatesRepository extends CrudRepository<ExchangeRates, String> { }