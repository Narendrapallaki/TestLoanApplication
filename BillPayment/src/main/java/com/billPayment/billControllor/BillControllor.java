package com.billPayment.billControllor;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.billPayment.entity.Order;

@RestController
public class BillControllor {

	@Autowired
	private KieContainer kieContainer;

	
	@PostMapping("/post")
	public ResponseEntity<Order> post(@RequestBody Order order) {
		KieSession kieSession = kieContainer.newKieSession();

		kieSession.insert(order);
		kieSession.fireAllRules();
		kieSession.dispose();

		return ResponseEntity.ok(order);

	}

}
