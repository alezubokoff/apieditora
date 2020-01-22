package br.com.zubokoff.apieditora.service;

import br.com.zubokoff.apieditora.domain.Autor;
import br.com.zubokoff.apieditora.dto.AutorDTO;
import br.com.zubokoff.apieditora.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public void cadastra(AutorDTO autorDTO) {
        Autor autor = new Autor(null, autorDTO.getNome(), autorDTO.getUrlGitHub());
        autorRepository.save(autor);
    }

    public List<Autor> lista() {
        return autorRepository.findAll();
    }
}
