package abstractioncase1;



	public class Liquiddoor extends Door{
		private float flowQuotient;
		public Liquiddoor(String doorName, float flowQuotient) {
			super(doorName);
			this.flowQuotient = flowQuotient;
		}
		public float getFlowQuotient() {
			return flowQuotient;
		}
		public void setFlowQuotient(float flowQuotient) {
			this.flowQuotient = flowQuotient;
		}
		
		public void display2() {
			int power = 0;
	        int a = 2,i=2,k,n=3;
	             power=(int)Math.pow(2,2);
	             int temp = power -1;
	             System.out.print(temp+" ");
	       while(i<=flowQuotient)
	        {
	           
	            for(k=2;k<=n-1;k++)
	            {
	                if(n%k==0)
	                {
	                    break;
	                }
	            }
	        
	            if(k==n)
	            {
	            power=(int)Math.pow(2,n);
	            int mp = power -1;
	               System.out.print(mp+" ");
	            i++;
	            }
	            n++;
	            }

		}
	}



