package currencyRates;

public class Currency {
	
	double[]exRates;
	void setRates(double[] rates)
	{
	exRates=rates;
	}
	
	
	void updateRates(int arrayIndex,double rateVal)
	{
		exRates[arrayIndex]=rateVal;
	}
    double getRates(int arrayIndex)
    {
    	 return exRates[arrayIndex];
    }
    
    double computeTransferAmt(int arrayIndex,double amt)
    {
    	return exRates[arrayIndex]*amt;
    }
    void print()
    {
    	System.out.println("\n Rupee="+exRates[0]);
    	System.out.println("\n OMR="+exRates[1]);
    	System.out.println("\n USD="+exRates[2]);
    	System.out.println("\n Euro="+exRates[3]);
    	System.out.println("\n AED="+exRates[4]);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Currency CC=new Currency();
         double rates[]= {10.0,200.8,68.5,49.7,25.0};
         CC.setRates(rates);
         
         CC.updateRates(0, 24.17);
         
       double total=CC.computeTransferAmt(4, 100);
       System.out.println("Total Amount="+total+"\n");
       
         CC.print();
         
	}

}
