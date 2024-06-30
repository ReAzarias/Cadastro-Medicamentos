package org.example.medicamentosprojeto.Service;

import org.example.medicamentosprojeto.Model.Medicamento;
import org.example.medicamentosprojeto.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentosService {
    @Autowired
    private MedicamentoRepository repository;

    public List<Medicamento> listarTodos() {
        return repository.findAll();
    }

    public Medicamento salvar(Medicamento medicamento) {
        return repository.save(medicamento);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}


