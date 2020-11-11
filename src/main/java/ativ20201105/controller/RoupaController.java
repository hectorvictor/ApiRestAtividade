package ativ20201105.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ativ20201105.entity.Roupa;
import ativ20201105.repository.RoupaRepository;

@RestController
@RequestMapping("/api/roupas")
public class RoupaController extends BaseController<Roupa, RoupaRepository> {


}
