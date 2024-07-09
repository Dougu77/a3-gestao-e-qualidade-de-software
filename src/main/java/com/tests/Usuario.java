package com.tests;

import java.time.LocalDateTime;

public class Usuario {
    
    // E3. CRUD - Usuário

    // Teste de Criação (Create)

    @Test
    public void testCreateUsuario() {
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNomeUsuario("John Doe");
        usuario.setEmailUsuario("john.doe@example.com");
        usuario.setLoginUsuario("johndoe");
        usuario.setSenhaUsuario("password");
        usuario.setDataCadastro(LocalDateTime.now());
        usuario.setTelefoneCelular("123456789");
        usuario.setAtivo('S');
        usuarioRepository.createUsuario(usuario);
        Usuario createdUsuario = usuarioRepository.readUsuario(1);
        assertNotNull(createdUsuario);
        assertEquals("John Doe", createdUsuario.getNomeUsuario());
    }

    // Teste de Leitura (Read)

    @Test
    public void testReadUsuario() {
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNomeUsuario("John Doe");
        usuario.setEmailUsuario("john.doe@example.com");
        usuario.setLoginUsuario("johndoe");
        usuario.setSenhaUsuario("password");
        usuario.setDataCadastro(LocalDateTime.now());
        usuario.setTelefoneCelular("123456789");
        usuario.setAtivo('S');
        usuarioRepository.createUsuario(usuario);
        Usuario readUsuario = usuarioRepository.readUsuario(1);
        assertNotNull(readUsuario);
        assertEquals("John Doe", readUsuario.getNomeUsuario());
    }

    // Teste de Atualização (Update)

    @Test
    public void testUpdateUsuario() {
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNomeUsuario("John Doe");
        usuario.setEmailUsuario("john.doe@example.com");
        usuario.setLoginUsuario("johndoe");
        usuario.setSenhaUsuario("password");
        usuario.setDataCadastro(LocalDateTime.now());
        usuario.setTelefoneCelular("123456789");
        usuario.setAtivo('S');
        usuarioRepository.createUsuario(usuario);
        usuario.setNomeUsuario("John Smith");
        usuarioRepository.updateUsuario(usuario);
        Usuario updatedUsuario = usuarioRepository.readUsuario(1);
        assertEquals("John Smith", updatedUsuario.getNomeUsuario());
    }

    // Teste de Exclusão (Delete)

    @Test
    public void testDeleteUsuario() {
        UsuarioRepository usuarioRepository = new UsuarioRepositoryImpl();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setNomeUsuario("John Doe");
        usuario.setEmailUsuario("john.doe@example.com");
        usuario.setLoginUsuario("johndoe");
        usuario.setSenhaUsuario("password");
        usuario.setDataCadastro(LocalDateTime.now());
        usuario.setTelefoneCelular("123456789");
        usuario.setAtivo('S');
        usuarioRepository.createUsuario(usuario);
        usuarioRepository.deleteUsuario(1);
        Usuario deletedUsuario = usuarioRepository.readUsuario(1);
        assertNull(deletedUsuario);
    }
}
