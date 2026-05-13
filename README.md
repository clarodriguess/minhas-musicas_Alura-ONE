## 🎵 Projeto Minhas Músicas

Este projeto foi desenvolvido como parte de um curso com foco em **Programação Orientada a Objetos (POO)**, explorando na prática conceitos como **encapsulamento**, **herança** e **polimorfismo** por meio de uma aplicação simples de gerenciamento de áudios.

A aplicação simula o comportamento de diferentes tipos de mídia sonora, como músicas e podcasts, a partir de uma classe base comum.

---

### 🧠 Conceitos de Orientação a Objetos Aplicados

- **Encapsulamento**  
  Os atributos das classes são privados e acessados apenas por meio de métodos públicos (getters e setters), impedindo o acesso direto pela classe principal.

- **Herança**  
  As classes `Musica` e `Podcast` herdam atributos e comportamentos da classe base `Audio`, evitando duplicação de código.

- **Polimorfismo**  
  A estrutura permite tratar diferentes tipos de áudio de forma genérica a partir da classe `Audio`.

---

### 🏗 Estrutura do Projeto

A modelagem do sistema é baseada em uma classe base **`Audio`**, que representa características comuns a qualquer mídia sonora, como:

### Classe `Audio`
- `titulo`
- `totalReproducoes`
- `totalCurtidas`
- `classificacao`
- Métodos:
  - `reproduz()`
  - `curte()`
  - getters e setters

A partir dela, foram criadas classes especializadas:

### Classe `Musica`
- `album`
- `artista`
- `genero`
- getters e setters

### Classe `Podcast`
- `host`
- `descricao`
- getters e setters

Essa separação garante organização, reutilização de código e facilidade de manutenção.

> 📌 **Diagrama de Classes**  
> <img  height="400" alt="image" src="https://github.com/user-attachments/assets/0d579ad2-8a10-4261-ac2b-3e2e3d1afda1" />


---

### 🎯 Objetivo do Projeto

Demonstrar a aplicação correta dos pilares da Programação Orientada a Objetos em Java, com foco em:
- Modelagem de classes
- Controle de acesso a atributos
- Reutilização e extensão de comportamentos

---

## 🛠 Tecnologias Utilizadas
- **Java**
- **IntelliJ IDEA**
