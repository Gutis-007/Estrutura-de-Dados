# Sistema de Fila de Banco em Java

## Introdução

Este projeto implementa um sistema de fila de banco em Java que utiliza estruturas de dados com files, incorporando regras de prioridade para atendimento. O sistema permite adicionar e remover pessoas da fila, considerando o horário de chegada e o nível de prioridade.

## Requisitos

1. **Classe Pessoa**:
   - Atributos:
     - nome: String
     - horarioChegada: LocalTime
     - nivelPrioridade: int (0: sem prioridade, 1: gestantes, deficientes, pessoas com mais de 60 anos, 2: pessoas com mais de 80 anos)
   - Construtor: Inicializa os atributos
   - Métodos: Getters e Setters para os atributos

2. **Classe FilaBanco**:
   - Atributos:
     - filaPrioridade2: PriorityQueue<Pessoa>
     - filaPrioridade1: PriorityQueue<Pessoa>
     - filaNormal: PriorityQueue<Pessoa>
   - Construtor: Inicializa as filas
   - Métodos:
     - adicionarPessoa (Pessoa pessoa): Adiciona uma pessoa à fila adequada.
     - retirarPessoa (): Remove e retorna a próxima pessoa a ser atendida, considerando a prioridade.

## Passo a Passo

1. **Criação da Classe Pessoa**:
   - Definir a classe com os atributos nome, horarioChegada e nivelPrioridade.
   - Implementar o construtor e os métodos getters e setters.

2. **Criação da Classe FilaBanco**:
   - Importar as classes necessárias (java.util.PriorityQueue e java.time.LocalTime).
   - Inicializar três filas de prioridade utilizando PriorityQueue<Pessoa>.
   - Implementar os métodos adicionarPessoa e retirarPessoa.

3. **Métodos de Adição e Remoção**:
   - adicionarPessoa: Adiciona a pessoa à fila correspondente ao seu nivel de prioridade.
   - retirarPessoa: Remove e retorna a próxima pessoa a ser atendida, priorizando as filas de maior prioridade.

4. **Testes**:
   - Criar uma classe Main para testar a funcionalidade do sistema.
   - Adicionar várias pessoas com diferentes niveis de prioridade e horários de chegada.
   - Retirar pessoas da fila e verificar se a ordem de atendimento está correta.

## Como Executar

1. Clone o repositório do projeto.
2. Abra o projeto em um IDE de sua preferência (por exemplo, IntelliJ IDEA ou Eclipse).
3. Compile e execute a classe Main para testar a funcionalidade do sistema.

## Dependências

- Java 8 ou superior
- Maven (opcional)

## Contribuições

Se você tiver alguma sugestão ou encontrar um bug, por favor, abra um issue ou envie um pull request. Obrigado por contribuir!

## Licença

Este projeto está licenciado sob a licença MIT. Você pode usá-lo e distribuí-lo livremente, desde que mantenha a licença e os créditos.