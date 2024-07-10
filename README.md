# A3 - Gestão e qualidade de software

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
| Setar a data de cadastro | Data de cadastro preenchida com a hora que o tese ocorre |
| Setar o ID do usuário | ID do usuário preenchido com "1" |
| Setar o status de ativação | Status da ativo preenchido com "S" |
| Enviar o perfil criado para o sistema | Perfil criado com sucesso |
| Verificar se o perfil foi criado | Perfil lido ter o mesmo nome de perfil que o perfil recém criado |

### Caso 2: Read

- **ID:** 02
- **Descrição:** Testa a leitura de um perfil de usuário.
- **Condição de aceite:** Ter um perfil de usuário lido com sucesso.

