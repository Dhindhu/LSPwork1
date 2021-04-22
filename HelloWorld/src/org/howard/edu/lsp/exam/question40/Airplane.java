package org.howard.edu.lsp.exam.question40;

/**
 * Airplane class implements Flying 
 * @author chidindu
 *
 */
public class Airplane implements Flying {
	public Airplane() {
		
	}

    @Override

    public void fly() {
       System.out.println(getClass().getSimpleName() + " is flying");
	}
}
