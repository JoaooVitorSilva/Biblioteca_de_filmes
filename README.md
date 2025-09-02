# 🎬 ScreenMatch - Exercícios de POO em Java

Este projeto foi desenvolvido como exercício prático de **Programação Orientada a Objetos (POO)** em **Java**, utilizando a IDE **IntelliJ IDEA**.  
O objetivo é praticar conceitos fundamentais da linguagem e de POO, como **classes, objetos, herança, polimorfismo, encapsulamento, interfaces, coleções e consumo de APIs**.

---

## 📂 Estrutura do Projeto

- **Pacote `modelos`**
  - `Titulo.java` → Classe base para títulos de mídia, implementando **Comparable** para permitir ordenação.
  - `Filme.java` → Representa filmes, com atributos adicionais como diretor e sistema de avaliações.
  - `Serie.java` → Representa séries, com temporadas, episódios e cálculo de duração total.
  - `Episodio.java` → Modela episódios de uma série, implementando a interface **Classificavel**.
  - `TituloOmdb.java` → Record que mapeia a resposta da API OMDb.
  
- **Pacote `calculo`**
  - `CalculadoraDeTempo.java` → Soma o tempo necessário para maratonar títulos.
  - `FiltroRecomendacao.java` → Filtra e sugere títulos com base em avaliações.
  - `Classificavel.java` → Interface para itens que podem receber classificação.

- **Pacote `excecao`**
  - `ErroDeConversaoDeAnoException.java` → Exceção personalizada para erros de conversão de ano em títulos.

- **Pacote `principal`**
  - `Principal.java` → Execução inicial, demonstrando criação de objetos e uso de listas.
  - `PrincipalComListas.java` → Demonstra:
    - Uso de **listas (`ArrayList` e `LinkedList`)**.
    - Inserção de filmes e séries em coleções.
    - **Ordenação** de títulos por nome e ano de lançamento.
    - **Busca por artistas** e aplicação de `instanceof` para filtragem.
  - `PrincipalComBusca.java` → Integração com a **API OMDb**, permitindo:
    - Busca de filmes via requisição HTTP.
    - Conversão da resposta JSON em objetos `Titulo`.
    - Tratamento de exceções personalizadas.
    - Persistência dos dados em um arquivo **`filmes.json`**.

---

## 🛠️ Funcionalidades

- Criar e avaliar **filmes e séries**.
- Calcular tempo total necessário para maratonar títulos.
- Recomendar conteúdos com base em notas.
- Trabalhar com **listas dinâmicas** de títulos e artistas.
- Ordenar títulos:
  - Por **nome** (ordem alfabética).
  - Por **ano de lançamento** (usando `Comparator`).
- Consumir a **API OMDb**:
  - Buscar filmes por nome.
  - Converter JSON em objetos Java.
  - Persistir resultados em **JSON**.

---

💡 *Se você gostou deste projeto, deixe uma ⭐ no repositório!*
