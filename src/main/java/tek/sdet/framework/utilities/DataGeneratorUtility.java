package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {
	
	public static void main(String []args) {
		System.out.println(data("firstName"));
		System.out.println(data("lastName"));
		System.out.println(data("email"));
		System.out.println(data("fullName"));
		System.out.println(data("address"));
		System.out.println(data("city"));
		System.out.println(data("zipCode"));
		System.out.println(data("state"));
		
		System.out.println(data("cardNumber"));
		System.out.println(data("nameOnCard"));
		System.out.println(data("expirationMonth"));
		System.out.println(data("expirationYear"));
		System.out.println(data("securityCode"));
		
		
	}

	public static String data(String input) {
		// TODO Auto-generated method stub
	
		
		Faker faker = new Faker();
		String outPut ="";
		int outPut2;
		if (input.equals("firstName")) {
			outPut=faker.name().firstName();
		}
		else if (input.equals("lastName")){
		    outPut=faker.name().lastName().replaceAll("'", "");
	}
		else if (input.equals("email")) {
		//outPut=faker.name().firstName()+ "." +faker.name().lastName() +"@tekschool.us";
		outPut=faker.expression("#{letterify '???.????@tekschool.us'}");
	}
	else if(input.equals("phoneNumber")) {
		outPut=faker.phoneNumber().cellPhone();
	}
	else if(input.equals("fullName")) {
		outPut=faker.name().firstName().replace("'", "");
	}
	else if (input.equals("StreetAddress")) {
		outPut=faker.address().streetAddress();
	       
        } else if (input.equals("city")) {
            outPut = faker.address().city();
        } else if (input.equals("state")) {
            outPut = faker.address().state();
        } else if(input.equals("apt")) {
        	outPut=faker.address().secondaryAddress();
        } else if (input.equals("zipcode")) {
            outPut = faker.address().zipCode();
        }
            else if (input.equals("password")) {
            	outPut=faker.expression("#{letterify 'Test@1?????'}");
      
        }else if (input.equals("country")) {
                outPut = "United States";
                
        } else if(input.equals("previousPassword")) {
        	outPut="Adamsho1@";       
                
        } else if(input.equals("newPassword")) {
        	outPut=faker.expression("#{letterify 'Test@1?????'}");
        	
        } else if(input.equals("cardNumber")) {
        	outPut=faker.number().digits(16);
        } else if(input.equals("nameOnCard")) {
        	outPut=faker.name().fullName().replace("'", "");
        	
        } 
        else if(input.equals("expirationMonth")) {
        	//outPut=faker.number().digit();
        	outPut="5";
        } 
        else if(input.equals("expirationYear")) {
        	//outPut=faker.date().birthday(2031, 2042,"year");
		outPut="2023";  
		
        } else if(input.equals("securityCode")) {
        	outPut=faker.number().digits(3);       	
        			
        	
        } else if(input.equals("review")) {
        	outPut=faker.expression("fs???????????");     
        	

        } else 
		//outPut=faker.expression(outPut);
		// add any other information based on form that needed to be filled
		
	
		return outPut;
		return outPut;
		
	
	}

}
