package ma.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}