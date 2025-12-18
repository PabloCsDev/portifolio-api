package com.hyus4ki.service;

import com.hyus4ki.dto.ProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public ProfileResponse getProfile() {
        return new ProfileResponse(
                "Pablo Carvalho Santos",
                "Desenvolvedor Back-end | Java e Spring Boot",
                "Desenvolvedor Back-end com foco em Java e Spring Boot, atuando no desenvolvimento de APIs REST e sistemas distribuídos. Experiência prática com mensageria, cache, bancos de dados relacionais e conteinerização, aplicando boas práticas como SOLID, Clean Code e arquitetura em camadas.",
                "Santos - SP",
                "https://github.com/PabloCsDev",
                "https://linkedin.com/in/pablo-carvalho-140255260/",
                "devpablocarvalho@gmail.com"
        );
    }
}
