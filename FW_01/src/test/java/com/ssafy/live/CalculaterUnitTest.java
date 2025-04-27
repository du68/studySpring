package com.ssafy.live;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculaterUnitTest {
	private Calculator calc;
	@BeforeEach
	public void setup() {
		calc = new Calculator();
	}//test는 항상 새로 만들기
	
	@Test
	@DisplayName("계산 결과 확인 +")
	public void addTest() {
		int a = 10;
		int b = 20;
		
		int result = calc.add(a, b);
		Assertions.assertEquals(30, result);
	}
}
