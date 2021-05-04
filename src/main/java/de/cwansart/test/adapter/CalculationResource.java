package de.cwansart.test.adapter;

import de.cwansart.test.domain.CalculationService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("calculation")
public class CalculationResource {

    @Inject
    private CalculationService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getCalculationResult() {
        String message = String.format("The Calculation took %d seconds.", this.service.calculate());
        CalculationResponseDTO response = new CalculationResponseDTO(message);
        return Response.ok(response).build();
    }
}
