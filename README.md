Contextualização
A empresa fictícia "TechStore" utiliza uma única classe, a ProcessadorDePedido,
para lidar com todo o ciclo de vida de um pedido de um cliente. Isso inclui desde a
verificação inicial do estoque, o cálculo de taxas complexas e a notificação de
sistemas externos (como o gateway de pagamento e o sistema de logística).
O time de desenvolvimento percebeu que esta classe é a mais instável do sistema:
qualquer mudança na regra de frete, no parceiro de pagamento ou na lógica de
notificação obriga a alterá-la, gerando alto risco de quebrar o fluxo de pagamento.





1. Identifique as quatro responsabilidades distintas presentes na classe
ProcessadorDePedido.

R: Para separar uma responsabilidade para cada classe eu criei as seguintes classes ProcessadorDePedido, CalcularFrete, EnviarConfirmacaoPorEmail, SalvarNoBancoDeDados e a Main para fazer a orquestração dos métodos, desta forma cada classe tem apenas uma função


2. Crie a solução adaptada (SRP Aplicado), separando essas quatro
responsabilidades em quatro novas classes especializadas e uma nova
classe de orquestração (ServicoDePedido ou similar) para coordenar o fluxo.

R: Como ja foi dito foi separado cada responsabilidade para uma classe, assim totalizando 4 classes de acordo com as responsabilidades e 1 classe para fazer a manipulação de métodos


3. Explique por que essa separação é crucial para a manutenção de um sistema
de e-commerce

R: Essa separação é essencial para facilitar a leitura do código e na manutenção do códdigo, pois com essas separações é muitas mais facil encontrar um erro, por exemplo se eu estou com erro no calculo do frete, eu sei que eu tenho que olhar a classe CalcularFrete
assim desta forma fica muito mais facil de realizar manutenções e é mais rápido de resolver o problema
