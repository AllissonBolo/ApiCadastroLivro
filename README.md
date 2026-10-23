# API de Cadastro de Livros

API REST desenvolvida em Kotlin com Spring Boot para cadastro de livros.

## Visão geral

A aplicação expõe um endpoint para registrar livros em um banco de dados em memória H2. O projeto usa Spring Data JPA para persistência e estrutura básica de controller, entidade e repositório.

## Estrutura do projeto

- `cadastroLivro/src/main/kotlin/br/sp/gov/etec/cadastroLivro/Livro.kt` - entidade do livro
- `cadastroLivro/src/main/kotlin/br/sp/gov/etec/cadastroLivro/LivroController.kt` - endpoints HTTP
- `cadastroLivro/src/main/kotlin/br/sp/gov/etec/cadastroLivro/LivroRepository.kt` - camada de acesso ao banco
- `cadastroLivro/src/main/kotlin/br/sp/gov/etec/cadastroLivro/CadastroLivroApplication.kt` - classe principal da aplicação
- `cadastroLivro/src/main/resources/application.properties` - configurações da aplicação

## Entidade `Livro`

```json
{
  "id": 1,
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis",
  "anoPublicacao": 1899
}
```

### Campos

- `id`: identificador único do livro (gerado automaticamente)
- `titulo`: título do livro
- `autor`: nome do autor
- `anoPublicacao`: ano de publicação

## Endpoints

### 1) Cadastrar livro

- Método: `POST`
- URL: `/livros`
- Content-Type: `application/json`

#### Exemplo de requisição

```http
POST http://localhost:8080/livros
Content-Type: application/json

{
  "titulo": "A Revolução dos Bichos",
  "autor": "George Orwell",
  "anoPublicacao": 1945
}
```

#### Exemplo de resposta

```json
{
  "id": 1,
  "titulo": "A Revolução dos Bichos",
  "autor": "George Orwell",
  "anoPublicacao": 1945
}
```

#### Códigos de resposta

- `200 OK`: livro cadastrado com sucesso
- `400 Bad Request`: payload inválido ou mal formatado
- `500 Internal Server Error`: erro interno da aplicação

## Requisitos

- Java 21
- Gradle
- Kotlin
- Spring Boot

## Como executar

Na pasta raiz do projeto (`cadastroLivro`), rode:

```bash
./gradlew bootRun
```

No Windows:

```bash
gradlew.bat bootRun
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

## Banco de dados

O projeto utiliza H2 em memória, configurado para facilitar o desenvolvimento e testes. O console do H2 pode ser acessado em:

```text
http://localhost:8080/h2-console
```

## Observações

- A API atualmente possui apenas o fluxo de cadastro de livros.
- O mapeamento da entidade é feito com JPA e o repositório herda de `JpaRepository`.
- O projeto está em fase inicial e pode evoluir com endpoints de listagem, busca por ID, atualização e exclusão.

## Próximos passos sugeridos

- Implementar `GET /livros` para listar todos os livros
- Implementar `GET /livros/{id}` para buscar um livro por ID
- Implementar `PUT /livros/{id}` para atualizar
- Implementar `DELETE /livros/{id}` para remover
- Adicionar validações com Bean Validation (`@NotBlank`, `@NotNull`, etc.)
- Adicionar documentação com Swagger/OpenAPI

## Resumo da API

```text
POST /livros  -> cadastra um novo livro
```

Este arquivo constitui a documentação inicial da API e pode ser ajustado conforme o projeto evolui.
