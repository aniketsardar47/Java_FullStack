package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mmcoe.pojo.CurrencyExchange;
import com.mmcoe.pojo.ExchangeService;

@ExtendWith(MockitoExtension.class)
public class TestCurrencyExchange {
	
	/**
	 * @Mock creates a fake (stubbed) instance of the ExchangeService dependency.
	 * It prevents actual database or external API calls during testing.
	 * This fake object allows you to control exactly what its methods return.
	 */
	@Mock
	private ExchangeService service;
	
	/**
	 * @InjectMocks creates a real instance of the class you want to test (CurrencyExchange).
	 * It automatically looks for any available @Mock objects (like 'service' above).
	 * It then injects those mocks into this object, bypassing real dependencies.
	 */
	@InjectMocks
	private CurrencyExchange ex;
	
	/**
	 * The runner executes this block to verify a discrete unit of business logic.
	 */
	@Test
	public void testConvert() {
		when(service.usdToInr(100)).thenReturn(9100.0);
		
		double result = ex.convert(100);
		
		assertEquals(9100,result);
	}
}
