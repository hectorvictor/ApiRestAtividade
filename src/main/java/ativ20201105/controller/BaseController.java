package ativ20201105.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// O professor caso do generics REPOSITORY não consegui fazer QueryNative nos repositorios das entidades
//@Query("select* from Entidade")
// List<Entidade> findAllEntidade 

// No post eu usei o toString para retornar o Id

public class BaseController<C, REPOSITORY extends JpaRepository<C, String>> {

	@Autowired
	private REPOSITORY repo;

	@GetMapping
	public List<C> getAll() {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public C getById(@PathVariable String id) {
		return repo.findById(id).get();
	}

	@PostMapping
	public String post(@RequestBody C novo) {
		if (repo.existsById(novo.toString())) {
			throw new IdExistenteException();
		}
		novo = repo.save(novo);
		return novo.toString();
	}
	
	//adicionar endereco / roupas a loja e atualizar
	@PostMapping("/add")
	public String postAdd(@RequestBody C novo) {
		if (!repo.existsById(novo.toString())) {
			throw new IdDiferenteException();
		}
		novo = repo.save(novo);
		return novo.toString();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable String id) {
		repo.deleteById(id);
	}

	@PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody C novo) {
		if (!id.equals(novo.toString())) {
			throw new IdsDivergentesException();
		}
		if (!repo.existsById(novo.toString())) {
			throw new IdExistenteException();
		}
		repo.save(novo);
	}
}
