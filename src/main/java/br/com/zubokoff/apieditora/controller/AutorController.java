package br.com.zubokoff.apieditora.controller;

import br.com.zubokoff.apieditora.domain.Autor;
import br.com.zubokoff.apieditora.dto.AutorDTO;
import br.com.zubokoff.apieditora.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping
    public AutorDTO cadastro(@RequestBody AutorDTO autorDTO) {
        autorService.cadastra(autorDTO);
        return autorDTO;
    }

    @GetMapping
    public ResponseEntity<List<AutorDTO>> lista() {
        List<Autor> autores = autorService.lista();
        List<AutorDTO> autoresDTO = autores.stream().map(obj -> new AutorDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(autoresDTO);
    }
}
