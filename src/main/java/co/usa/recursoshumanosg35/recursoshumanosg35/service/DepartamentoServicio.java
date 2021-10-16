package co.usa.recursoshumanosg35.recursoshumanosg35.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursoshumanosg35.recursoshumanosg35.model.Departamento;
import co.usa.recursoshumanosg35.recursoshumanosg35.repository.DepartamentoRepositorio;

@Service
public class DepartamentoServicio {
    @Autowired
    DepartamentoRepositorio departamentoRepositorio;

    public List<Departamento> getAll(){
        return departamentoRepositorio.getAll();
    }

    public Optional<Departamento>getDepartamento(int id){
        return departamentoRepositorio.getDepartamento(id);
    }

    public Departamento saveDepartamento(Departamento dpto){
        //verificar si el id es nulo
        if (dpto.getNumId()==null) {
            return departamentoRepositorio.saveDepartamento(dpto);            
        }else{
            Optional<Departamento> consulta=departamentoRepositorio.getDepartamento(dpto.getNumId());
            
            if (consulta.isEmpty()) {
                return departamentoRepositorio.saveDepartamento(dpto);
            } else {
                return dpto;
            }
        }
    }
}
