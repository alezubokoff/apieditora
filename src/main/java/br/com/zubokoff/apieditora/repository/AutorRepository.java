package br.com.zubokoff.apieditora.repository;

import br.com.zubokoff.apieditora.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
