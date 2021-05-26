<h1 align="center">NCR Project</h1>

<h2>Construção do projeto</h2>

<p>Para o projeto, inicializei utilizando o HTML e o CSS para fazer o front-end criando a página home e a página de cadastros de produtos para o banco de dados, através do próprio HTML foi possível criar as condições exigidas para o cadastro no banco, transmitindo também as mensagens de erro caso as condições não fossem respeitadas. Durante a criação do banco de dados deduzi que seria mais prático utilizar a JPA integrando o Wildfly 11 com o MySQL tendo o Hibernate como mediador, tive que adicionar alguns caminhos no arquivo standalone.xml do Wildfly para poder conectar com o banco de dados escolhido (criei também um usuário e senha para poder acessar o banco, caso seja necessário a utilização dos mesmos apenas colocar a palavra "root" em ambos para ter o acesso).</p>

<h2>Problemas encontrados</h2>

<p>Durante a criação do projeto, tive problemas em fazer a integração do back-end com o front-end, não consegui achar soluções para driblar tal dificuldade por falta de informações, atrapalhando a continuidade no front-end. Por tais motivos, não tive condições de criar uma tela com a listagem dos produtos.</p>

<h2>Caminhos e pastas do projeto</h2>
<p>Para localizar o front do projeto "maven-project -> src/main/webapp".
Para localizar os arquivos .java do projeto "ncrproject -> build/classes -> proj".</p>
