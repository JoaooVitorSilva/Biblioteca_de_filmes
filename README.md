# 🎬 ScreenMatch - Exercícios de POO em Java

Este projeto foi desenvolvido como exercício de **Programação Orientada a Objetos (POO)** em **Java**, utilizando a IDE **IntelliJ IDEA**.  
O objetivo é praticar conceitos fundamentais da linguagem e de POO, como **classes, objetos, herança, polimorfismo, encapsulamento, interfaces e coleções**.

---

## 📚 Estrutura do Projeto

- **Pacote `modelos`**
  - `Filme.java` → Classe que representa um filme, com atributos como nome, ano de lançamento, duração e avaliações.
  - `Serie.java` → Classe que representa uma série, com temporadas e episódios.
  - `Episodio.java` → Classe para modelar episódios de uma série.
  - `Titulo.java` → Classe base para títulos de mídia, implementando **Comparable** para permitir ordenação.

- **Pacote `calculo`**
  - `CalculadoraDeTempo.java` → Calcula o tempo necessário para maratonar filmes e séries.
  - `FiltroRecomendacao.java` → Sugere títulos com base nas avaliações.
  - `Classificavel.java` → Interface para classes que podem ser classificadas.

- **Pacote `principal`**
  - `Principal.java` → Classe inicial com execução simples (criação e manipulação de objetos).
  - `PrincipalComListas.java` → Classe que demonstra:
    - Uso de **listas (`ArrayList` e `LinkedList`)**.
    - Inserção de filmes e séries em uma coleção.
    - **Ordenação de títulos** por nome e por ano de lançamento.
    - **Busca de artistas** em uma lista.
    - Uso de **`instanceof`** para aplicar filtros de classificação.

---

## 🛠️ Funcionalidades
- Criar e avaliar filmes e séries.
- Calcular o tempo total necessário para maratonar títulos.
- Recomendar filmes e séries com base em notas.
- Trabalhar com **listas dinâmicas** de títulos e artistas.
- Ordenar listas:
  - Por **nome** (ordem alfabética).
  - Por **ano de lançamento** (usando `Comparator`).
- Exibir classificação de filmes com base nas avaliações.
