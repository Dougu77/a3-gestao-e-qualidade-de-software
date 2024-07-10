# A3 - Gestão e qualidade de software

## Sumário

[Cenário 1: Perfil de Usuário](#cen%C3%A1rio-1-perfil-de-usu%C3%A1rio)
- [Caso 1: Create](#caso-1-create)
- [Caso 2: Read](#caso-2-read)
- [Caso 3: Update](#caso-3-update)
- [Caso 4: Delete](#caso-4-delete)

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

- **ID:** 01
- **Descrição:** Testa a crição de um usuário.
- **Condição de aceite:** Ter um usuário criado com sucesso.

