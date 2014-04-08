package ch.fhnw.bank.server.rest;

import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ch.fhnw.bank.Bank;
import ch.fhnw.bank.InactiveException;
import ch.fhnw.bank.OverdrawException;
import ch.fhnw.bank.server.ServerBank;

@Path("bank")
public class BankResource {
	private static final Bank BANK = ServerBank.getInstance();

	@GET
	@Path("accounts")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAcccounts() throws IOException {
		StringBuilder sb = new StringBuilder();
		for (String number : BANK.getAccountNumbers()) {
			sb.append(number + ",");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return Response.ok(sb.toString()).build();
	}

	@POST
	@Path("accounts/{owner}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAccount(@PathParam("owner") String owner) throws IOException {
		String number = BANK.createAccount(owner);
		return Response.ok(number).build();
	}

	@DELETE
	@Path("accounts/{number}")
	public Response deleteAccount(@PathParam("number") String number) throws IOException {
		if (BANK.closeAccount(number)) {
			return Response.ok().build();
		}
		return Response.status(410).build(); // Gone
	}

	@GET
	@Path("transactions/{number}/{amount}")
	public Response withdraw(@PathParam("number") String number, @PathParam("amount") double amount) throws IOException {
		try {
			BANK.getAccount(number).withdraw(amount);
			return Response.ok().build();
		} catch (IllegalArgumentException e) {
			return Response.status(400).build(); // Bad Requeset
		} catch (OverdrawException e) {
			return Response.status(403).build(); // Forbidden
		} catch (InactiveException e) {
			return Response.status(410).build(); // Gone
		}
	}

	@POST
	@Path("transactions/{number}/{amount}")
	public Response deposit(@PathParam("number") String number, @PathParam("amount") double amount) throws IOException {
		try {
			BANK.getAccount(number).deposit(amount);
			return Response.ok().build();
		} catch (IllegalArgumentException e) {
			return Response.status(400).build(); // Bad Requeset
		} catch (InactiveException e) {
			return Response.status(410).build(); // Gone
		}
	}

	@POST
	@Path("transactions/{numbera}/{numberb}/{amount}")
	public Response transfer(@PathParam("numbera") String numbera, @PathParam("numberb") String numberb,
			@PathParam("amount") double amount) throws IOException {
		try {
			BANK.transfer(BANK.getAccount(numbera), BANK.getAccount(numberb), amount);
			return Response.ok().build();
		} catch (IllegalArgumentException e) {
			return Response.status(400).build(); // Bad Requeset
		} catch (OverdrawException e) {
			return Response.status(403).build(); // Forbidden
		} catch (InactiveException e) {
			return Response.status(410).build(); // Gone
		}
	}
}
