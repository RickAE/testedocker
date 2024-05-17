# Use uma imagem base do OpenJDK para Java 11
FROM openjdk:11-jdk-slim AS builder

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie todos os arquivos do projeto para o contêiner
COPY . .

# Use a mesma imagem do OpenJDK como base para a fase de execução
FROM openjdk:17-jdk-slim

# Copie o JAR construído da aplicação Spring Boot para a nova imagem
ADD BoraTrocarComentarios.jar app.jar

# Exponha a porta 8020 para o tráfego da aplicação
EXPOSE 8020

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "app.jar"]


