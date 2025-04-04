package apirest.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import apirest.apirest.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}