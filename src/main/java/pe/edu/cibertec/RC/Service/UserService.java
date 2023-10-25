package pe.edu.cibertec.RC.Service;

import pe.edu.cibertec.RC.Model.Usuarios;

import java.util.List;

public interface UserService {
    public List<Usuarios> findAll();
    public Usuarios findById(int id );
    public Usuarios findByEmail(String email);
    public Usuarios findByPhone(String phone);
    public Usuarios agregarUsu(Usuarios usuarios);
    public Usuarios actualizarUsu(int id, Usuarios usuarios);
    public void delete(int id );

}
