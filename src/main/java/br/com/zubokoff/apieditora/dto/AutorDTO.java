package br.com.zubokoff.apieditora.dto;

import br.com.zubokoff.apieditora.domain.Autor;

public class AutorDTO {

    private String nome;
    private String urlGitHub;

    public AutorDTO() {}

    public AutorDTO(String nome, String urlGitHub) {
        this.nome = nome;
        this.urlGitHub = urlGitHub;
    }

    public AutorDTO(Autor autor) {
        this.nome = autor.getNome();
        this.urlGitHub = autor.getUrlGitHub();
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
}
