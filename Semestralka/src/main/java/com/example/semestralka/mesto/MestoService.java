package com.example.semestralka.mesto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MestoService {

    @GetMapping
    public List<Mesto> getCities()
    {
        return List.of(
                new Mesto(
                        1L,
                        "Praha",
                        "CeskaRepublika"
                )
        );
    }
}
