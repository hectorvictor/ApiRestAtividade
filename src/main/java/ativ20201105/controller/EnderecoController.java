package ativ20201105.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ativ20201105.entity.Endereco;
import ativ20201105.repository.EnderecoRepository;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController extends BaseController<Endereco, EnderecoRepository>{
}
