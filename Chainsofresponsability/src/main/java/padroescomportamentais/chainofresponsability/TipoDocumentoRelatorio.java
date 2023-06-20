package padroescomportamentais.chainofresponsability;

public class TipoDocumentoRelatorio implements TipoDocumento {

    private static TipoDocumentoRelatorio tipoDocumentoRelatorio = new TipoDocumentoRelatorio();

    private TipoDocumentoRelatorio() {
    }

    public static TipoDocumentoRelatorio getTipoDocumentoRelatorio() {
        return tipoDocumentoRelatorio;
    }
}