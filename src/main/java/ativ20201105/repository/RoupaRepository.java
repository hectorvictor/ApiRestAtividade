package ativ20201105.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ativ20201105.entity.Roupa;

public interface RoupaRepository extends JpaRepository<Roupa, String> {
	
	@Query(value = "select preco from roupas",nativeQuery = true)
	List<Double> getPrecos();
}
