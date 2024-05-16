# Sistema de Gerenciamento de Uma Unidade de Pronto Atendimento (UPA)

Este sistema permite o gerenciamento de uma Unidade de Pronto Atendimento (UPA), incluindo o cadastro de médicos, pacientes, solicitação e realização de exames, e atendimento prioritário. O sistema é iniciado com uma senha específica, depois do qual várias operações podem ser realizadas.

## Funcionalidades Principais

### 1. Iniciar o Sistema
- O sistema é iniciado com uma senha específica.
- Carrega uma lista de exames disponíveis.
- Cadastra médicos iniciais no sistema.

### 2. Cadastrar Novo Médico
- Permite o cadastro de novos médicos no sistema, garantindo que cada médico tenha um CRM único.

### 3. Cadastrar Novo Paciente
- Permite o cadastro de novos pacientes, atribuindo a eles uma matrícula única.
- Permite definir se o paciente possui prioridade no atendimento.

### 4. Editar Nome do Médico
- Permite a edição do nome de um médico existente no sistema.

### 5. Listar Pacientes em Espera de Atendimento
- Lista os pacientes que estão aguardando atendimento de um médico específico, identificado pelo CRM.

### 6. Encaminhamento do Paciente
- Encaminha um paciente para ser atendido pelo primeiro médico disponível, levando em consideração a prioridade de atendimento.

### 7. Atendimento do Paciente
- Marca o início do atendimento de um paciente por um médico, removendo-o da lista de espera.

### 8. Solicitar Exame
- Permite que um médico solicite exames para um paciente atendido por ele.

### 9. Listar Exames Realizados
- Lista os pacientes que realizaram um determinado tipo de exame.

### 10. Listar Pacientes Atendidos por Médico
- Lista os pacientes atendidos por um médico específico.

### 11. Histórico de Exames do Paciente
- Mostra o histórico de exames realizados por um determinado paciente.

### 12. Realizar Exames
- Marca como realizados os exames solicitados para um paciente.

## Estrutura do Projeto

O projeto está estruturado em pacotes e classes:

### Pacote `controller`

Este pacote contém a classe principal `SistemaUPA`, responsável por controlar todas as funcionalidades do sistema.

### Pacote `model`

Neste pacote, estão localizadas as classes que representam os modelos de dados do sistema:

- `Medico`: Representa um médico, com atributos como nome, CRM e listas de espera e pacientes atendidos.
- `Paciente`: Representa um paciente, com atributos como nome, matrícula, prioridade e listas de exames e exames concluídos.
- `Exame`: Representa um exame solicitado por um médico para um paciente.

### Pacote `util`

Este pacote contém a classe `ListaE`, uma implementação de uma lista encadeada utilizada em várias partes do sistema.

## Utilização

Para utilizar o sistema, basta instanciar a classe `SistemaUPA` e chamar os métodos conforme necessário para realizar as operações desejadas, como cadastrar médicos, pacientes, solicitar exames, realizar atendimentos, entre outras.

## Estrutura do Banco de Dados

O sistema não utiliza um banco de dados externo, mas sim armazena os dados em listas dentro da memória do programa.

