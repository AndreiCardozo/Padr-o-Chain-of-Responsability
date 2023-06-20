package padroescomportamentais.chainofresponsability;

public class FuncionarioAssistenteTecnico extends Funcionario {

    public FuncionarioAssistenteTecnico(Funcionario funcionarioSuperior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoCargo() {
        return "Funcionário Assistente Técnico";
    }
}