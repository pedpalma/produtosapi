package com.example.produtosapi.repository;

import com.example.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}


