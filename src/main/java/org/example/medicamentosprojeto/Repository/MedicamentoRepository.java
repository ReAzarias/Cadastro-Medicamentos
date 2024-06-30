package org.example.medicamentosprojeto.Repository;

import org.example.medicamentosprojeto.Model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {
}
