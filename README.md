
> Projeto para processo seletivo vaga de Dev Backend Tinnova

### Tarefas 

O projeto foi voltado para as seguintes tarefas:

- [x] Votos em relação ao total de eleitores
- [x] Algoritmo de ordenação Bubble Sort
- [x] Fatorial
- [x] A soma dos multiplos de 3 ou 5
- [x] Cadastro de veículos

## 💻 Pré-requisitos

Antes de começar, verifique se você possui instalado em sua maquina as seguintes tecnologias:
* Docker
* Java 11
* Maven
* NodeJs
* Angular


## 🚀 Instalando Tinnova-test

Para instalar o projeto, siga estas etapas:

Suba o container na pasta tinnova-spa/container/:

```
sudo docker-compose up -d
```

Atualize as dependencias e rodar o liquibase, na pasta tinnova-spa/ execute o comando:
```
mvn clean install
```
Suba o back end com o spring boot em sua IDE de preferencia.

Instale as dependencias do FrontEnd na pasta tinnova-spa/tinnovaClient execute o comando:
```
npm install
```

Suba o front end execute o comando na pasta tinnova-spa/tinnovaClient :
```
npm start
```
Para acessar o swagger basta o backend da aplicação e acessar ao endereço:
```
localhost:8080/swagger-ui.html
```

## 🚀 Localização dos exercicios Tinnova-test
- Votos em relação ao total de eleitores
	Localizado na pasta: votos-eleitores/
- Algoritmo de ordenação Bubble Sort
	Localizado na pasta: bubbleSort
- Fatorial
	Localizado na pasta: fatorial/
- A soma dos multiplos de 3 ou 5
	Localizado na pasta: soma3e5
- Cadastro de veículos
	Localizado na pasta: tinnova-spa


## 🍜 Licença
Projeto criado por Maria Carolina Santana Ribeiro

