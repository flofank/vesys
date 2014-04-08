package ch.fhnw.bank.server.rest;

import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.server.ServerBank;

@Path("account")
public class AccountResource {
	private static final Bank BANK = ServerBank.getInstance();

	@GET
	@Path("{number}/owner")
	public Response getOwner(@PathParam("number") String number) throws IOException {
		return Response.ok(BANK.getAccount(number).getOwner()).build();
	}
	
	@GET
	@Path("{number}/balance")
	public Response getBalance(@PathParam("number") String number) throws IOException {
		return Response.ok(BANK.getAccount(number).getBalance()).build();
	}
	
	@GET
	@Path("{number}/active")
	public Response isActive(@PathParam("number") String number) throws IOException {
		return Response.ok(BANK.getAccount(number).isActive()).build();
	}
}
