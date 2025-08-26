# 🎬 ScreenMatch - Exercícios de POO em Java

Este projeto foi desenvolvido como exercício de **Programação Orientada a Objetos (POO)** em **Java**, utilizando a IDE **IntelliJ IDEA**.  
O objetivo é praticar conceitos fundamentais da linguagem e de POO, como **classes, objetos, herança, polimorfismo, encapsulamento e interfaces**.

---

## 📚 Estrutura do Projeto

- **Pacote `modelos`**
  - `Filme.java` → Classe que representa um filme, com atributos como nome, ano de lançamento, duração e avaliações.
  - `Serie.java` → Classe que representa uma série, com temporadas e episódios.
  - `Episodio.java` → Classe para modelar episódios de uma série.
  - `Titulo.java` → Classe base para títulos de mídia.
  
- **Pacote `calculo`**
  - `CalculadoraDeTempo.java` → Calcula o tempo necessário para maratonar filmes e séries.
  - `FiltroRecomendacao.java` → Sugere títulos com base nas avaliações.
  - `Classificavel.java` → Interface para classes que podem ser classificadas.

- **Classe `Principal.java`**
  - Contém o método `main`, responsável por executar exemplos com filmes e séries:
    - Criar objetos de `Filme` e `Serie`.
    - Exibir ficha técnica.
    - Avaliar títulos.
    - Calcular tempo de maratona.
    - Exibir recomendações.
