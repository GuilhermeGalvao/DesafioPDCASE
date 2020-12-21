# Desafio, Desenvolvedor Júnior

Desafio java proporcionado por PD Case .
  - Java 8
  - Spring Boot
  - Maven
  - Spring Boot JPA
  - Swagger
  - H2
  - Angular 10

# Premissas

  - A solução foi desenvolvida baseada na premissa que a listagem traz todos os usuários do sistema e o filtro é feito no front-end.
  - A solução contém em seu serviço o crud completo para a classe user.
  - Ao iniciar o serviço da API, o banco de dados é populado com 5 usuários.
  - A solução foi arquitetada em forma de API e em arquitetura de microserviço.
  - A comunicação do angular com a API é feita através do module HTTPClient.
  - A solução foi arquitetada em forma de API utilizando o pattern Clean Architecture do uncle bob: é focada em ser de simples leitura, facil manutencao e extensível.

# Melhorias e auto crítica
Acredito que a solução atinge o objetivo de forma prática e rápida. Em cenários de maior escala ou alta utilização, os seguintes pontos seriam endereçados:

O projeto foi criado de forma simples prezando o entendimento, com foco em usabilidade do usuário final. O front-end foi pensado na ideia de uma tela mais limpa. Caso determinado que a experiência possa ser melhorada, a escolha e a adição de novos items e cores é simples.

Dado que este é um desafio com poucos usuários, o banco escolhido é em memória e não existe paginação na parte de backend. Em um um cenário de maior escala, seria necessário trocar o banco de dados e aplicar a paginação no serviço de API: isso garantiria maior velocidade ao carregar páginas e itens na tela.

O uso de Uuid como primary key para o objeto usuário seria de melhor valia, visto que a quantidade de id's existentes é muito maior e aumenta a segurança (evitando ataques que adivinham o id auto-incrementado, como fuzzy attacks).



# Como dar Build e rodar
Este projeto contém uma versão minimizada do maven. Todas as dependencias serão baixadas através do mesmo.
Executar o "maven Build":
Todos os testes da aplicação são rodados no momento do build.

Nesta fase serão executados todos os testes para uma pré inicialização.
```sh
$  ./mvnw clean install
```
Após a mensagem "BUILD SUCCESS", a aplicação estará pronta para rodar:
    
```sh
$ ./mvnw spring-boot:run
```

Para instalar as dependencias necessárias para o front-end
    
```sh
$ npm install -i
```

Após instalar as dependencias    
```sh
$ npm start
```
Após inicializado, a aplicação está acessivel na porta 4200
# API
Busca de todos os usuários através da porta 8080
 - GET /user/getAll sem parametros e retornando uma lista com todos os usuários presentes no sistema.

    
# Swagger
Para encontrar a documentação da api através do swagger:
```sh
http://localhost:8080/swagger-ui.html#/
```

# H2
Para acesso ao banco de dados em memória:
Com usuário: sa e senha: aaa
```sh
http://localhost:8080/h2-console/
```
    

 
   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [markdown-it]: <https://github.com/markdown-it/markdown-it>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]: <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
   [PlMe]: <https://github.com/joemccann/dillinger/tree/master/plugins/medium/README.md>
   [PlGa]: <https://github.com/RahulHP/dillinger/blob/master/plugins/googleanalytics/README.md>
