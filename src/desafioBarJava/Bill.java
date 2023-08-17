package desafioBarJava;



public class Bill {
  
	  
	 public char gender;
	 public int beer;
	 public  int barbecue;
	 public int softDrink;
	 public double valueBeer;
	 public double valueSoftDrink;
	 public double valueBarbecue;
	 public double valueCouvert;
	 public double consumo;
	 public double total; 
	 public double ticket;
	 
	
	public double ticket() {
		if(gender == 'f') {
			ticket = 8;
			return ticket;
		}
		else {
			ticket = 10;
			return ticket;
		}
	}
	  
	public double feeding() {
		valueBeer = 5.00;
		valueSoftDrink = 3.00;
		valueBarbecue = 7.00;
		valueCouvert  = 4.00;
		consumo = (beer * valueBeer) + (softDrink * valueSoftDrink) + (barbecue * valueBarbecue); 
		return consumo;
		}
	
	public double cover() {
		if (consumo < 30) { 
			return  4;
		}
		else {
			return 0;
		}
	}
	
	public double total() {
		if (consumo > 30) {
			
			total = (beer * valueBeer) + (softDrink * valueSoftDrink) + (barbecue * valueBarbecue) + ticket;
			return total;
		}
			else  { 
				total = (beer * valueBeer) + (softDrink * valueSoftDrink) + (barbecue * valueBarbecue) + ticket + cover();
				return total;
			}
		}
	
		 
	}


