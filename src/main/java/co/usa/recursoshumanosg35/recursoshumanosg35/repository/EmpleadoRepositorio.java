package co.usa.recursoshumanosg35.recursoshumanosg35.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.usa.recursoshumanosg35.recursoshumanosg35.model.Empleado;
import co.usa.recursoshumanosg35.recursoshumanosg35.repository.crud.EmpleadoCrudRepositorio;

@Repository
public class EmpleadoRepositorio {
    @Autowired
    private EmpleadoCrudRepositorio empleadoCrudRepositorio;

    public List<Empleado>getAll(){
        return (List<Empleado>)empleadoCrudRepositorio.findAll();
    }

    public Optional <Empleado> getEmpleado(int id){
        return empleadoCrudRepositorio.findById(id);
    }

    public Empleado saveEmpleado(Empleado emple){
        return empleadoCrudRepositorio.save(emple);
    }
}
