package br.edu.fatecpg.email.view;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.fatecpg.email.model.Email;
public class Main {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Email> emails = mapper.readValue(new URL("https://jsonplaceholder.typicode.com/comments"),
                new TypeReference<List<Email>>() {}
        );

        List<Email> emailsVerificados = emails.stream()
                .filter(e -> e.getEmail().endsWith(".com"))
                .collect(Collectors.toList());

        List<Email> emailsNVerificados = emails.stream()
                .filter(e -> !e.getEmail().endsWith(".com"))
                .collect(Collectors.toList());

        System.out.println("Emails verificados");
        int i = 0;
        while (i < emailsVerificados.size()) {
            System.out.println((i + 1) + " - " + emailsVerificados.get(i).getEmail());
            System.out.println(emailsVerificados.get(i).getDescricao());
            System.out.println();
            i++;
        }

        System.out.println("Emails não verificados");
        int o = 0;
        while (o < emailsNVerificados.size()) {
            System.out.println((o + 1) + " - " + emailsNVerificados.get(o).getEmail());
            System.out.println(emailsNVerificados.get(o).getDescricao());
            System.out.println();
            o++;
        }







    }
}
