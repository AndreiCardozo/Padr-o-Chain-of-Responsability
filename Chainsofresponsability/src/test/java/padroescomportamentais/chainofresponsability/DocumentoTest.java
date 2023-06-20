package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    FuncionarioJogador jogador;
    FuncionarioAssistenteTecnico assistentetecnico;
    FuncionarioTecnico tecnico;
    FuncionarioVicePresidente vicepresidente;

    @BeforeEach
    void setUp() {
        jogador = new FuncionarioJogador(null);
        assistentetecnico = new FuncionarioAssistenteTecnico(jogador);
        tecnico = new FuncionarioTecnico(assistentetecnico);
        vicepresidente = new FuncionarioVicePresidente(tecnico);
    }

    @Test
    void deveRetornarVicePresidenteParaAssinaturaContrato() {
        assertEquals("Funcionário Vice-Presidente", vicepresidente.assinarDocumento(new Documento(TipoDocumentoContrato.getTipoDocumentoContrato())));
    }

    @Test
    void deveRetornarTecnicoParaAssinaturaRelatorio() {
        assertEquals("Funcionário Técnico", vicepresidente.assinarDocumento(new Documento(TipoDocumentoRelatorio.getTipoDocumentoRelatorio())));
    }

    @Test
    void deveRetornarAssistenteTecnicoParaAssinaturaCertificado() {
        assertEquals("Funcionário Assistente Técnico", vicepresidente.assinarDocumento(new Documento(TipoDocumentoCertificado.getTipoDocumentoCertificado())));
    }

    @Test
    void deveRetornarJogadorParaAssinaturaCurriculo() {
        assertEquals("Funcionário Jogador", vicepresidente.assinarDocumento(new Documento(TipoDocumentoCurriculo.getTipoDocumentoCurriculo())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaHistorico() {
        assertEquals("Sem assinatura", vicepresidente.assinarDocumento(new Documento(TipoDocumentoHistorico.getTipoDocumentoHistorico())));
    }

}