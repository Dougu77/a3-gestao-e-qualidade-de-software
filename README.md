# A3 - Gestão e qualidade de software

## Sumário

[Cenário 1: Perfil de Usuário](#cen%C3%A1rio-1-perfil-de-usu%C3%A1rio)
- [Caso 1: Create](#caso-1-create)
- [Caso 2: Read](#caso-2-read)
- [Caso 3: Update](#caso-3-update)
- [Caso 4: Delete](#caso-4-delete)

[Cenário 2: Usuário](#cen%C3%A1rio-2-usu%C3%A1rio)
- [Caso 1: Create](#caso-1-create-1)
- [Caso 2: Read](#caso-2-read-1)
- [Caso 3: Update](#caso-3-update-1)
- [Caso 4: Delete](#caso-4-delete-1)

## Cenário 1: Perfil de Usuário

- **Objetivo:** Testar o CRUD dos Perfis dos Usuários.

### Caso 1: Create

- **ID:** 01
- **Descrição:** Testa a crição de um perfil de usuário.
- **Condição de aceite:** Ter um perfil de usuário criado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do perfil | ID do perfil preenchido com "1" |
| Setar o nome do perfil | Nome do perfil preenchido com "Admin" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o perfil criado para o sistema | Perfil criado com sucesso |
| Verificar se o perfil foi criado | Perfil lido ter o mesmo nome de perfil que o perfil recém criado |

### Caso 2: Read

- **ID:** 02
- **Descrição:** Testa a leitura de um perfil de usuário.
- **Condição de aceite:** Ter um perfil de usuário lido com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do perfil | ID do perfil preenchido com "1" |
| Setar o nome do perfil | Nome do perfil preenchido com "Admin" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o perfil criado para o sistema | Perfil criado com sucesso |
| Verificar se o perfil foi criado | Perfil lido ter o mesmo nome de perfil que o perfil recém criado |

### Caso 3: Update

- **ID:** 03
- **Descrição:** Testa a atualização de um perfil de usuário.
- **Condição de aceite:** Ter um perfil de usuário atualizado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do perfil | ID do perfil preenchido com "1" |
| Setar o nome do perfil | Nome do perfil preenchido com "Admin" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o perfil criado para o sistema | Perfil criado com sucesso |
| Setar um novo nome para o perfil | Nome do perfil preenchido com "Super Admin" |
| Enviar a atualização para o sistema | Perfil atualizado com sucesso |
| Verificar se o perfil foi atualizado | Perfil lido ter o nome de perfil atualizado |

### Caso 4: Delete

- **ID:** 04
- **Descrição:** Testa a remoção de um perfil de usuário.
- **Condição de aceite:** Ter um perfil de usuário deletado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do perfil | ID do perfil preenchido com "1" |
| Setar o nome do perfil | Nome do perfil preenchido com "Admin" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o perfil criado para o sistema | Perfil criado com sucesso |
| Deletar o perfil do sistema | Perfil deletado com sucesso |
| Verificar se o perfil foi deletado | Perfil lido não existir |

## Cenário 2: Usuário

- **Objetivo:** Testar o CRUD dos Usuários.

### Caso 1: Create

- **ID:** 05
- **Descrição:** Testa a crição de um usuário.
- **Condição de aceite:** Ter um usuário criado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome do usuário | Nome do usuário preenchido com "John Doe" |
| Setar o e-mail do usuário | E-mail do usuário preenchido com "john.doe@[]()example.com" |
| Setar o login do usuário | Login do usuário preenchido com "johndoe" |
| Setar a senha do usuário | Senha do usuário preenchida com "password" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o celular do usuário | Celular do usuário preenchido com "123456789" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o usuário criado para o sistema | Usuário criado com sucesso |
| Verificar se o usuário foi criado | Usuário lido ter o mesmo nome de usuário que o usuário recém criado |

### Caso 2: Read

- **ID:** 06
- **Descrição:** Testa a leitura de um usuário.
- **Condição de aceite:** Ter um usuário lido com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome do usuário | Nome do usuário preenchido com "John Doe" |
| Setar o e-mail do usuário | E-mail do usuário preenchido com "john.doe@[]()example.com" |
| Setar o login do usuário | Login do usuário preenchido com "johndoe" |
| Setar a senha do usuário | Senha do usuário preenchida com "password" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o celular do usuário | Celular do usuário preenchido com "123456789" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o usuário criado para o sistema | Usuário criado com sucesso |
| Verificar se o usuário foi criado | Perfil lido ter o mesmo nome de usuário que o perfil recém criado |

### Caso 3: Update

- **ID:** 07
- **Descrição:** Testa a atualização de um usuário.
- **Condição de aceite:** Ter um usuário atualizado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome do usuário | Nome do usuário preenchido com "John Doe" |
| Setar o e-mail do usuário | E-mail do usuário preenchido com "john.doe@[]()example.com" |
| Setar o login do usuário | Login do usuário preenchido com "johndoe" |
| Setar a senha do usuário | Senha do usuário preenchida com "password" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o celular do usuário | Celular do usuário preenchido com "123456789" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o usuário criado para o sistema | Usuário criado com sucesso |
| Setar um novo nome para o usuário | Nome do usuário preenchido com "John Smith" |
| Enviar a atualização para o sistema | Usuário atualizado com sucesso |
| Verificar se o usuário foi atualizado | Usuário lido ter o mesmo nome de usuário que o usuário recém atualizado |

### Caso 4: Delete

- **ID:** 08
- **Descrição:** Testa a remoção de um usuário.
- **Condição de aceite:** Ter um usuário deletado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome do usuário | Nome do usuário preenchido com "John Doe" |
| Setar o e-mail do usuário | E-mail do usuário preenchido com "john.doe@[]()example.com" |
| Setar o login do usuário | Login do usuário preenchido com "johndoe" |
| Setar a senha do usuário | Senha do usuário preenchida com "password" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o celular do usuário | Celular do usuário preenchido com "123456789" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o usuário criado para o sistema | Usuário criado com sucesso |
| Deletar o usuário do sistema | Usuário deletado com sucesso |
| Verificar se o usuário foi deletado | Usuário lido não existir |

## Cenário 3: Forma de atendimento

- **Objetivo:** Testar o CRUD das formas de atendimento.

### Caso 1: Create

- **ID:** 09
- **Descrição:** Testa a crição de uma forma de atendimento.
- **Condição de aceite:** Ter uma forma de atendimento criado com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID da forma de atendimento | ID da forma de atendimento preenchido com "1" |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome da forma de atendimento | Nome da forma de atendimento preenchido com "Atendimento Online" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar a forma de atendimento criada para o sistema | Forma de atendimento criada com sucesso |
| Verificar se a forma de atendimento foi criada | Forma de atendimento lida ter o mesmo nome da forma de atendimento que a forma de atendimento recém criada |

### Caso 2: Read

- **ID:** 10
- **Descrição:** Testa a leitura de uma forma de atendimento.
- **Condição de aceite:** Ter uma forma de atendimento lida com sucesso.

| Ação | Resultado esperado |
| :---: | :---: |
| Setar o ID da forma de atendimento | ID da forma de atendimento preenchido com "1" |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o nome da forma de atendimento | Nome da forma de atendimento preenchido com "Atendimento Online" |
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o teste ocorre |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar a forma de atendimento criada para o sistema | Forma de atendimento criada com sucesso |
| Verificar se a forma de atendimento foi criada | Forma de atendimento lida ter o mesmo nome da forma de atendimento que a forma de atendimento recém criada |

### Caso 3: Update

- **ID:** 11
- **Descrição:** Testa a atualização de uma forma de atendimento.
- **Condição de aceite:** Ter uma forma de atendimento atualizada com sucesso.

