package br.com.zubokoff.apieditora.domain;

import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Autor implements Serializable {
    private static final long serialVersionUID = 2586740185777474231L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank @URL
    private String urlGitHub;

    public Autor() {}

    public Autor(Long id, String nome, String urlGitHub) {
        this.id = id;
        this.nome = nome;
        this.urlGitHub = urlGitHub;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlGitHub() {
        return urlGitHub;
    }

    public void setUrlGitHub(String urlGitHub) {
        this.urlGitHub = urlGitHub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return id.equals(autor.id) &&
                Objects.equals(nome, autor.nome) &&
                Objects.equals(urlGitHub, autor.urlGitHub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
