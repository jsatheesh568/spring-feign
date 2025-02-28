
# Feign Client Demo - Spring Boot

## 📌 Overview
This is a Spring Boot project demonstrating the use of **Spring Cloud OpenFeign** for making REST API calls between microservices. The project consists of two services:

- **🟢 Demo Service (`demo-service`)** - Provides REST endpoints.
- **🔵 Feign Client Service (`feignclient-service`)** - Calls `demo-service` endpoints using Feign.

---

## 🚀 Features
✔️ **Feign Client Integration** for easy REST API communication  
✔️ **Spring Boot & Spring Cloud** for microservices architecture  
✔️ **Java 8 Functional Approach** for clean and optimized code  
✔️ **REST API Standardization** following best practices  
✔️ **Modularized Microservices** structure for scalability  

---

## 🛠 Technologies Used
- **Java 17**
- **Spring Boot**
- **Spring Cloud OpenFeign**
- **Spring Web**
- **Maven**
- **IntelliJ IDEA**
- **Postman (For API Testing)**

---









## 🔧 Setup & Installation  

### 1️⃣ Clone the Repository  
| Step | Command | Description |  
|------|---------|-------------|  
| 1️⃣   | `git clone https://github.com/your-repo/feign-client-demo.git` | Clone the repository                |  
| 2️⃣   | `cd feign-client-demo`                                         | Navigate into the project directory |  

---

## 📌 API Endpoints  

### **Demo Service (`demo-service`)**  
| Endpoint               | Method | Description           |  
|------------------------|--------|-----------------------|  
| `/api/v1/user/name`    | GET    | Returns user name     |  
| `/api/v1/user/address` | GET    | Returns user address  |  
| `/api/v1/user/status`  | GET    | Returns user status   |  

### **Feign Client Service (`feignclient-service`)**  
| Endpoint               | Method | Calls                  |  
|------------------------|--------|------------------------|  
| `/demo/user-name`      | GET    | `/api/v1/user/name`    |  
| `/demo/user-address`   | GET    | `/api/v1/user/address` |  
| `/demo/user-status`    | GET    | `/api/v1/user/status`  |  
