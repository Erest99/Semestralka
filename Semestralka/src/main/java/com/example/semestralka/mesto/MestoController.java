package com.example.semestralka.mesto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/mesto")
public class MestoController {
    private final MestoService mestoService;

    @Autowired
    public MestoController(MestoService mestoService) {
        this.mestoService = mestoService;
    }

    @GetMapping
    public List<Mesto> getCities()
    {
        return mestoService.getCities();
    }
}
