package padroescomportamentais.chainofresponsability;

public class FuncionarioVicePresidente extends Funcionario {

    public FuncionarioVicePresidente(Funcionario funcionarioSuperior) {
        listaDocumentos.add(TipoDocumentoContrato.getTipoDocumentoContrato());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoCargo() {
        return "Funcionário Vice-Presidente";
    }
}