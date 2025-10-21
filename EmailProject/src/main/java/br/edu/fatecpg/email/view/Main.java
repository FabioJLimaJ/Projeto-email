package br.edu.fatecpg.email.view;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import br.edu.fatecpg.email.model.Email;
public class Main {

    public static void main(String[] args) throws IOException {



        ObjectMapper mapper = new ObjectMapper();
        List<Email> emails = mapper.readValue(new URL("https://jsonplaceholder.typicode.com/comments"),
                new TypeReference<List<Email>>() {}
        );
        System.out.println(emails.get(0).getEmail());




    }
}
