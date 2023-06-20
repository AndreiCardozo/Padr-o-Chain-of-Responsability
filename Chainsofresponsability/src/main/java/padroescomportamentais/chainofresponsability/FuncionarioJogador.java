package padroescomportamentais.chainofresponsability;

public class FuncionarioJogador extends Funcionario {

    public FuncionarioJogador(Funcionario funcionarioSuperior) {
        listaDocumentos.add(TipoDocumentoCurriculo.getTipoDocumentoCurriculo());
        setFuncionarioSuperior(funcionarioSuperior);
    }

    public String getDescricaoCargo() {
        return "Funcionário Jogador";
    }
}