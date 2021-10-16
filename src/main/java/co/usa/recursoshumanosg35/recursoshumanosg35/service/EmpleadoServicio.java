package co.usa.recursoshumanosg35.recursoshumanosg35.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.usa.recursoshumanosg35.recursoshumanosg35.model.Empleado;
import co.usa.recursoshumanosg35.recursoshumanosg35.repository.EmpleadoRepositorio;

@Service
public class EmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public List <Empleado>getAll(){
        return empleadoRepositorio.getAll();
    }

    public Optional <Empleado>getEmpleado(int id){
        return empleadoRepositorio.getEmpleado(id);
    }

    public Empleado saveEmpleado(Empleado emple){
        if (emple.getNumId()==null) {
            return empleadoRepositorio.saveEmpleado(emple);
        } else {
            Optional<Empleado> consulta=empleadoRepositorio.getEmpleado(emple.getNumId());
            if (consulta.isEmpty()) {
                return empleadoRepositorio.saveEmpleado(emple);
            } else {
                return emple;
            }
        }
    }
}
