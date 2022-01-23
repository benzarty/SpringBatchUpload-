package com.esprit.examen.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.item.ItemProcessor;
import com.esprit.examen.entities.Stock;

public class StockProcessor implements ItemProcessor<Stock, Stock> {
	@Override
	public Stock process(Stock stock) {
		
		stock.setDateAjout(stock.getDateAjout());
		stock.setLibelleStock(stock.getLibelleStock().toUpperCase());
		stock.setQte(stock.getQte());
		stock.setQteMin(stock.getQteMin());
		return stock;
	}
}
