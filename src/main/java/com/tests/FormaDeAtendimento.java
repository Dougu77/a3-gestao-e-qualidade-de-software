package com.tests;

import java.time.LocalDateTime;

public class FormaDeAtendimento {
    
    // E4. CRUD - Forma de atendimento

    // Teste de Criação (Create)

    @Test
    public void testCreateFormaAtendimento() {
        FormaAtendimentoRepository formaAtendimentoRepository = new FormaAtendimentoRepositoryImpl();
        FormaAtendimento formaAtendimento = new FormaAtendimento();
        formaAtendimento.setIdFormAtendimento(1);
        formaAtendimento.setIdUsuario(1);
        formaAtendimento.setNomeAtendimento("Atendimento Online");
        formaAtendimento.setDataCadastro(LocalDateTime.now());
        formaAtendimento.setAtivo('S');
        formaAtendimentoRepository.createFormaAtendimento(formaAtendimento);
        FormaAtendimento createdFormaAtendimento = formaAtendimentoRepository.readFormaAtendimento(1);
        assertNotNull(createdFormaAtendimento);
        assertEquals("Atendimento Online", createdFormaAtendimento.getNomeAtendimento());
    }

    // Teste de Leitura (Read)

    @Test
    public void testReadFormaAtendimento() {
        FormaAtendimentoRepository formaAtendimentoRepository = new FormaAtendimentoRepositoryImpl();
        FormaAtendimento formaAtendimento = new FormaAtendimento();
        formaAtendimento.setIdFormAtendimento(1);
        formaAtendimento.setIdUsuario(1);
        formaAtendimento.setNomeAtendimento("Atendimento Online");
        formaAtendimento.setDataCadastro(LocalDateTime.now());
        formaAtendimento.setAtivo('S');
        formaAtendimentoRepository.createFormaAtendimento(formaAtendimento);
        FormaAtendimento readFormaAtendimento = formaAtendimentoRepository.readFormaAtendimento(1);
        assertNotNull(readFormaAtendimento);
        assertEquals("Atendimento Online", readFormaAtendimento.getNomeAtendimento());
    }

    // Teste de Atualização (Update)

    @Test
    public void testUpdateFormaAtendimento() {
        FormaAtendimentoRepository formaAtendimentoRepository = new FormaAtendimentoRepositoryImpl();
        FormaAtendimento formaAtendimento = new FormaAtendimento();
        formaAtendimento.setIdFormAtendimento(1);
        formaAtendimento.setIdUsuario(1);
        formaAtendimento.setNomeAtendimento("Atendimento Online");
        formaAtendimento.setDataCadastro(LocalDateTime.now());
        formaAtendimento.setAtivo('S');
        formaAtendimentoRepository.createFormaAtendimento(formaAtendimento);
        formaAtendimento.setNomeAtendimento("Atendimento Presencial");
        formaAtendimentoRepository.updateFormaAtendimento(formaAtendimento);
        FormaAtendimento updatedFormaAtendimento = formaAtendimentoRepository.readFormaAtendimento(1);
        assertEquals("Atendimento Presencial", updatedFormaAtendimento.getNomeAtendimento());
    }

    // Teste de Exclusão (Delete)

    @Test
    public void testDeleteFormaAtendimento() {
        FormaAtendimentoRepository formaAtendimentoRepository = new FormaAtendimentoRepositoryImpl();
        FormaAtendimento formaAtendimento = new FormaAtendimento();
        formaAtendimento.setIdFormAtendimento(1);
        formaAtendimento.setIdUsuario(1);
        formaAtendimento.setNomeAtendimento("Atendimento Online");
        formaAtendimento.setDataCadastro(LocalDateTime.now());
        formaAtendimento.setAtivo('S');
        formaAtendimentoRepository.createFormaAtendimento(formaAtendimento);
        formaAtendimentoRepository.deleteFormaAtendimento(1);
        FormaAtendimento deletedFormaAtendimento = formaAtendimentoRepository.readFormaAtendimento(1);
        assertNull(deletedFormaAtendimento);
    }
}
