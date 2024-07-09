package com.tests;

import java.time.LocalDateTime;

public class cenarioUm {

    // E2. CRUD - Perfil de Usuário

    // Teste de Criação (Create)

    @Test
    public void testCreatePerfil() {
        PerfilRepository perfilRepository = new PerfilRepositoryImpl();
        Perfil perfil = new Perfil();
        perfil.setIdPerfil(1);
        perfil.setNomePerfil("Admin");
        perfil.setDataCadastro(LocalDateTime.now());
        perfil.setIdUsuario(1);
        perfil.setAtivo('S');
        perfilRepository.createPerfil(perfil);
        Perfil createdPerfil = perfilRepository.readPerfil(1);
        assertNotNull(createdPerfil);
        assertEquals("Admin", createdPerfil.getNomePerfil());
    }

    // Teste de Leitura (Read)

    @Test
    public void testReadPerfil() {
        PerfilRepository perfilRepository = new PerfilRepositoryImpl();
        Perfil perfil = new Perfil();
        perfil.setIdPerfil(1);
        perfil.setNomePerfil("Admin");
        perfil.setDataCadastro(LocalDateTime.now());
        perfil.setIdUsuario(1);
        perfil.setAtivo('S');
        perfilRepository.createPerfil(perfil);
        Perfil readPerfil = perfilRepository.readPerfil(1);
        assertNotNull(readPerfil);
        assertEquals("Admin", readPerfil.getNomePerfil());
    }

    // Teste de Atualização (Update)

    @Test
    public void testUpdatePerfil() {
        PerfilRepository perfilRepository = new PerfilRepositoryImpl();
        Perfil perfil = new Perfil();
        perfil.setIdPerfil(1);
        perfil.setNomePerfil("Admin");
        perfil.setDataCadastro(LocalDateTime.now());
        perfil.setIdUsuario(1);
        perfil.setAtivo('S');
        perfilRepository.createPerfil(perfil);
        perfil.setNomePerfil("Super Admin");
        perfilRepository.updatePerfil(perfil);
        Perfil updatedPerfil = perfilRepository.readPerfil(1);
        assertEquals("Super Admin", updatedPerfil.getNomePerfil());
    }

    // Teste de Exclusão (Delete)

    @Test
    public void testDeletePerfil() {
        PerfilRepository perfilRepository = new PerfilRepositoryImpl();
        Perfil perfil = new Perfil();
        perfil.setIdPerfil(1);
        perfil.setNomePerfil("Admin");
        perfil.setDataCadastro(LocalDateTime.now());
        perfil.setIdUsuario(1);
        perfil.setAtivo('S');
        perfilRepository.createPerfil(perfil);
        perfilRepository.deletePerfil(1);
        Perfil deletedPerfil = perfilRepository.readPerfil(1);
        assertNull(deletedPerfil);
    }
}
