package br.infnet.edu.mbs.tp1_calc.repository;

import br.infnet.edu.mbs.tp1_calc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

