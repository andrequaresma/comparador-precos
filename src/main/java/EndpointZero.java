import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@Path("/caminho")
public class EndpointZero {

    @GET
    @Path("/especifico")
    public String exibe(){
        return "Novo texto aleatório de saída";
    }

    @GET
    @Path("/com-parametro/{texto-digitado}")
    public String recebeParametroNoPath(@PathParam("texto-digitado") String nome){

        final var momentoExato = ZonedDateTime.ofInstant(
                Instant.now().plus(Duration.ofMinutes(1)),
                ZoneOffset.systemDefault());

        return "Exatamente às \n"
                + momentoExato
                + "\nvocê digitou " + nome.toUpperCase().trim()
                + " ao final do endereço.";
    }
}
