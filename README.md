# **Kafka Producer-Consumer Microservices**

This project implements two microservices (**Producer** and **Consumer**) that communicate asynchronously using **Apache Kafka**. It includes detailed logging via **Log4j2** and is fully containerized using **Docker Compose**.

---

## **🛠️ Technologies Used**
- **Java 17**
- **Spring Boot 3**
- **Apache Kafka**
- **Docker / Docker Compose**
- **Log4j2**

---

## **🚀 How to Run**

### **1. Prerequisites**
- Install **Java 17**.
- Install **Docker** and **Docker Compose**.

### **2. Setup**
- Make sure that the ports `8080` (Producer), `8081` (Consumer), and `9092` (Kafka) are available.

### **3. Start Services**
Run the following command to build and start the services:
```bash
docker-compose up --build
