package com.packt.patterninspring.chapter2.adapter.pattern;

/**
 * @author Dinesh.Rajput
 *
 */
public class AdapterPatternMain {

	public static void main(String[] args) {
		PaymentGateway paymentGateway = new PaymentGatewayImpl();
		AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
		String mobile1 = null;
		String mobile2 = null;
		advancedPayGateway.makePayment(mobile1, mobile2);
	}

}
