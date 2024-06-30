document.addEventListener('DOMContentLoaded', function() {
    // Função para buscar os medicamentos e exibir na página
    function carregarMedicamentos() {
        fetch('/medicamentos')
            .then(response => response.json())
            .then(data => {
                const medicamentosList = document.getElementById('medicamentosList');
                medicamentosList.innerHTML = ''; // Limpa a lista atual

                data.forEach(medicamento => {
                    const card = document.createElement('div');
                    card.classList.add('medicamento-card');
                    card.innerHTML = `
                        <h3>${medicamento.nome}</h3>
                        <p><strong>Descrição:</strong> ${medicamento.descricao}</p>
                        <hr>
                    `;
                    medicamentosList.appendChild(card);
                });
            })
            .catch(error => {
                console.error('Erro ao carregar medicamentos:', error);
            });
    }

    // Chama a função para carregar medicamentos ao carregar a página
    carregarMedicamentos();
});
