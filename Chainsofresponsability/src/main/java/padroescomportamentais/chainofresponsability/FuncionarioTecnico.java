package padroescomportamentais.chainofresponsability;

public class FuncionarioTecnico extends Funcionario {

    public FuncionarioTecnico(Funcionario funcionarioSuperior) {
        listaDocumentos.add(TipoDocumentoRelatorio.getTipoDocumentoRelatorio());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoCargo() {
        return "Funcionário Técnico";
    }
}