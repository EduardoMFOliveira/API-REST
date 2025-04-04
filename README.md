# 📝 **README - API REST com Spring Boot 3, Java 17 e Railway**

## **📌 Visão Geral**
API REST para gerenciamento de usuários, desenvolvida com **Spring Boot 3**, **Java 17** e implantada na **Railway**.  
**Funcionalidades**: Cadastro e consulta de usuários com validação básica de CPF.

---

## **🚀 Tecnologias**
- **Backend**:  
  ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-green)  
  ![Java](https://img.shields.io/badge/Java-17-blue)  
  ![Hibernate](https://img.shields.io/badge/Hibernate-6.6.11-lightgrey)  
- **Banco de Dados**:  
  ![H2](https://img.shields.io/badge/H2-Database-red) (dev)  
  ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue) (produção)  
- **Deploy**:  
  ![Railway](https://img.shields.io/badge/Railway-Cloud-orange)  

---

## **🛠️ Configuração Local**

### **Pré-requisitos**
- Java 17 ([Download](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html))
- Maven 3.8+
- VS Code (ou IDE de sua preferência)

### **Passos**
1. **Clone o repositório**:
   ```bash
   git clone https://github.com/EduardoMFOliveira/api-rest.git
   cd api-rest
   ```

2. **Execute a aplicação**:
   ```bash
   mvn spring-boot:run
   ```
   - A API estará disponível em: `http://localhost:8080`

3. **Acesse o H2 Console** (banco em memória):  
   URL: `http://localhost:8080/h2-console`  
   Credenciais:
   ```
   JDBC URL: jdbc:h2:mem:testdb
   User: sa
   Password: (vazio)
   ```

---

## **📚 Endpoints da API**
| Método | Endpoint         | Descrição                          | Exemplo de Body                             |
|--------|------------------|------------------------------------|---------------------------------------------|
| POST   | `/usuarios`      | Cria um novo usuário               | `{"nome": "João", "email": "joao@ex.com", "cpf": "12345678901"}` |
| GET    | `/usuarios/{id}` | Busca um usuário por ID            | -                                           |

---

## **☁️ Implantação na Railway**
1. **Crie uma conta na [Railway](https://railway.app)**.
2. **Conecte seu repositório GitHub**:
   - *New Project* > *Deploy from GitHub*.
3. **Adicione o plugin PostgreSQL** (será configurado automaticamente).
4. **Variáveis de ambiente** (opcional, se necessário):
   ```env
   DATABASE_URL=postgresql://[user]:[password]@[host]/[db]
   ```

A API estará online em: `https://api-rest-production.up.railway.app/usuarios`

---

## **🧪 Testes**
### **Via Postman**
1. **Cadastro de usuário** (POST):
   ```json
   {
       "nome": "Maria Silva",
       "email": "maria@exemplo.com",
       "cpf": "98765432109"
   }
   ```
   - **Resposta esperada** (201 Created):
     ```json
     {
         "id": 1,
         "nome": "Maria Silva",
         "email": "maria@exemplo.com",
         "cpf": "98765432109"
     }
     ```

2. **Consulta** (GET):  
   `GET https://api-rest-production.up.railway.app/usuarios/1`

---

## **🔧 Troubleshooting**
- **Erro 405 no Postman**: Verifique se o método HTTP está correto (POST/GET) e se o header `Content-Type: application/json` está definido.
- **Tabela não criada**: Confira se `spring.jpa.hibernate.ddl-auto=update` está no `application.properties`.

---

**Feito com ❤️ por [Eduardo]**  
🔗 *Adaptado do curso da DIO*
