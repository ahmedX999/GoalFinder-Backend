package ma.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.entities.Payment;
import ma.project.repositories.PaymentRepository;

@Service
public class PaymentService {
	
		@Autowired	
	 private PaymentRepository paymentRepository;

	    
	    public PaymentService(PaymentRepository paymentRepository) {
	        this.paymentRepository = paymentRepository;
	    }

	    public Payment savePayment(Payment payment) {
	        return paymentRepository.save(payment);
	    }

	    public Payment getPaymentById(Long id) {
	        Optional<Payment> optionalPayment = paymentRepository.findById(id);
	        return optionalPayment.orElse(null);
	    }

	    public List<Payment> getAllPayments() {
	        return paymentRepository.findAll();
	    }

	    public boolean deletePayment(Long id) {
	        Optional<Payment> optionalPayment = paymentRepository.findById(id);
	        if (optionalPayment.isPresent()) {
	            paymentRepository.deleteById(id);
	            return true; // Payment successfully deleted
	        }
	        return false; // Payment with the given ID does not exist
	    }
	    
	    public Payment updatePayment(Long id, Payment updatedPayment) {
	        Optional<Payment> optionalPayment = paymentRepository.findById(id);
	        if (optionalPayment.isPresent()) {
	            Payment existingPayment = optionalPayment.get();
	            // Update the existing payment with the new data
	            existingPayment.setEtat(updatedPayment.getEtat());
	            existingPayment.setPaymentMethod(updatedPayment.getPaymentMethod());
	            existingPayment.setAmount(updatedPayment.getAmount());
	            existingPayment.setUser(updatedPayment.getUser());
	            existingPayment.setField(updatedPayment.getField());

	            return paymentRepository.save(existingPayment);
	        }
	        return null; // If payment with the given ID doesn't exist
	    }

}
