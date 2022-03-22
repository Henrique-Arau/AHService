package com.Henrique.AHService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Henrique.AHService.domain.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
