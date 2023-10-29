package pe.edu.cibertec.RC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.cibertec.RC.Model.Usuarios;
import pe.edu.cibertec.RC.Repository.UserDao;
import pe.edu.cibertec.RC.Service.*;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<Usuarios> findAll() {
        return (List<Usuarios>) userDao.findAll();
    }

    @Override
    public Usuarios findById(int id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public Usuarios findByEmail(String email) {
        return userDao.findByEmail(email);//orElse(null);
    }

    @Override
    public Usuarios findByPhone(String phone) {
        return userDao.findByPhone(phone);//orElse(null);
    }

    @Override
    public Usuarios agregarUsu(Usuarios usuarios) {
        return userDao.save(usuarios);
    }

    @Override
    public Usuarios actualizarUsu(int id, Usuarios usuarios) {
        Usuarios usuariosDB = userDao.findById(id).get();
        usuariosDB.setNombres(usuariosDB.getNombres());
        usuariosDB.setApellidos(usuariosDB.getApellidos());
        usuariosDB.setDireccion(usuariosDB.getDireccion());
        usuariosDB.setDni(usuariosDB.getDni());
        usuariosDB.setCorreo(usuariosDB.getCorreo());

        return userDao.save(usuariosDB);
    }

    @Override
    public void delete(int id) {
        Usuarios usuariosDB = userDao.findById(id).get();
        userDao.delete(usuariosDB);
    }
}
