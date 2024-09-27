Simulação dos Modificadores de Acesso e Getters/Setters - Classe CorpoHumano

Implementação da Classe CorpoHumano
Atributos: Massa, Volume, Densidade, Altura.
Métodos:
Getters e Setters para todos os atributos.
Método para calcular o IMC (Índice de Massa Corporal).

Perguntas e Respostas
1. O que aconteceu ao tentar acessar diretamente o atributo massa?
Código:
    corpo.massa = 2; // Erro de compilação, 'massa' é private

Ocorrência:
 O código gerou um erro de compilação porque o atributo massa é privado e não pode ser acessado diretamente.

Conclusão:
 Atributos privados são protegidos contra acessos externos, garantindo a integridade dos dados. Para modificá-los, é necessário usar os métodos setters.

2. O que aconteceu ao mudar private float massa para public float massa?

Código:
    corpo.massa = 2; // Acesso permitido, 'massa' agora é public
    Ocorrência: O código funcionou e o valor de massa foi alterado diretamente.
Conclusão:
 Tornar um atributo público permite que ele seja acessado e modificado diretamente, o que pode comprometer a integridade dos dados, já que não há controle sobre os valores atribuídos.

3. O que aconteceu ao mudar public void setVolume(float volume) para private?

Código:
    corpo.setVolume(0.1f); // Erro de compilação, 'setVolume' é private

Ocorrência:
 O código gerou um erro de compilação, já que o método setVolume agora é privado e não pode ser acessado de fora da classe.
 
Conclusão:
 Métodos privados só podem ser usados dentro da própria classe. Isso restringe o acesso e protege a lógica interna da classe.
