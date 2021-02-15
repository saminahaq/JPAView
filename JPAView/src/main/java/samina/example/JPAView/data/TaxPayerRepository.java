package samina.example.JPAView.data;

import org.springframework.data.jpa.repository.JpaRepository;

import samina.example.JPAView.model.TaxPayer;

public interface TaxPayerRepository extends JpaRepository<TaxPayer
, Long> {

}