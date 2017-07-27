package com.vanguard.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vanguard.data.HoldingList;
import com.vanguard.data.Holdings;
import com.vanguard.data.Price;
import com.vanguard.data.PriceList;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/")
public class RootResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("/holdings")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HoldingList getIt() {
		HoldingList holdingList = new HoldingList();
		Holdings holding = new Holdings();
		holding.setName("500 Index");
		holding.setShares(100.3);
		holding.setFundNumber("0040");
		holdingList.getHoldingList().add(holding);
		
		Holdings holding2 = new Holdings();
		holding2.setName("Vanguard Total Stock Market ETF");
		holding2.setShares(11.9);
		holding2.setFundNumber("0970");
		holdingList.getHoldingList().add(holding2);
        return holdingList;
    }
	
	@Path("/prices")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public PriceList getPrices() {
		PriceList priceList = new PriceList();
		Price price = new Price();
		price.setFundNumber("0040");
		price.setPrice(123.00);
		priceList.getPriceList().add(price);
		
		Price price2 = new Price();
		price2.setFundNumber("0970");
		price2.setPrice(101.24);
		priceList.getPriceList().add(price2);
		
		return priceList;
	}
}
