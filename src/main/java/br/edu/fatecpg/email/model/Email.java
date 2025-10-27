package br.edu.fatecpg.email.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Email {
    private String email;

    @JsonProperty("body")
    private String descricao;

    public Email() {

    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
