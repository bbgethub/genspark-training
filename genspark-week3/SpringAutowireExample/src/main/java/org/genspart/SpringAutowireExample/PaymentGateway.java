package org.genspart.SpringAutowireExample;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentGateway {
		 
	private Order order;
    
    @Autowired
    public PaymentGateway(Order ord){
        this.order = ord;
    }
 
    @Override
    public String toString(){
        return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
	    }
}

