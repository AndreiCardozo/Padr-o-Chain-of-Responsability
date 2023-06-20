package padroescomportamentais.chainofresponsability;

public class TipoDocumentoCurriculo implements TipoDocumento {

    private static TipoDocumentoCurriculo tipoDocumentoCurriculo = new TipoDocumentoCurriculo();

    private TipoDocumentoCurriculo() {
    }

    public static TipoDocumentoCurriculo getTipoDocumentoCurriculo() {
        return tipoDocumentoCurriculo;
    }
}