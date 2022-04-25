package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Usuario;

@Repository
public interface UsuarioRepositories extends JpaRepository<Usuario,Long> {

}
