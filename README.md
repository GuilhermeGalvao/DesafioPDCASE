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

  - A solução foi desenvolvida, baseada em uma premissa na qual a listagem traz todos os usuários do sistema e o filtro é feito no front-end.
  - A solução contém em seu serviço o crud completo para a classe user.
  - Ao iniciar o serviço da API, o banco de dados é populado com 5 usuários.
  - A solução foi arquitetada em forma de API e em arquitetura de microserviço.
  - A comunicação do angular com a API é feita através do module HTTPClient.

# Melhorias e auto crítica
O projeto foi criado de uma forma bem simples para o entendimento e de forma a ser o mais claro possível para a leitura do usuário. O front-end é um pouco pobre visualmente, pois foi pensado na ideia de uma tela mais limpa, porém claro a escolha de cores e a adição de novos items entre outros fatores seria de grande valia para o visual da tela. A tabela utilizada no front-end é muito boa porém seria melhor para o caso de grande quantidade de dados, o uso de paginação para garantir velocidade ao carregar a página e os items.

Acredito que a solução atinge o objetivo de forma prática e rápida, porém como citado acima existem melhorias tanto no back-end quanto no front-end que deixariam a solução ainda melhor.

# Como dar Build e rodar
Este projeto contém uma versão minimizada do maven. Todas as dependencias serão baixadas através do mesmo.
Executar o "maven Build":
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
Após inicializado acessar através do browser 
[a link](http://localhost:4200/)

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
