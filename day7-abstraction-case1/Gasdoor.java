package abstractioncase1;
	public class Gasdoor extends Door {
	private String nameOfGas;
		
		public Gasdoor(String doorName, String nameOfGas) {
			super(doorName);
			this.nameOfGas = nameOfGas;
		}

		public String getNameOfGas() {
			return nameOfGas;
		}

		public void setNameOfGas(String nameOfGas) {
			this.nameOfGas = nameOfGas;
		}
		public void display1() {
			String rev = " ";
		int length=nameOfGas.length();
			for(int i=length-1;i>=0;i--)
			{
			    rev = rev + nameOfGas.charAt(i);
			}
			if(nameOfGas.equals(rev))
		    	System.out.println("Palindrome");
		    	else
		    	
		        	System.out.println("Not a Palindrome");
		}
		
	}



