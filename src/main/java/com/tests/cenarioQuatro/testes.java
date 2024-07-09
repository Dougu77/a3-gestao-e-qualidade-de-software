package com.tests.cenarioQuatro;

import java.time.LocalDateTime;

public class testes {
    
    // E5. CRUD - Público

    // Teste de Criação (Create)

    @Test
    public void testCreatePublico() {
        PublicoRepository publicoRepository = new PublicoRepositoryImpl();
        Publico publico = new Publico();
        publico.setIdPublico(1);
        publico.setIdUsuario(1);
        publico.setNomePublico("Público A");
        publico.setDataCadastro(LocalDateTime.now());
        publico.setAtivo('S');
        publicoRepository.createPublico(publico);
        Publico createdPublico = publicoRepository.readPublico(1);
        assertNotNull(createdPublico);
        assertEquals("Público A", createdPublico.getNomePublico());
    }

    // Teste de Leitura (Read)

    @Test
    public void testReadPublico() {
        PublicoRepository publicoRepository = new PublicoRepositoryImpl();
        Publico publico = new Publico();
        publico.setIdPublico(1);
        publico.setIdUsuario(1);
        publico.setNomePublico("Público A");
        publico.setDataCadastro(LocalDateTime.now());
        publico.setAtivo('S');
        publicoRepository.createPublico(publico);
        Publico readPublico = publicoRepository.readPublico(1);
        assertNotNull(readPublico);
        assertEquals("Público A", readPublico.getNomePublico());
    }

    // Teste de Atualização (Update)

    @Test
    public void testUpdatePublico() {
        PublicoRepository publicoRepository = new PublicoRepositoryImpl();
        Publico publico = new Publico();
        publico.setIdPublico(1);
        publico.setIdUsuario(1);
        publico.setNomePublico("Público A");
        publico.setDataCadastro(LocalDateTime.now());
        publico.setAtivo('S');
        publicoRepository.createPublico(publico);
        publico.setNomePublico("Público B");
        publicoRepository.updatePublico(publico);
        Publico updatedPublico = publicoRepository.readPublico(1);
        assertEquals("Público B", updatedPublico.getNomePublico());
    }

    // Teste de Exclusão (Delete)

    @Test
    public void testDeletePublico() {
        PublicoRepository publicoRepository = new PublicoRepositoryImpl();
        Publico publico = new Publico();
        publico.setIdPublico(1);
        publico.setIdUsuario(1);
        publico.setNomePublico("Público A");
        publico.setDataCadastro(LocalDateTime.now());
        publico.setAtivo('S');
        publicoRepository.createPublico(publico);
        publicoRepository.deletePublico(1);
        Publico deletedPublico = publicoRepository.readPublico(1);
        assertNull(deletedPublico);
    }

}
