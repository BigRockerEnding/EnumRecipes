package org.jointheleague.enums;

import java.util.HashMap;
import java.util.Map;

public enum Coin {

	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);

	private final int value;
	
	Coin(int value) {
		this.value = value;
	}

    public int getValue() {
    	return value;
    }
    
    
    public static Map<Coin, Integer> getChange(int money) {
    	Map<Coin, Integer> change = new HashMap<>();
    	
    	int moneyLeft = money;
    	for (int i = values().length - 1; i >= 0; i--) {
    		Coin coinType = values()[i];
    		int coinValue = coinType.value;
    		int numCoin = moneyLeft / coinValue;
    		moneyLeft %= coinValue;
			
			change.put(coinType, numCoin);
		}
    	
    	return change;
    }

}
