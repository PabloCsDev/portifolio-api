## 🚀 Portfolio API — Backend Institucional
<table align="center"> <tr> <td><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="70"/></td> <td><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="70"/></td> <td><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="70"/></td> <td><img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="70"/></td> </tr> </table>

API REST desenvolvida em Spring Boot para servir dados institucionais de um portfólio profissional, incluindo perfil, stack tecnológica e projetos técnicos, com foco em organização, clareza e boas práticas de backend.

Este backend foi projetado para ser consumido por um frontend moderno (React / Next.js), funcionando como uma base sólida para um portfólio full stack.

### 🎯 Objetivo do Projeto

Centralizar informações profissionais em uma API REST

Facilitar a manutenção e evolução do portfólio

Demonstrar organização de código e arquitetura backend

Simular um backend real de produto institucional

### ✨ Funcionalidades

✅ API REST com endpoints institucionais

✅ Exposição de perfil profissional

✅ Listagem de projetos técnicos

✅ Exibição de stack tecnológica

✅ Arquitetura em camadas (Controller / Service / DTO)

✅ Código limpo e de fácil manutenção

✅ Base preparada para evolução futura (auth, banco, admin)

### 🏗 Arquitetura
Cliente (Frontend)
↓
API Spring Boot
↓
Endpoints REST (JSON)


O projeto segue uma arquitetura simples e clara, priorizando legibilidade e separação de responsabilidades.

### 📌 Endpoints Disponíveis
🔹 Perfil profissional
GET /api/profile

🔹 Stack tecnológica
GET /api/stack

🔹 Projetos técnicos
GET /api/projects

### 🚀 Como executar o projeto
Pré-requisitos

Java 17+

Maven 3.8+

1️⃣ Clonar o repositório
```
git clone https://github.com/PabloCsDev/portfolio-api.git
cd portfolio-api
```
2️⃣ Compilar o projeto
```
mvn clean compile
```
3️⃣ Executar a aplicação
```
mvn spring-boot:run
```

### 🌐 A aplicação estará disponível em:
```
http://localhost:8080
```
### 🧪 Testando rapidamente
```
curl http://localhost:8080/api/profile
curl http://localhost:8080/api/stack
curl http://localhost:8080/api/projects
```

### 📁 Estrutura do Projeto
```
src/main/java/com/hyus4ki/portapi/
├── PortfolioApiApplication.java
├── controller/
│   ├── ProfileController.java
│   ├── StackController.java
│   └── ProjectController.java
├── service/
│   ├── ProfileService.java
│   ├── StackService.java
│   └── ProjectService.java
├── dto/
│   ├── ProfileDTO.java
│   ├── StackDTO.java
│   └── ProjectDTO.java
```

### 🔮Evoluções futuras (planejadas)

Persistência em banco de dados

Painel administrativo para edição dos dados

Autenticação e autorização

Integração com API do GitHub

Cache com Redis

Deploy em ambiente cloud

### 👨‍💻 Desenvolvido por

Pablo Carvalho Santos 

Desenvolvedor Back-end | Java & Spring Boot

📧 Email: devpablocarvalho@gmail.com

🔗 LinkedIn: https://www.linkedin.com/in/pablo-carvalho-140255260

💻 GitHub: https://github.com/PabloCsDev