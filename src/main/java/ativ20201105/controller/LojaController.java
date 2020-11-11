package ativ20201105.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ativ20201105.entity.Loja;
import ativ20201105.repository.LojaRepository;


@RestController
@RequestMapping("/api/lojas")
public class LojaController extends BaseController<Loja, LojaRepository>{	
	
}
