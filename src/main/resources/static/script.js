document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('medicamentoForm');
    const message = document.getElementById('message');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        const formData = new FormData(form);
        const medicamento = {
            nome: formData.get('nome'),
            descricao: formData.get('descricao'),
            dosagem: formData.get('dosagem'),
            horario: formData.get('horario')

        };

        fetch('/medicamentos', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(medicamento)
        })
        .then(response => response.json())
        .then(data => {
            message.innerHTML = `<p>Medicamento cadastrado com sucesso! ID: ${data.id}</p>`;
            form.reset();
        })
        .catch(error => {
            message.innerHTML = `<p>Ocorreu um erro ao cadastrar o medicamento: ${error}</p>`;
        });
    });
});
