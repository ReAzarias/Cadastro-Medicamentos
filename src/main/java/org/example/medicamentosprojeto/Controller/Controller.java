package org.example.medicamentosprojeto.Controller;

import org.example.medicamentosprojeto.Model.Medicamento;
import org.example.medicamentosprojeto.Service.MedicamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class Controller {
    @Autowired
    private MedicamentosService service;

    @GetMapping
    public List<Medicamento> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Medicamento salvar(@RequestBody Medicamento medicamento) {
        return service.salvar(medicamento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}



