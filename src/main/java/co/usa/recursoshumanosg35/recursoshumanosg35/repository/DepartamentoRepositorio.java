package co.usa.recursoshumanosg35.recursoshumanosg35.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursoshumanosg35.recursoshumanosg35.model.Departamento;
import co.usa.recursoshumanosg35.recursoshumanosg35.repository.crud.DepartamentoCrudRepositorio;

@Repository
public class DepartamentoRepositorio {
    @Autowired
    DepartamentoCrudRepositorio departamentoCrudRepositorio;

    public List<Departamento>getAll(){
        return (List<Departamento>) departamentoCrudRepositorio.findAll();
    }
    
    public Optional<Departamento>getDepartamento(int id){
        return departamentoCrudRepositorio.findById(id);
    }

public Departamento saveDepartamento(Departamento dpto){
    return departamentoCrudRepositorio.save(dpto);
}
}
