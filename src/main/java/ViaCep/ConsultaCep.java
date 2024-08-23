package ViaCep;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@RestClient
@ApplicationScoped
@Path("/consulta/{cep}")
public class ConsultaCep {

    @GET
    public Endereco consulta(@PathParam("cep") String cep) throws Exception {
        return ViaCepService.buscaEnderecoPelo(cep);
    }
}
