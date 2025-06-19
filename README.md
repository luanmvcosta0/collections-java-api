### Exercícios de Collections em Java

Este repositório é destinado à prática e estudo das principais interfaces da Java Collections Framework:

- `List`
- `Set`
- `Map`

Os exercícios foram baseados no conteúdo disponibilizado por [@cami-la](https://github.com/cami-la), e podem ser encontrados no repositório original:  
🔗 [github.com/cami-la/collections-java-api-2023](https://github.com/cami-la/collections-java-api-2023)

✅ **Objetivo:** Praticar a implementação e uso de coleções em Java, compreendendo seus comportamentos, vantagens e diferenças.

---

# Exercícios:

## Operações Básicas com Set

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

### 2. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

----

## Pesquisa em Set

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>

---

## Ordenação em Set

### 1. Cadastro de Produtos

<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
</p>

### 2. Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>




---


## Operações Básicas com Set

### 1. Conjunto de Convidados

<p>Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto de objetos do tipo "Convidado" como atributo. Cada convidado possui atributos como nome e código do convite. Implemente os seguintes métodos:

- `adicionarConvidado(String nome, int codigoConvite)`: Adiciona um convidado ao conjunto.
- `removerConvidadoPorCodigoConvite(int codigoConvite)`: Remove um convidado do conjunto com base no código do convite.
- `contarConvidados()`: Conta o número total de convidados no Set.
- `exibirConvidados()`: Exibe todos os convidados do conjunto.
</p>

### 2. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>

----

## Pesquisa em Set

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos do tipo "Contato" como atributo. Cada contato possui atributos como nome e número de telefone. Implemente os seguintes métodos:

- `adicionarContato(String nome, int numero)`: Adiciona um contato à agenda.
- `exibirContatos()`: Exibe todos os contatos da agenda.
- `pesquisarPorNome(String nome)`: Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
- `atualizarNumeroContato(String nome, int novoNumero)`: Atualiza o número de telefone de um contato específico.
</p>

### 2. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>

---

## Ordenação em Set

### 1. Cadastro de Produtos

<p>
Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, double preco, int quantidade)`: Adiciona um produto ao cadastro.
- `exibirProdutosPorNome()`: Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
- `exibirProdutosPorPreco()`: Exibe todos os produtos do cadastro em ordem crescente de preço.
</p>

### 2. Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>


---


## Operações Básicas com Map

### 1. Agenda de Contatos

<p>
Crie uma classe chamada "AgendaContatos" que utilize um Map para armazenar os contatos. Cada contato possui um nome como chave e um número de telefone como valor. Implemente os seguintes métodos:

- `adicionarContato(String nome, Integer telefone)`: Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
- `removerContato(String nome)`: Remove um contato da agenda, dado o nome do contato.
- `exibirContatos()`: Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
- `pesquisarPorNome(String nome)`: Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
</p>

### 2.  Dicionário

<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
</p>

---

## Pesquisa em Map

### 1. Estoque de Produtos com Preço

<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
</p>

### 2. Contagem de Palavras

<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>

---

## Ordenação nos Map

### 1. Agenda de Eventos

<p>
Crie uma classe chamada "AgendaEventos" que utilize um `Map` para armazenar as datas e seus respectivos Eventos. Cada evento é representado por um objeto da classe "Evento", que possui atributos como nome do evento e o nome da atração. Implemente os seguintes métodos:

- `adicionarEvento(LocalDate data, String nome, String atracao)`: Adiciona um evento à agenda.
- `exibirAgenda()`: Exibe a agenda de eventos em ordem crescente de data.
- `obterProximoEvento()`: Retorna o próximo evento que ocorrerá.
</p>

### 2. Livraria Online

<p>
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- `adicionarLivro(String link, String titulo, String autor, private double preco)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String titulo)`: Remove um livro da livraria, dado o titulo do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.
</p>
