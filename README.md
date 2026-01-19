# 🚀 Portfolio API — Backend Institucional

<p align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="70"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="70"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/maven/maven-original.svg" width="70"/>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="70"/>
</p>

API REST desenvolvida com **Spring Boot**, responsável por fornecer dados institucionais de um portfólio profissional, incluindo **perfil, stack tecnológica e projetos técnicos**.

Este backend foi projetado para ser consumido por um frontend moderno (Angular, React ou Next.js), funcionando como uma **base sólida, escalável e organizada** para um portfólio full stack real.

---

## 🎯 Objetivo do Projeto

- Centralizar informações profissionais em uma API REST  
- Facilitar manutenção e evolução do portfólio  
- Demonstrar organização de código e arquitetura backend  
- Simular um backend institucional de produto real  
- Servir dados para múltiplos clientes (web, mobile, etc.)  

---

## ✨ Funcionalidades

- ✅ API REST com endpoints institucionais  
- ✅ Exposição de perfil profissional  
- ✅ Listagem de projetos técnicos  
- ✅ Exibição de stack tecnológica  
- ✅ Arquitetura em camadas (Controller / Service / DTO)  
- ✅ Código limpo e de fácil manutenção  
- ✅ Base preparada para evolução futura (autenticação, banco, painel admin)  

---

## 🏗 Arquitetura
```
Cliente (Frontend)
↓ HTTP
API Spring Boot
↓
Controllers → Services → DTOs → JSON
```
O projeto segue uma **arquitetura simples e clara**, priorizando **legibilidade**, **organização** e **separação de responsabilidades**.

---

## 🌐 API em Produção

A API está hospedada no **Railway**:
```
https://port-api.up.railway.app/api
```
---

## 📌 Endpoints Disponíveis

### 🔹 Perfil profissional
```
GET /api/profile
```
### 🔹 Stack tecnológica
```
GET /api/stack
```
### 🔹 Projetos técnicos
```
GET /api/projects
```
---

## 🧪 Testando rapidamente
```
curl https://port-api.up.railway.app/api/profile
curl https://port-api.up.railway.app/api/stack
curl https://port-api.up.railway.app/api/projects
```
📁 Estrutura do Projeto
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
│   ├── ProfileResponse.java
│   ├── StackResponse.java
│   └── ProjectResponse.java
├── domain/
│   └── Project.java
├── mapper/
│   └── ProjectMapper.java
└── config/
    └── CorsConfig.java
   ```
🚀 Como executar o projeto localmente
Pré-requisitos
Java 17+

Maven 3.8+

1️⃣ Clonar o repositório
```
git clone https://github.com/PabloCsDev/portifolio-api.git
cd portifolio-api
```
2️⃣ Compilar o projeto
```
mvn clean package
```
3️⃣ Executar a aplicação
```
mvn spring-boot:run
```
A API estará disponível em:
```
http://localhost:8080/api
```
🔮 Evoluções Futuras (Planejadas)

-Persistência em banco de dados (JPA/H2/MySQL)

-Documentação OpenAPI / Swagger

-Autenticação e autorização

-Painel administrativo para edição de dados

-Integração com API do GitHub

-Cache com Redis

-Testes automatizados

-Deploy com CI/CD


👨‍💻 Desenvolvido por
Pablo Carvalho Santos
Desenvolvedor Back-end | Java & Spring Boot

📧 Email: devpablocarvalho@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/pablo-carvalho-140255260
💻 GitHub: https://github.com/PabloCsDev
