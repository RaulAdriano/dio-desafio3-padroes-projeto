package dio.gof.facade;

import subsistema1.crm.CrmServer;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrar(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmServer.gravarCliente(nome,cep,cidade,estado);

    }
}
