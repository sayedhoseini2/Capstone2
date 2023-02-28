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
	}

	public static String data(String input) {
		// TODO Auto-generated method stub
	
		
		Faker faker = new Faker();
		String outPut ="";
		if (input.equals("firstName")) {
			outPut=faker.name().firstName();
		}
		else if (input.equals("lastName")){
		    outPut=faker.name().lastName();
	}
		else if (input.equals("email")) {
		//outPut=faker.name().firstName()+ "." +faker.name().lastName() +"@tekschool.us";
		outPut=faker.expression("#{letterify '???.????@tekschool.us'}");
	}
	else if(input.equals("phoneNumber")) {
		outPut=faker.phoneNumber().cellPhone();
	}
	else if(input.equals("fullName")) {
		outPut=faker.name().firstName();
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
        } else 
		//outPut=faker.expression(outPut);
		// add any other information based on form that needed to be filled
		
	
		return outPut;
		return outPut;
	
	}

}
