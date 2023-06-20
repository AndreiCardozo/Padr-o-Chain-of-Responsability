package padroescomportamentais.chainofresponsability;

public class TipoDocumentoContrato implements TipoDocumento {

    private static TipoDocumentoContrato tipoDocumentoContrato = new TipoDocumentoContrato();

    private TipoDocumentoContrato() {
    }

    public static TipoDocumentoContrato getTipoDocumentoContrato() {
        return tipoDocumentoContrato;
    }
}
